
package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DREP
 */
@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Dueno;
    private String nombre;
    private String celDuenio;

    public Duenio() {
    }

    public Duenio(int id_Dueno, String nombre, String celDuenio) {
        this.id_Dueno = id_Dueno;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }

    public int getId_Dueno() {
        return id_Dueno;
    }

    public void setId_Dueno(int id_Dueno) {
        this.id_Dueno = id_Dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Due\u00f1o{" + "id_Dueno=" + id_Dueno + ", nombre=" + nombre + ", celDuenio=" + celDuenio + '}';
    }
    
    
}
