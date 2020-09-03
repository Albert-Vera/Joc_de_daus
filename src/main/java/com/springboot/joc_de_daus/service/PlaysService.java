package com.springboot.joc_de_daus.service;

import com.springboot.joc_de_daus.model.Plays;
import com.springboot.joc_de_daus.repository.IPlayRepository;
import com.springboot.joc_de_daus.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Service
public class PlaysService implements IPlaysService{

    @Autowired
    private IPlayRepository repo;
    @Override
    public <S extends Plays> S save(S plays) {
        return repo.save(plays);
    }

    @Override
    public <S extends Plays> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Plays> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Plays> findAll() {
        return null;
    }

    @Override
    public Iterable<Plays> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Plays entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Plays> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
