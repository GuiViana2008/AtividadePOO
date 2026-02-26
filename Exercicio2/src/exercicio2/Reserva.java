/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

/**
 *
 * @author USER
 */
public class Reserva {
    
    String Nome;
    String Telefone;
    String Email;
    int QuantDias;
    double Diaria;
    
    public void infoHospede(){
     System.out.println
        ("Hospede: " + Nome + "\n" + "Telefone: " + Telefone + "\n" + "E-mail: " + Email );
    }
    
    public void valorTotal(){
        double total = QuantDias * Diaria;
        System.out.println("O valor Tatal: R$ " + total);
}
}
