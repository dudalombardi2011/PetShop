package main;

import entidades.GerenciadorPetShop;
import entidades.MenuConsole;
import java.util.Scanner;

/**
 * Classe principal de execução do sistema
 * É responsável por inicializar o fluxo do programa, instanciar o gerenciador de dados,
 * disparar a carga de objetos de teste obrigatória e transferir o controle para a interface.
 */
public class Programa {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GerenciadorPetShop gerenciador = new GerenciadorPetShop();

        gerenciador.carregarDadosIniciais();

        MenuConsole menu = new MenuConsole(sc, gerenciador);

        menu.iniciarSistema();

        sc.close();
    }
}