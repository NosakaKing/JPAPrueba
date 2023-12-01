/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jpaprueba1;

import com.mycompany.jpaprueba1.logic.Alumno;
import com.mycompany.jpaprueba1.logic.Carrera;
import com.mycompany.jpaprueba1.logic.Controladora;
import com.mycompany.jpaprueba1.logic.Materia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author nosaka
 */
public class JpAPrueba1 {

    public static void main(String[] args) {

        Controladora control = new Controladora();
        
        // Creamos Lista de materias y la agregamos
        LinkedList <Materia> listaM = new LinkedList<Materia>();
        // Creacion Carrera con lista de materias
        Carrera carre = new Carrera (1, "Ingenieria de Software", listaM);
        
        //Guardado en la base de datos
        control.crearCarrera(carre);
        
        // Creacion Materias
        Materia mate1 = new Materia(1, "Programacion Orientada a Objetos I", "Normal", carre);
        Materia mate2 = new Materia(2, "Modelos Matematicos", "Practica", carre);
        Materia mate3 = new Materia(3, "Redes de Datos", "Arrastre", carre);

        // Guardarlos en la base de datos
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        
        // Agregar a la lista Materias
        listaM.add(mate1);
        listaM.add(mate2);
        listaM.add(mate3);
        
        // Creacion Carrera con lista de materias
        carre.setListaMaterias(listaM);
        control.editarCarrera(carre);

        //Creacion Alumno (con carrera)
        
        Alumno a12 = new Alumno(20, "Moises", "Loor",new Date(),carre);
        
        //Guardamos Alumno en BD
        
        control.crearAlumno(a12);
        
        //vemos el resultado
        
        System.out.println("-------------------------------------");
        System.out.println("-----------Datos Alumno--------------");
        Alumno alu = control.traerAlumno(20);
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre()); 
        Alumno alum = control.traerAlumno(20);
        System.out.println("------------------Busqueda Individual--------------");
        System.out.println("El alumno es: " + alu.toString() );
        
         System.out.println("------------------Busqueda de Todos--------------");
         ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
         for(Alumno al : listaAlumnos){
             System.out.println("El Alumno es: " + al.toString());
         }
         System.out.println("-----------------------------");
    }
}
