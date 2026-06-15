package main;

import entidades.GerenciadorPetShop;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorPetShop petGremio = new GerenciadorPetShop();

        petGremio.carregarDadosIniciais();

        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n==================================");
            System.out.println("       SISTEMA PET SHOP           ");
            System.out.println("==================================");
            System.out.println("1 - Incluir (Cadastros)");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Listar (Relatórios)");
            System.out.println("5 - Buscar por Atributo");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- MENU INCLUIR ---");
                    // gerenciador.incluirDados(sc);
                    break;
                case 2:
                    System.out.println("\n--- MENU ALTERAR ---");
                    break;
                case 3:
                    System.out.println("\n--- MENU EXCLUIR ---");
                    break;
                case 4:
                    System.out.println("\n--- MENU LISTAR ---");
                    break;
                case 5:
                    System.out.println("\n--- MENU BUSCAR ---");
                    break;
                case 6:
                    System.out.println("\nSaindo do sistema... Até logo!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}