package exercicio2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Hospede {
    public static void main(String[] args) {
            Reserva Hospede = new Reserva();
            
            Hospede.Nome = "Pietro";
            Hospede.Email = "Pietroantonio@gmail.com";
            Hospede.Telefone = "(11) 4002-8922";
            Hospede.QuantDias = 2;
            Hospede.Diaria = 2000;
            
           System.out.println("Informações:");
           Hospede.infoHospede();
           Hospede.valorTotal();
        }
}
