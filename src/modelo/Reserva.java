/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Delian
 */
public class Reserva {
    private int id;
    private Date fechaEntrada;
    private Date fechaSalida;
    private int valor;
    private String formaPago;

    public Reserva(Date fe, Date fs, int valor, String formaP) {
        this.fechaEntrada = fe;
        this.fechaSalida = fs;
        this.valor = valor;
        this.formaPago = formaP;
    }

    public Reserva(int id, Date fe, Date fs, int valor, String formap) {
        this.id = id;
        this.fechaEntrada = fe;
        this.fechaSalida = fs;
        this.valor = valor;
        this.formaPago = formap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    
}
