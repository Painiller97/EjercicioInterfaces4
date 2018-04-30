/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciointerfaces4;

/**
 *
 * @author Daniel
 */
public class Revista extends Publicacion{
   private int numero;
  
   public Revista(String codigo, String titulo, int age, int numero) {
   super(codigo, titulo, age);
   this.numero = numero;
}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

   
    @Override
    public String toString() {
        return "Revista{" + "numero=" + numero + '}';
    }
   
   
}
