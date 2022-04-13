/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.entidades;

/**
 *
 * @author AXEL
 */
public class Caballo {
    private String apodo;
    private String raza;
    private String nombre;
    private String sexo;
    private String granja;

    public Caballo() {
    }
    
    public Caballo(String apodo, String raza, String nombre, String sexo, String granja) {
        this.apodo = apodo;
        this.raza = raza;
        this.nombre = nombre;
        this.sexo = sexo;
        this.granja = granja;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGranja() {
        return granja;
    }

    public void setGranja(String granja) {
        this.granja = granja;
    }

    @Override
    public String toString() {
        return "Caballo{" + "apodo=" + apodo + ", raza=" + raza + ", nombre=" + nombre + ", sexo=" + sexo + ", granja=" + granja + '}';
    }
    
    
}
