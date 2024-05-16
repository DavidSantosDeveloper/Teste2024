package com.jogos.ecommerce.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jogos.ecommerce.domain.model.*;

public interface CargoRepository extends JpaRepository<Cargo,Long> {
    Cargo findById(long id);
}