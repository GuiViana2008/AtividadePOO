/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

/**
 *
 * @author USER
 */
public class Cadastro {
    
    String Nome;
    String Email;
    String Telefone;
    int Quantidade;
    double ValorTotal;
    
    public void infoCliente() {
       
         System.out.println("Cliente: " + Nome + "\n" + "E-mail: " + Email + "/n" + "Telefone: " + Telefone + "/n");
         
    }
    
    public void Comprar() {
       
         System.out.println("O valor total da sua compra foi de: R$ " + ValorTotal);

    }
    
    public void infoCompra() {
       
         System.out.println("O " + Nome + "realizou a compra de " + Quantidade + " produtos. O valor final foi " + ValorTotal);
    
    }
}
