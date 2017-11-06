package com.cartoesesolucoes.promo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cartoesesolucoes.promo.models.Movimentos;

public interface IMovimentosRepository extends JpaRepository<Movimentos, Long> {

}
