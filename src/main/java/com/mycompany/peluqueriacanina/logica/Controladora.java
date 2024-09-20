/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

/**
 *
 * @author DREP
 */
public class Controladora {
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String raza, String color, String observaciones, String nombreDuenio, String celDuenio, String alergico, String atencion) {
    //creamos dueño asignamos sus valores
    Duenio duenio = new Duenio();
    duenio.setNombre(nombreDuenio);
    duenio.setCelDuenio(celDuenio);
    //creamos la masacota y creamos sus valores
    Mascota mascota = new Mascota();
    mascota.setNombre(nombreMascota);
    mascota.setRaza(raza);
    mascota.setColor(color);
    mascota.setAlergico(alergico);
    mascota.setAtencionEspecial(atencion);
    mascota.setObservaciones(observaciones);
    mascota.setDuenio(duenio);
    
    controladoraPersistencia.guardar(duenio,mascota);
    }
    
}
