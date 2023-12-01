/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba1.persistencia;

import com.mycompany.jpaprueba1.logic.Alumno;
import com.mycompany.jpaprueba1.logic.Carrera;
import com.mycompany.jpaprueba1.logic.Materia;
import com.mycompany.jpaprueba1.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nosaka
 */
public class ControladoraPersistencia {
    AlumnoJpaController alum = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
    MateriaJpaController ma = new MateriaJpaController();

    public void crearAlumno(Alumno alu) {
        alum.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            alum.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            alum.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return alum.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        
        List <Alumno> listita = alum.findAlumnoEntities();
        ArrayList <Alumno> listaAlumnos = new ArrayList <Alumno> (listita);
        return listaAlumnos;
    }

    
    //Carrera
    
    public void crearCarrera(Carrera carre) {
        carreJpa.create(carre);
    }

    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJpa.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreJpa.findCarrera(id);        
    }

    public ArrayList<Carrera> traerListaCarrera() {
        List <Carrera> listita = carreJpa.findCarreraEntities();
        ArrayList <Carrera> listaCarrera = new ArrayList <Carrera> (listita);
        return listaCarrera;
    }

    public void crearMateria(Materia mate) {
        ma.create(mate);
    }

    public void eliminarMateria(int id) {
        try {
            ma.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia mate) {
        try {
            ma.edit(mate);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
       return ma.findMateria(id);
    }

    public LinkedList<Materia> traerListaMaterias() {
        List <Materia> listita = ma.findMateriaEntities();
        LinkedList <Materia> listaMaterias = new LinkedList <Materia> (listita);
        return listaMaterias;
    }
}
