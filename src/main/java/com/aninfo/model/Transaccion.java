package com.aninfo.model;

import javax.persistence.*;

@Entity
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /*@ManyToOne
    private Account account;*/
    private Long cbu;
    private Double montoTransaccion;
    private String tipoTransaccion;
    public Transaccion(){
    }


    public Double getMontoTransaccion() {
        return montoTransaccion;
    }

    public void setMontoTransaccion(Double montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public Long getCbu() {
        return cbu;
    }

    public void setCbu(Long cbu) {
        this.cbu = cbu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
