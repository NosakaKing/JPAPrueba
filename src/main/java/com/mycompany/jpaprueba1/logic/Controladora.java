/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba1.logic;

import com.mycompany.jpaprueba1.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author nosaka
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno(int id){
        controlPersis.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    
    //Funcion metodo me devuelve alumno
    public Alumno traerAlumno(int id){
        
        return controlPersis.traerAlumno(id);
    }
    
    public ArrayList <Alumno> traerListaAlumnos(){
        return controlPersis.traerListaAlumnos();
    }
    
    // Carrera
    public void crearCarrera(Carrera carre){
        controlPersis.crearCarrera(carre);
    }
    
    public void eliminarCarrera(int id){
        controlPersis.eliminarCarrera(id);
    }
    
    public void editarCarrera(Carrera carre){
        controlPersis.editarCarrera(carre);
    }
    
    //Funcion metodo me devuelve alumno
    public Carrera traerCarrera(int id){
        
        return controlPersis.traerCarrera(id);
    }
    
    public ArrayList <Carrera> traerListaCarrera(){
        return controlPersis.traerListaCarrera();
    }
    
    // Materia
    
    public void crearMateria (Materia mate){
        controlPersis.crearMateria(mate);
    }
    public void eliminarMateria(int id){
        controlPersis.eliminarMateria(id);
    }
    
    public void editarMateria(Materia mate){
        controlPersis.editarMateria(mate);
    }
    public Materia traerMateria(int id){
        
        return controlPersis.traerMateria(id);
    }
    
    public LinkedList <Materia> traerListaMaterias(){
        return controlPersis.traerListaMaterias();
    }
}
