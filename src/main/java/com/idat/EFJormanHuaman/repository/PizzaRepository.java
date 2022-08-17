package com.idat.EFJormanHuaman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFJormanHuaman.model.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}
