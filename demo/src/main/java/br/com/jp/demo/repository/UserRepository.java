package br.com.jp.demo.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.jp.demo.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
