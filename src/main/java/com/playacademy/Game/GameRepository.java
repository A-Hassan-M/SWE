package com.playacademy.Game;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface GameRepository <T> 
extends CrudRepository<T, Long>{

}
