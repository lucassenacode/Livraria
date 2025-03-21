package com.example.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.livraria.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{

}
