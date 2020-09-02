package com.springboot.joc_de_daus.service;

import com.springboot.joc_de_daus.model.User;
import com.springboot.joc_de_daus.repository.IUserRepository;

import java.util.List;
import java.util.Optional;

public interface IUserService extends IUserRepository {

    List<User> findByIdUser(Integer id);


}
