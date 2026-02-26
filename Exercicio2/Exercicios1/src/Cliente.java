/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Cliente {
    
    public static void main (String [] args){
        
        Cadastro Cadastro = new Cadastro();
        
        Cadastro.Nome = "Guilherme";
        Cadastro.Email = "guilhermevianasiqueiracim@gmail.com";
        Cadastro.Telefone = "(11) 99909-4923";
        Cadastro.Quantidade = 5;
        Cadastro.ValorTotal = 550.98;
        
        System.out.println("Informações:");
        Cadastro.infoCliente();
        Cadastro.Comprar();
        Cadastro.infoCompra();
    }
}
