package com.aninfo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cbu;
    private Double balance;
    /*@OneToMany(mappedBy="account")
    private List<Transaccion> transacciones;

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public List<Transaccion> setTransacciones() {
        return transacciones;
    }*/

    public Account(){
    }

    public Account(Double balance) {
        this.balance = balance;
    }

    public Long getCbu() {
        return cbu;
    }

    public void setCbu(Long cbu) {
        this.cbu = cbu;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}
