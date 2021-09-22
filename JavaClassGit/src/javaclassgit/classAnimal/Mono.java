/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclassgit.classAnimal;

/**
 *
 * @author presagio
 */
public class Mono {
    
    private String Nombre;
    private Integer Peso;
    private Integer fuerza;
    private Integer vida;

    public Mono() {
    }

    public Mono(String Nombre, Integer Peso, Integer fuerza, Integer vida) {
        this.Nombre = Nombre;
        this.Peso = Peso;
        this.fuerza = fuerza;
        this.vida = vida;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getPeso() {
        return Peso;
    }

    public void setPeso(Integer Peso) {
        this.Peso = Peso;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Mono{" + "Nombre=" + Nombre + ", Peso=" + Peso + ", fuerza=" + fuerza + ", vida=" + vida + '}';
    }
    
}
