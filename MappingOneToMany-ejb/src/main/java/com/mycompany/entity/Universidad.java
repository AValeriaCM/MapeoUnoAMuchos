/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author angie
 */

@Entity
@Table(name = "universidad")
public class Universidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "extension")
    private String extension;
    @Column(name = "escudo")
    private String escudo;
    @OneToMany(mappedBy = "universidad", cascade = CascadeType.ALL)
    private List<Diplomado> listaDiplomados;
    
    /**
     * Constructor
     * @param id
     * @param nombre
     * @param extension
     * @param escudo 
     */
    public Universidad(int id, String nombre, String extension, String escudo) {
        this.id = id;
        this.nombre = nombre;
        this.extension = extension;
        this.escudo = escudo;
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
    public String getExtension() {
        return extension;
    }
    /**
     * 
     * @param extension 
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
    /**
     * 
     * @return 
     */
    public String getEscudo() {
        return escudo;
    }
    /**
     * 
     * @param escudo 
     */
    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
    /**
     * 
     * @return 
     */
    public List<Diplomado> getListaDiplomados() {
        return listaDiplomados;
    }
    /**
     * 
     * @param listaDiplomados 
     */
    public void setListaDiplomados(List<Diplomado> listaDiplomados) {
        this.listaDiplomados = listaDiplomados;
    }
    
    
    
}
