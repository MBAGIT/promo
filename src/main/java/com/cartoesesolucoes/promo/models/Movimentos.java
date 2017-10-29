package com.cartoesesolucoes.promo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Movimentos {



    @Id
    @SequenceGenerator(name = "movimentos_seq",sequenceName = "movimentos_seq")
    private Long id ;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
