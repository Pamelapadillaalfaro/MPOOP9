/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 *Clase que crea un cuadrilatero
 * @author alumno
 */
public class Cuadrilatero extends Poligono{
    private int alfa,beta;
    private float a,b;
    private float base,altura;
    /**
     * Constructor vacío
     */
    public Cuadrilatero() {
    }
    /**
     * Constructor con atributos
     * @param base Valor de la base del cuadilatero
     * @param altura Valor de la altura del cuadilatero
     */
    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    /**
     * Método para sacar el área de un cuadilatero
     * @return El valor del área del cuadilatero
     */
    @Override
    public float area() {
        return base*altura;
    }
    /**
     * Método para sacar el perimetro de un cuadrilatero
     * @return El valor del perimetro cuadilatero
     */
    @Override
    public float perimetro() {
        return 2*base+2*altura;
    }
    public int getAlfa() {
        return alfa;
    }
    public int getBeta() {
        return beta;
    }
    public float getA() {
        return a;
    }
    public float getB() {
        return b;
    }
    public float getBase() {
        return base;
    }
    public float getAltura() {
        return altura;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Método que imprime los atributos del cuadrilatero
     * @return Atributos del cuadrilatero
     */
    @Override
    public String toString() {
        return super.toString()+"Cuadrilatero{" + '}';
    }
}
