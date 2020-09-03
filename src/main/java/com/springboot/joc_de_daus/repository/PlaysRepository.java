package com.springboot.joc_de_daus.repository;

import com.springboot.joc_de_daus.model.Plays;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PlaysRepository implements IPlayRepository{
    @Override
    public <S extends Plays> S save(S plays) {
        return save(plays);
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
