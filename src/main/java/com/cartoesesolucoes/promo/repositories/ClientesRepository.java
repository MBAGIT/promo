package com.cartoesesolucoes.promo.repositories;

import com.cartoesesolucoes.promo.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ClientesRepository extends JpaRepository<Clientes,Long> {


}

