/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop9;

import actividadextra.ProfesorAsignatura;
import actividadextra.ProfesorCarrera;

/**
 *Clase principal
 * @author alumno
 */
public class MPOOP9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //    Poligono poligono=new Poligono();//No se pueden instanciar clases abstractas
        Triangulo triangulo=new Triangulo();
        System.out.println(triangulo);
        Cuadrilatero cuadrilatero= new Cuadrilatero();
        System.out.println(cuadrilatero);
        
        System.out.println(triangulo.getBase());
        Triangulo triangulo2=triangulo;//Apuntamos al mismo lugar en memoria y se pasa por referencia.
        System.out.println(triangulo2.getBase());
        triangulo2.setBase(9);
        System.out.println(triangulo2.getBase());
        System.out.println(triangulo.getBase());
        ProfesorAsignatura profeAlgebra=new ProfesorAsignatura();
        System.out.println(profeAlgebra);
        profeAlgebra.setNombreAsignatura("Algebra Lineal");
        System.out.println(profeAlgebra);
        profeAlgebra.pasarAlumnos();
        ProfesorCarrera profeCarr= new ProfesorCarrera();
        profeCarr.pasarAlumnos();
    }
    //Hacer todas las clases superiores y metodos son abstractos
    //Practica individual
}
