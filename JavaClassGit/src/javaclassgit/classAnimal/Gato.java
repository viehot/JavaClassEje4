/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclassgit.classAnimal;

/**
 *
 * @author Cecy
 */
public class Gato {
    public String Raza;
    public Integer Edad;
    public String comida;
    public Integer peso;

    public Gato() {
    }

    public Gato(String Raza, Integer Edad, String comida, Integer peso) {
        this.Raza = Raza;
        this.Edad = Edad;
        this.comida = comida;
        this.peso = peso;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Gato{" + "Raza=" + Raza + ", Edad=" + Edad + ", comida=" + comida + ", peso=" + peso + '}';
    }
    
    
            
}
