/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author USER
 */
public class Cliente {
    
    public static void main (String [] args){
        
        Cadastro Cadastro = new Cadastro();
        
        Cadastro.Nome = "Vitor";
        Cadastro.Email = "vitorcoelhocazuza@gmail.com";
        Cadastro.Telefone = "(11) 4002-8922";
        Cadastro.Quantidade = 5;
        Cadastro.ValorTotal = 550.99;
        
        System.out.println("Informações:");
        Cadastro.infoCliente();
        Cadastro.Comprar();
        Cadastro.infoCompra();
               
    }
}
