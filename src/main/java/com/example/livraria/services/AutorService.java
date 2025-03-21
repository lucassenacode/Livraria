package com.example.livraria.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.livraria.entities.Autor;
import com.example.livraria.repositories.AutorRepository;

@Service
public class AutorService {

     @Autowired
    private AutorRepository repository;


    public Autor create(Autor obj)
    {
       return  repository.save(obj);
    }

    public void delete( long id)
    {
        repository.deleteById(id);
    }

    public Autor getId(Long id)
    {
        Optional<Autor> obj = repository.findById(id);
        return obj.get();
    }

    public List<Autor> getAll()
    {
        return repository.findAll();
    }

    public Autor update(Autor obj)
    {
        Optional<Autor> newObj = repository.findById(obj.getId());
        updateAutor(newObj, obj);
        return repository.save(newObj.get());
    }

    public void updateAutor (Optional<Autor> newObj, Autor obj )
    {
        newObj.get().setNome(obj.getNome());
    }
}
