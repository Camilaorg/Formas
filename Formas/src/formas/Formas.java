/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formas;

/**
 *
 * @author User
 */
public abstract class Formas {
private String nombre;

public Formas(String nombre){
    this.nombre =  nombre;
}
public abstract double calcularArea();

public String getNombre(){
    return nombre;
    
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
