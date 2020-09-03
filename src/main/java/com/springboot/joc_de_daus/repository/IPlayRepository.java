package com.springboot.joc_de_daus.repository;

import com.springboot.joc_de_daus.model.Plays;
import org.springframework.data.repository.CrudRepository;

public interface IPlayRepository  extends CrudRepository<Plays,Integer> {
}
