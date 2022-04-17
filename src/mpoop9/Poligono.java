/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 *Clase que crea un poligono
 * @author alumno
 */
public abstract class Poligono {//Es abstracto porque no es necesario que se le de una funcionalidad.
    public abstract float area();
    public abstract float perimetro();//Indica que deben haber metodos en los hijos que se llamen asi
    //Icono en blanco representa que es abstracto
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
