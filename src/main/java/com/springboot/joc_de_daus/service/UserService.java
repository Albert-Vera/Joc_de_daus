package com.springboot.joc_de_daus.service;

import com.springboot.joc_de_daus.model.User;
import com.springboot.joc_de_daus.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository repo;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public <S extends User> S save(S user) {
        return repo.save(user);
    }

    @Override
    public <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<User> findById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<User> findByIdUser(Integer id) {
        return repo.findByIdUser(id);
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<User> findAllById(Iterable<Integer> integers) {
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
    public void delete(User entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends User> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
