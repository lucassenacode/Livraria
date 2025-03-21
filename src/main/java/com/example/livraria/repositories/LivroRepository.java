package com.example.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.livraria.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
