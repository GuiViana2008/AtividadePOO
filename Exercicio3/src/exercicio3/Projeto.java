/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

public class Projeto {
    
    String Nome;
    String Descricao;
    String Entrega;
    boolean Concluida;
    
    public void infoTarefa(){
    System.out.println("Tarefa: " + Nome + "\n" + "Descrição: " + Descricao);
    
    System.out.println("Prazo de entrega: " + Entrega);
        if(Concluida){
            System.out.println("Status: Concluída");
        }else{
            System.out.println("Status: Pendente");
        }
    }
    
    public void concluirTarefa(){
    Concluida = true;
    }
}
