/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio5;

public class LocadoradeVeiculos {
    
    Veiculos veiculo;
    int dias;

    public double calcularTotal() {
        return veiculo.valorDiaria * dias;
    }

    public void mostrarResumo() {
        System.out.println("Modelo do veículo: " + veiculo.modelo);
        System.out.println("Valor da diária: R$ " + veiculo.valorDiaria);
        System.out.println("Dias alugados: " + dias);
        System.out.println("Valor total: R$ " + calcularTotal());
    }
}