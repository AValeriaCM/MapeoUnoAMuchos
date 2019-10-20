/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author angie
 */
@Entity
@Table

public class Estudiante implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private int id;
    @Column
    private String nombre;
    @Column
    private String cedula;
    @Column
    private String foto;
    @ManyToOne
    @JoinColumn(name = "diplomado_id", nullable = false)
    private Diplomado diplomado;
    
    /**
     * Constructor vacio
     */
    public Estudiante() {
    }
    /**
     * Constructor
     * @param nombre
     * @param cedula
     * @param foto
     * @param diplomado 
     */
    public Estudiante(String nombre, String cedula, String foto, Diplomado diplomado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.foto = foto;
        this.diplomado = diplomado;
    }
    
    
    /**
     * 
     * @return 
     */
    public int getId() {
        return id;
    }   
    /**
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return 
     */
    public String getCedula() {
        return cedula;
    }
    /**
     * 
     * @param cedula 
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    /**
     * 
     * @return 
     */
    public String getFoto() {
        return foto;
    }
    /**
     * 
     * @param foto 
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
    /**
     * 
     * @return 
     */
    public Diplomado getDiplomado() {
        return diplomado;
    }
    /**
     * 
     * @param diplomado 
     */
    public void setDiplomado(Diplomado diplomado) {
        this.diplomado = diplomado;
    }

    
    
    
}
