/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 *
 * @author User
 */
public class Triangulo  extends Formas {
     private double base;
     private double altura;
     
     public Triangulo (String nombre,double base, double altura){
         super(nombre);
         this.base = base;
         this.altura = altura;
         
     }
     public double calclarArea(){
         return 0.5 *base * altura;
     }

    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
