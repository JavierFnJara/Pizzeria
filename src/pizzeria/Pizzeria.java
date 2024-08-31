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
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido a la Pizzeria BonAppetit");
        
        Pizza pizza1 = new Pizza("Pepperoni", "grande", "gruesa");
        
        //ACCESADOR Y MUTADOR
        String nombre = pizza1.getNombre();
        System.out.println("Usted ha comprado una pizza "+ nombre);
        
        pizza1.setNombre("Hawaiana");
        String nombre new = 
        
    }
    
}
