/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;


/**
 *
 * @author groxa
 */

public class gato{
    private String nombre;
    private Integer peso;
    private Integer edad;

    public gato() {
    }

    public gato(String nombre, Integer peso, Integer edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "gato{" + "nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + '}';
    }
  
    
}
