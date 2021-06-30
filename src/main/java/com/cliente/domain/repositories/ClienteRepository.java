package com.cliente.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cliente.domain.models.Cliente;



public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
