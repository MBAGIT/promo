package com.cartoesesolucoes.promo.repositories;

import com.cartoesesolucoes.promo.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProdutosRepository extends JpaRepository<Produtos,Long> {
}
