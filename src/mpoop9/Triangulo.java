/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 *Clase que crea un triángulo
 * @author alumno
 */
public class Triangulo extends Poligono{
    private int alfa, beta, gamma;
    private float a,b,c;
    private float base, altura;
    /**
     * Constructor vacío
     */
    public Triangulo() {
    }
    /**
     * Constructor con atributos
     * @param base Valor de la base del triángulo
     * @param altura Valor de la altura del triángulo
     */
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    /**
     * Método para sacar el área de un triángulo
     * @return El valor del área del triángulo
     */
    @Override//se est asobreescribiendo
    public float area() {
        return (base*altura)/2;
    }
    /**
     * Método para sacar el perimetro de un triángulo
     * @return El valor del perimetro del triángulo
     */
    @Override
    public float perimetro() {
        return a+b+c; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int getAlfa() {
        return alfa;
    }
    public int getBeta() {
        return beta;
    }
    public int getGamma() {
        return gamma;
    }
    public float getA() {
        return a;
    }
    public float getB() {
        return b;
    }
    public float getC() {
        return c;
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
     * Método que imprime los atributos del triángulo
     * @return Atributos del triángulo
     */
    @Override
    public String toString() {
        return super.toString()+"Triangulo{" + '}';
    }
}
