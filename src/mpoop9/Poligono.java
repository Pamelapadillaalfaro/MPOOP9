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
    /**
     * Método para sacar el área
     * @return Valor del área
     */
    public abstract float area();
    /**
     * Método para sacar el perímetro
     * @return Valor del perímetro
     */
    public abstract float perimetro();//Indica que deben haber metodos en los hijos que se llamen asi
    //Icono en blanco representa que es abstracto
    /**
     * Método que imprime los atributos del poligono
     * @return Atributos del poligono
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
