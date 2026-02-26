package exercicio3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Tarefa {
    
    public static void main(String[] args) {

        Projeto projeto = new Projeto();

        projeto.Nome = "Criar Site";
        projeto.Descricao = "Desenvolver Front-end";
        projeto.Entrega = "15/06/2026";
        projeto.Concluida = false;

        System.out.println("Informações");
        projeto.infoTarefa();
        projeto.concluirTarefa();
    }
}

