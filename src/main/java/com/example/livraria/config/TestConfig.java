package com.example.livraria.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.livraria.entities.Autor;
import com.example.livraria.entities.Livro;
import com.example.livraria.repositories.AutorRepository;
import com.example.livraria.repositories.LivroRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private LivroRepository livroRepository;

    @Override
    public void run(String... args) throws Exception{

        Autor a1 = new Autor(null, "Lucas Sena");
        Autor a2 = new Autor(null, "Larissa Milhomens");

        autorRepository.saveAll(Arrays.asList(a1,a2));

        Livro l1 = new Livro(null, "Neuromancer", a1);
        Livro l2 = new Livro(null, "Blade Runner", a1);
        Livro l3 = new Livro(null, "Duna", a2);

        livroRepository.saveAll(Arrays.asList(l1,l2,l3));
    }
}
