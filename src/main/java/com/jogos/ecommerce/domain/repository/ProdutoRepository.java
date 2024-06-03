package com.jogos.ecommerce.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jogos.ecommerce.domain.dto.output.OUTPUT_ProdutoDTO;
import com.jogos.ecommerce.domain.model.*;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    Produto findById(long id);
    //os campos p.id,... se referem aos campos do objeto DTO, ja p é o apelido da tabela
    @Query("SELECT new com.jogos.ecommerce.domain.dto.output.OUTPUT_ProdutoDTO(p.id, p.nome, p.preco,p.foto_url,p.descricao,p.categoria) FROM Produto p")
    List<OUTPUT_ProdutoDTO> findAllProdutos();


}

