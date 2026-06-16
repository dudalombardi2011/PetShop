package main;

import entidades.GerenciadorPetShop;
import entidades.MenuConsole;
import java.util.Scanner;

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