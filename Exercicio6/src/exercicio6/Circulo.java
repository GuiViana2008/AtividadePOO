/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio6;

/**
 *
 * @author USER
 */
public class Circulo {

    double raio;

    public double Area() {
        return Math.PI * raio * raio;
    }

    public double Perimetro() {
        return 2 * Math.PI * raio;
    }
}
