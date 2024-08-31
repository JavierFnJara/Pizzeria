/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author CETECOM
 */
public class Pizza {
    //atributos
    private String nombre, tamaño, masa;

    //contructor con parametro
        public Pizza(String nombre, String tamaño, String masa) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.masa = masa;
    }

    //contructor sin parametro
    public Pizza() {
    }
    
    //metodos
    public void preparar (){
        System.out.println("Se esta preparando la Pizza");
    }
    
    //Accesadores y mutadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }
    
    //metodos 
    public void calentar (){
        System.out.println("Se esta horneando la Pizza");
    }
    
}
