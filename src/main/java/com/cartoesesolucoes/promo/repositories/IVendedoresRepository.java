package com.cartoesesolucoes.promo.repositories;


import com.cartoesesolucoes.promo.models.Vendedores;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IVendedoresRepository extends JpaRepository<Vendedores,Long> {
}

