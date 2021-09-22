/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclassgit.classAnimal;

/**
 *
 * @author piriv
 */
public class Pajaro {
    private String name;
    private Integer age;
    private Integer pluma;

    public Pajaro() {
    }

    public Pajaro(String name, Integer age, Integer pluma) {
        this.name = name;
        this.age = age;
        this.pluma = pluma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPluma() {
        return pluma;
    }

    public void setPluma(Integer pluma) {
        this.pluma = pluma;
    }

    @Override
    public String toString() {
        return "Pajaro{" + "name=" + name + ", age=" + age + ", pluma=" + pluma + '}';
    }
    
    
}
