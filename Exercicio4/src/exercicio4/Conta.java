/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

/**
 *
 * @author USER
 */
public class Conta {
    
    public static void main(String[] args) {

        Banco Banco = new Banco();

        Banco conta1 = new Banco();
        Banco conta2 = new Banco();

        conta1.Nome = "Guilherme Viana";
        conta1.Conta = 121566;
        conta1.Tipo = "Corrente";
        conta1.Saldo = 7665;

        conta2.Nome = "Rafael de Souza";
        conta2.Conta = 121446;
        conta2.Tipo = "Poupança";
        conta2.Saldo = 1250;


        System.out.println("Informações");

        conta1.mostrarConta();
        conta2.mostrarConta();
        conta1.depositar(500);
        conta1.sacar(100);
        conta1.transferir(conta2, 200);
        
    }
}
