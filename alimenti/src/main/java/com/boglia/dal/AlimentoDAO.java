package com.boglia.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boglia.entities.Alimento;

@Repository
public interface AlimentoDAO extends JpaRepository<Alimento, Integer> {

}
