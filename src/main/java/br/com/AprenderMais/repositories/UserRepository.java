package br.com.AprenderMais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.AprenderMais.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{}
