package com.cartoesesolucoes.promo.repositories;


import java.util.List;
import java.util.Optional;

import com.cartoesesolucoes.promo.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cartoesesolucoes.promo.models.Movimentos;

public interface IMovimentosRepository extends JpaRepository<Movimentos, Long> {
	
	Optional<List<Movimentos>> findByClientes(Clientes clientes);

}
