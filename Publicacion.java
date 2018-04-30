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
public class Publicacion {
    private String titulo;
    private String codigo;
    private int age;

    public Publicacion(String titulo, String codigo, int age) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.age = age;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "titulo=" + titulo + ", codigo=" + codigo + ", age=" + age + '}';
    }
    
    
            
}
