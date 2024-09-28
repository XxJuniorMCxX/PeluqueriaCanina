/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

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

    public List<Mascota> traerMascotas() {
        return controladoraPersistencia.traerMascotas();
   }

    public void borrarMascota(int num_cliente) {
        controladoraPersistencia.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controladoraPersistencia.traerMascota(num_cliente);
     }

    private Duenio buscarDuenio(int id_Dueno) {
        return controladoraPersistencia.traerDuenio(id_Dueno);
   }

    private void modificarDuenio(Duenio duenio) {
        controladoraPersistencia.modificarDuenio(duenio);
    }

    public void modificarMascota(Mascota mascota, String nombreMascota, String raza, String color, String observaciones, String nombreDuenio, String celDuenio, String alergico, String atencion) {
         //Modifico Mascota
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setObservaciones(observaciones);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencion);
        
        //Modifico Mascota
        controladoraPersistencia.modificarMascota(mascota);
        
        //Modifico Dueño
        Duenio duenio = this.buscarDuenio(mascota.getDuenio().getId_Dueno());
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        //Modificar 
        this.modificarDuenio(duenio);
    }


  
    
}
