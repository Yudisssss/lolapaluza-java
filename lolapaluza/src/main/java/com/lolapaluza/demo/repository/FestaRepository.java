package com.lolapaluza.demo.repository;

import com.lolapaluza.demo.model.Festa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FestaRepository extends JpaRepository<Festa, Long> {

    boolean existsByName(String name);
}
