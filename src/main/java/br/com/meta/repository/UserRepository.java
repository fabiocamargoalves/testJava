package br.com.meta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.meta.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
