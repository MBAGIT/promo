package com.cartoesesolucoes.promo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartoesesolucoes.promo.models.Empresa;

public interface IEmpresaRepository extends JpaRepository<Empresa, Long>{

}
