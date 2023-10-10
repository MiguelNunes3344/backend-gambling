package com.spring.springangular.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.springangular.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
