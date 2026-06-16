package entidades;

import entidades.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Classe responsável por gerir toda a interface textual (console) do sistema.
public class MenuConsole {
    private Scanner sc;
    private GerenciadorPetShop gerenciador;

    public MenuConsole(Scanner sc, GerenciadorPetShop gerenciador) {
        this.sc = sc;
        this.gerenciador = gerenciador;
    }

    //MENU PRINCIPAL
   
    public void iniciarSistema() {
        int opcao = 0;
        while (opcao != 7) {
            System.out.println("\n==================================");
            System.out.println("       SISTEMA PET SHOP           ");
            System.out.println("==================================");
            System.out.println("1 - Incluir (Cadastros)");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Listar (Relatórios Tabulares)");
            System.out.println("5 - Buscar por Atributo");
            System.out.println("6 - Realizar Venda/Atendimento");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    exibirMenuIncluir();
                    break;
                case 2:
                    exibirMenuAlterar();
                    break;
                case 3:
                    exibirMenuExcluir();
                    break;
                case 4:
                    exibirMenuRelatorios();
                    break;
                case 5:
                    exibirMenuBuscar();
                    break;
                case 6:
                    realizarCompra();
                    break;
                case 7:
                    System.out.println("\n Terminando o sistema... Até logo!");
                    break;
                default:
                    System.out.println("\n Opção inválida! Tente novamente.");
            }
        }
    }

    //INCLUSÃO (CADASTROS)
    private void exibirMenuIncluir() {
        System.out.println("\n--- MENU INCLUIR ---");
        System.out.println("1 - Novo Cliente");
        System.out.println("2 - Novo Produto");
        System.out.println("3 - Voltar");
        System.out.print("Escolha: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 1) {
            cadastrarCliente();
        } else if (opcao == 2) {
            cadastrarProduto();
        }
    }

    private void cadastrarCliente() {
        System.out.println("\n--- CADASTRAR CLIENTE ---");
        System.out.print("ID do Cliente: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("CPF (números): ");
        int cpf = sc.nextInt();
        sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();

        Cliente novo = new Cliente(id, nome, cpf, email);
        gerenciador.cadastrarCliente(novo);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private void cadastrarProduto() {
        System.out.println("\n--- CADASTRAR PRODUTO ---");
        System.out.print("Código do Produto: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: R$ ");
        double valor = sc.nextDouble();
        sc.nextLine();
        System.out.print("Quantidade em Estoque: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        Produto novo = new Produto(nome, codigo, valor, qtd);
        gerenciador.cadastrarProduto(novo);
        System.out.println("Produto adicionado ao estoque!");
    }

    //ALTERAÇÃO
    private void exibirMenuAlterar() {
        System.out.println("\n--- SUBMENU ALTERAR ---");
        System.out.print("Digite o CPF do cliente para gerenciar: ");
        int cpf = sc.nextInt();
        sc.nextLine();

        Cliente cliente = gerenciador.buscarClientePorCpf(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        System.out.println("\n> " + cliente);
        System.out.println("1 - Alterar E-mail");
        System.out.println("2 - Gerenciar/Adicionar Animais");
        System.out.println("3 - Voltar");
        System.out.print("Escolha: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 1) {
            System.out.print("Novo E-mail: ");
            cliente.setEmail(sc.nextLine());
            System.out.println("E-mail atualizado!");
        } else if (opcao == 2) {
            gerenciarAnimaisCliente(cliente);
        }
    }

    private void gerenciarAnimaisCliente(Cliente cliente) {
        System.out.println("\n1 - Adicionar Novo Animal");
        System.out.println("2 - Alterar Animal Existente");
        System.out.print("Escolha: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 1) {
            System.out.print("ID do Animal: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome do Animal: ");
            String nome = sc.nextLine();
            System.out.print("Especie do Animal: ");
            String especie = sc.nextLine();
            System.out.print("Raça: ");
            String raca = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.println("Porte: 1-PEQUENO, 2-MÉDIO, 3-GRANDE");
            int porteOpcao = sc.nextInt();
            sc.nextLine();

            Porte porte;
            if (porteOpcao == 2) {
                porte = Porte.MEDIO;
            } else if (porteOpcao == 3) {
                porte = Porte.GRANDE;
            } else {
                porte = Porte.PEQUENO;
            }

            Animal novoAnimal = new Animal(id, nome, especie, raca, idade, porte);
            cliente.adicionarAnimal(novoAnimal);
            System.out.println("Animal vinculado ao cliente!");

        } else if (opcao == 2 && !cliente.getAnimais().isEmpty()) {
            ArrayList<Animal> animais = cliente.getAnimais();
            for (int i = 0; i < animais.size(); i++) {
                System.out.println((i+1) + " - " + animais.get(i));
            }
            System.out.print("Selecione o número do animal: ");
            int id = sc.nextInt() - 1;
            sc.nextLine();

            if (id >= 0 && id < animais.size()) {
                Animal a = animais.get(id);
                System.out.print("Novo Nome (ou Enter para manter): ");
                String Nome = sc.nextLine();
                if (!Nome.trim().isEmpty()) {
                    a.setNome(Nome);
                }
                System.out.println("Dados do animal atualizados!");
            }
        }
    }

    //REMOÇÃO
    private void exibirMenuExcluir() {
        System.out.println("\n--- SUBMENU EXCLUIR ---");
        System.out.println("1 - Excluir Cliente");
        System.out.println("2 - Excluir Produto do Estoque");
        System.out.println("3 - Voltar");
        System.out.print("Escolha: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 1) {
            System.out.print("Digite o CPF do cliente a remover: ");
            int cpf = sc.nextInt();
            sc.nextLine();
            Cliente cliente = gerenciador.buscarClientePorCpf(cpf);
            if (cliente != null) {
                gerenciador.getClientes().remove(cliente); //remov o cliente
                System.out.println("Cliente removido com sucesso!");
            } else { //se o cliente nao existir 
                System.out.println("Cliente não encontrado.");
            }
            //se quiser remover um produto:
        } else if (opcao == 2) {
            System.out.print("Digite o código do produto a remover: ");
            int codigo = sc.nextInt();
            sc.nextLine();
            Produto alvo = null;
            for (Produto p : gerenciador.getProdutos()) {
                if (p.getCodigo() == codigo) {
                    alvo = p;
                    break;
                } //verifica qual produto tem o codigo solicitado pelo cliente
            }
            if (alvo != null) {
                gerenciador.getProdutos().remove(alvo); //tira o produto do estoque 
                System.out.println("Produto removido do estoque!");
            } else {
                System.out.println("Produto não encontrado.");
            }
        }
    }

    //LISTAGEM
    private void exibirMenuRelatorios() {
        System.out.println("\n--- RELATÓRIOS ---");
        System.out.println("1 - Listar Clientes (Ordem Alfabética)");
        System.out.println("2 - Listar Produtos no Estoque");
        System.out.print("Escolha: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 1) {
            ArrayList<Cliente> listaClientes = new ArrayList<>(gerenciador.getClientes());
            // Ordenação por nome ignorando maiúsculas/minúsculas
            listaClientes.sort((c1, c2) -> c1.getNome().compareToIgnoreCase(c2.getNome()));

            System.out.println("\n=============================================================");
            System.out.printf("%-5s | %-20s | %-12s | %-15s\n", "ID", "NOME", "CPF", "E-MAIL");
            System.out.println("-------------------------------------------------------------");
            for (Cliente c : listaClientes) {
                System.out.println(c.toTableRow());
            }
            System.out.println("=============================================================");
        } else if (opcao == 2) {
            System.out.println("\n=============================================================");
            System.out.printf("%-8s | %-25s | %-12s | %-8s\n", "CÓDIGO", "PRODUTO", "PREÇO", "ESTOQUE");
            System.out.println("-------------------------------------------------------------");
            for (Produto p : gerenciador.getProdutos()) {
                System.out.println(p.toTableRow());
            }
            System.out.println("=============================================================");
        }
    }

    // BUSCA POR ATRIBUTO
    private void exibirMenuBuscar() {
        System.out.println("\n--- BUSCA DE REGISTROS ---");
        System.out.println("1 - Buscar Cliente por CPF");
        System.out.println("2 - Buscar Produto por Código");
        System.out.print("Escolha: ");
        int op = sc.nextInt();
        sc.nextLine();

        if (op == 1) {
            System.out.print("Digite o CPF: ");
            int cpf = sc.nextInt();
            sc.nextLine();
            Cliente c = gerenciador.buscarClientePorCpf(cpf);
            if (c != null) {
                System.out.println("\n> Cliente Encontrado:");
                System.out.println(c);
                //mostra os animais do cliente pesquisado
                System.out.println("Animais Vinculados:");
                for (Animal a : c.getAnimais()) {
                    System.out.println("  - " + a);
                }
            } else {
                System.out.println("Nenhum cliente cadastrado com este CPF.");
            }
        } else if (op == 2) {
            System.out.print("Digite o Código do Produto: ");
            int cod = sc.nextInt();
            sc.nextLine();
            Produto encontrado = null;
            for (Produto p : gerenciador.getProdutos()) {
                if (p.getCodigo() == cod) {
                    encontrado = p;
                    break;
                }
            }
            if (encontrado != null) {
                System.out.println("\n> Produto Encontrado:");
                System.out.println(encontrado);
            } else {
                System.out.println("Produto não encontrado.");
            }
        }
    }

    //VENDAS DE PRODUTOS E SERVIÇOS
    private void realizarCompra() {
        System.out.println("\n--- NOVA VENDA ---");
        System.out.print("Digite o CPF do Cliente: ");
        int cpf = sc.nextInt();
        sc.nextLine();

        //se o cliente nao existir 
        Cliente cliente = gerenciador.buscarClientePorCpf(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado! Cadastre-o primeiro.");
            return;
        }

        // Cria uma nova nota fiscal 
        int idCompra = gerenciador.getCompras().size() + 1;
        Compra novaCompra = new Compra(idCompra, java.time.LocalDateTime.now(), cliente, new ArrayList<>());

        boolean adicionando = true;
        while (adicionando) {
            System.out.println("\n--- CARRINHO DE COMPRAS ---");
            System.out.println("Total parcial: R$ " + novaCompra.calcularValorBruto());
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Adicionar Serviço (Banho/Tosa/Consulta)");
            System.out.println("3 - Ir para o Pagamento (Finalizar)");
            System.out.println("4 - Cancelar Venda");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Código do Produto: ");
                int codigo = sc.nextInt();
                sc.nextLine();

                Produto produtoEncontrado = null;
                for (Produto p : gerenciador.getProdutos()) {
                    if (p.getCodigo() == codigo) {
                        produtoEncontrado = p;
                        break;
                    }
                }

                if (produtoEncontrado != null) {
                    System.out.print("Quantidade desejada: ");
                    int qtd = sc.nextInt();
                    sc.nextLine();

                    if (produtoEncontrado.getQuantidadeEstoque() >= qtd) {
                        novaCompra.adicionarItem(new Item(produtoEncontrado, qtd));
                        produtoEncontrado.removeEstoque(qtd); // Baixa no estoque
                        System.out.println("Produto adicionado!");
                    } else {
                        System.out.println("Estoque insuficiente. Restam apenas " + produtoEncontrado.getQuantidadeEstoque() + " unidades.");
                    }//se ele solicitar uma quantidade maior do que o que tem no estoque
                } else {
                    System.out.println("Produto não encontrado.");
                }

            } else if (opcao == 2) {
                if (cliente.getAnimais().isEmpty()) { //se o cliente nao tiver animais 
                    System.out.println("[Aviso] Este cliente não possui animais para receber serviços.");
                } else {
                    System.out.println("Selecione o Pet que vai receber o serviço:");
                    for (int i = 0; i < cliente.getAnimais().size(); i++) {
                        System.out.println((i + 1) + " - " + cliente.getAnimais().get(i));
                    }
                    System.out.print("Número do Pet: ");
                    int id = sc.nextInt() - 1;
                    sc.nextLine();

                    if (id >= 0 && id < cliente.getAnimais().size()) {
                        Animal pet = cliente.getAnimais().get(id);
                        System.out.println("Qual serviço?");
                        System.out.println("1 - Banho\n2 - Tosa\n3 - Consulta Veterinária");
                        System.out.print("Opção: ");
                        int servicoOpcao = sc.nextInt();
                        sc.nextLine();

                        Servico servico = null;
                        if (servicoOpcao == 1) {
                            servico = new Banho(java.time.LocalDateTime.now(), pet);
                        } else if (servicoOpcao == 2) {
                            servico = new Tosa(java.time.LocalDateTime.now(), pet);
                        } else if (servicoOpcao == 3) {
                            servico = new ConsultaVeterinaria(java.time.LocalDateTime.now(), pet);
                        }

                        if (servico != null) {
                            novaCompra.adicionarServico(servico);
                            System.out.println("Serviço adicionado! (O valor considerou o porte do animal).");
                        }
                    }
                }

            } else if (opcao == 3) {
                System.out.println("\n--- TELA DE PAGAMENTO ---");
                System.out.println("1 - PIX (Gera 10% de Desconto)");
                System.out.println("2 - Cartão de Crédito (Gera 5% de Taxa)");
                System.out.print("Forma de Pagamento: ");
                int pagamentoOpcao = sc.nextInt();
                sc.nextLine();

                FormaPagamento forma;
                if (pagamentoOpcao == 1) {
                    forma = new PagamentoPix();
                } else {
                    forma = new PagamentoCartao();
                }

                novaCompra.finalizarCompra(forma);

                gerenciador.getCompras().add(novaCompra);
                System.out.println(novaCompra);
                System.out.println("Venda finalizada e guardada no histórico!");
                adicionando = false;

            } else if (opcao == 4) {
                System.out.println("Venda cancelada.");
                adicionando = false;
            }
        }
    }
}