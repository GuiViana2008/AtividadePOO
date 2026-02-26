/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios5;

public class Locacao {

    public static void main(String[] args) {

        Veiculos carro = new Veiculos();
        carro.modelo = "Porsche GT3 RS";
        carro.valorDiaria = 10000;

        LocadoradeVeiculos locacao = new LocadoradeVeiculos();
        locacao.veiculo = carro;
        locacao.dias = 5;

        locacao.mostrarResumo();
    }
}
