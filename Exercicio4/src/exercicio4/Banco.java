/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

/**
 *
 * @author USER
 */
public class Banco {

    String Nome;
    int Conta;
    String Tipo;
    double Saldo;

    
    public void mostrarConta() {
    System.out.println("Cliente: " + Nome);
    System.out.println("Número da Conta: " + Conta);
    System.out.println("Tipo da Conta: " + Tipo);
    System.out.println("Saldo: " + Saldo);
    }    
    
    public void depositar(double valor) {
        Saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (Saldo >= valor) {
            Saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(Banco destino, double valor) {
        if (Saldo >= valor) {
            Saldo -= valor;
            destino.Saldo += valor;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }
}
