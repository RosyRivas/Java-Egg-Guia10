/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Rosi-PC
 */
public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, String edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }
    
    public void alimentarse() {
        System.out.println("El perro se alimenta de: "+ super.getAlimento());
    }
    
}
