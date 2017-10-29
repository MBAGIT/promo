package com.cartoesesolucoes.promo.repositories;

import com.cartoesesolucoes.promo.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientesRepository extends JpaRepository<Clientes,Long> {
}

