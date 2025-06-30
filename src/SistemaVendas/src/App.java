import java.util.ArrayList;
import java.util.Scanner;

class Usuario {

    String nome;
    String email;
    String senha;

    Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    void mostrarUsuario() {
        System.out.println("Cadastro realizado com sucesso...");
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Senha: " + this.senha);
    }

    boolean validarLogin(String nomeLogin, String emailLogin, String senhaLogin) {
        return (this.nome.equals(nomeLogin) && this.email.equals(emailLogin) && this.senha.equals(senhaLogin));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

class Cliente {
    String nome;
    String cpf;
    String contato;

    Cliente(String nome, String cpf, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void mostrarCliente() {
        System.out.println("Cadastro do cliente realizado com sucesso...");
        System.out.println("Cliente: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Contato: " + this.contato);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}

class Produto {
    String nomeProduto;
    int estoque;
    int valorProduto;

    Produto(String nomeProduto, int estoque,int valorProduto) {
        this.nomeProduto = nomeProduto;
        this.estoque = estoque;
        this.valorProduto = valorProduto;
    }

    void mostrarProduto() {
        System.out.println("Produto: " + this.nomeProduto);
        System.out.println("Estoque: " + this.estoque);
        System.out.println("Valor: " + this.valorProduto);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(int valorProduto) {
        this.valorProduto = valorProduto;
    }
}

class Vendas{
    int quantidadeVendas;

    public Vendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    } 
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean verificacaoLogin = false;

        int indiceProduto = 1;
        int indiceCliente = 1;

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        // Cadastro do usuário
        System.out.println("-----------------------------------------");
        System.out.println("----------- Cadastro da conta -----------");
        System.out.println("-----------------------------------------");

        System.out.println("Digite seu nome de usuário:");
        String nome = sc.next();

        System.out.println("Digite seu email :");
        String email = sc.next();

        System.out.println("Digite sua senha:");
        String senha = sc.next();

        Usuario usuario = new Usuario(nome, email, senha);
        usuario.mostrarUsuario();

        // Login do usuário
        while (true) {
            System.out.println("------------------------------------------");
            System.out.println("------------- Login da conta -------------");
            System.out.println("------------------------------------------");

            System.out.println("Digite o nome do usuário:");
            String nomeLogin = sc.next();

            System.out.println("Digite o seu email:");
            String emailLogin = sc.next();

            System.out.println("Digite sua senha:");
            String senhaLogin = sc.next();

            // Validando login
            verificacaoLogin = usuario.validarLogin(nomeLogin, emailLogin, senhaLogin);
            if (verificacaoLogin) {
                System.out.println("Login realizado com sucesso");
            } else {
                System.out.println("Erro ao realizar o login");
            }

            while (verificacaoLogin) {
                System.out.println("---------------------------------------------------");
                System.out.println("----------- Acesso ao sistema realizado -----------");
                System.out.println("---------------------------------------------------");
                System.out.println("Digite 1 para produtos");
                System.out.println("Digite 2 para clientes");
                System.out.println("Digite 3 para vendas");
                System.out.println("Digite 4 para sair");
                int opcaoModulo = sc.nextInt();

                if (opcaoModulo == 1) {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("----------- Acesso ao sistema produtos realizado -----------");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Digite 1 para cadastrar o produto");
                    System.out.println("Digite 2 para visualizar todo estoque");
                    System.out.println("Digite 3 para alterar quantidade do produto");
                    System.out.println("Digite 4 para remover produto");
                    System.out.println("Digite 5 para sair do sistema");
                    int opcao = sc.nextInt();

                    if (opcao == 1) {
                        System.out.println("------------------------------------------------------");
                        System.out.println("----------- Realizando cadastro do produto -----------");
                        System.out.println("------------------------------------------------------");

                        System.out.println("Digite o nome do produto:");
                        String nomeProduto = sc.next();

                        System.out.println("Digite quantidade de estoque do produto:");
                        int estoque = sc.nextInt();

                        System.out.println("Digite o valor do produto:");
                        int valorProduto = sc.nextInt();

                        Produto produto = new Produto(nomeProduto, estoque,valorProduto);
                        produto.mostrarProduto();
                        listaProdutos.add(produto);
                        System.out.println("Cadastro do produto realizado com sucesso...");
                    } else if (opcao == 2) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("----------- Listando todos os produtos -----------");
                        System.out.println("--------------------------------------------------");

                        for (Produto produto : listaProdutos) {
                            produto.mostrarProduto();
                        }
                    } else if (opcao == 3) {
                        System.out.println("-------------------------------------------------------");
                        System.out.println("----------- Alterando quantidade do Produto -----------");
                        System.out.println("-------------------------------------------------------");

                        indiceProduto = 1;
                        for (Produto produto : listaProdutos) {
                            System.out.println("-------------------------------------------");
                            System.out.println("Produto " + indiceProduto);
                            produto.mostrarProduto();
                            indiceProduto +=1;
                        }

                        System.out.println("Digite o indice do produto que você quer alterar:");
                        int opProduto = sc.nextInt();

                        System.out.println("Digite a nova quantidade do produto:");
                        int quantidadeProduto = sc.nextInt();

                        indiceProduto = 1;
                        for (Produto produto : listaProdutos) {
                            if (indiceProduto == opProduto) {
                                produto.setEstoque(quantidadeProduto);
                            }
                            indiceProduto += 1;
                        }
                    } else if (opcao == 4) {
                        System.out.println("-----------------------------------------");
                        System.out.println("----------- Removendo Produto -----------");
                        System.out.println("-----------------------------------------");

                        indiceProduto = 1;
                        for (Produto produto : listaProdutos) {
                            System.out.println("-------------------------------------------");
                            System.out.println("Produto " + indiceProduto);
                            produto.mostrarProduto();
                            indiceProduto += 1;
                        }
                        System.out.println("Digite o indice do produto que quer remover:");
                        int removerProduto = sc.nextInt();

                        removerProduto-=1;
                        listaProdutos.remove(removerProduto);
                        System.out.println("Produto removido com sucesso...");

                    } else if (opcao == 5) {
                        System.out.println("Saindo do módulo produtos...");
                        break;
                    } else {
                        System.out.println("Opção inválida...");
                    }

                } else if (opcaoModulo == 2) {
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("----------- Acesso ao sistema de clientes realizado -----------");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Digite 1 para cadastrar cliente");
                    System.out.println("Digite 2 para visualizar clientes");
                    System.out.println("Digite 3 para alterar clientes");
                    System.out.println("Digite 4 para remover cliente");
                    System.out.println("Digite 5 para voltar ao módulo principal");
                    int opcao = sc.nextInt();

                    if (opcao == 1) {
                        System.out.println("------------------------------------------------------");
                        System.out.println("----------- Realizando cadastro do Cliente -----------");
                        System.out.println("------------------------------------------------------");

                        System.out.println("Digite o nome do cliente:");
                        String nomeCliente = sc.next();

                        System.out.println("Digite o cpf do cliente: ");
                        String cpf = sc.next();

                        System.out.println("Digite o cpf do cliente: ");
                        String contato = sc.next();

                        Cliente cliente = new Cliente(nomeCliente, cpf, contato);
                        cliente.mostrarCliente();
                        listaClientes.add(cliente);
                    } else if (opcao == 2) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("----------- Listando todos os Clientes -----------");
                        System.out.println("--------------------------------------------------");

                        for (Cliente cliente : listaClientes) {
                            cliente.mostrarCliente();
                        }
                    } else if (opcao == 3) {
                        System.out.println("-----------------------------------------");
                        System.out.println("----------- Alterando Cliente -----------");
                        System.out.println("-----------------------------------------");

                        indiceCliente = 1;
                        for (Cliente cliente : listaClientes) {
                            System.out.println("-------------------------------------------");
                            System.out.println("Cliente " + indiceCliente);
                            cliente.mostrarCliente();
                            indiceCliente += 1;
                        }

                        System.out.println("Digite o indice do cliente que você quer alterar:");
                        int opCliente = sc.nextInt();

                        System.out.println("Digite o novo contato:");
                        String contatoCliente = sc.next();

                        indiceCliente = 1;
                        for (Cliente cliente : listaClientes) {
                            if (indiceCliente == opCliente) {
                                cliente.setContato(contatoCliente);
                            }
                            indiceCliente += 1;
                        }
                    } else if (opcao == 4) {
                        System.out.println("-----------------------------------------");
                        System.out.println("----------- Removendo Cliente -----------");
                        System.out.println("-----------------------------------------");

                        indiceCliente = 1;
                        for (Cliente cliente : listaClientes) {
                            System.out.println("-------------------------------------------");
                            System.out.println("Cliente " + indiceCliente);
                            indiceProduto += 1;
                        }
                        System.out.println("Digite o indice do cliente que quer remover:");
                        int removerCliente = sc.nextInt();

                        removerCliente-=1;
                        listaClientes.remove(removerCliente);
                        System.out.println("Cliente removido com sucesso...");

                    } else if (opcao == 5) {
                        System.out.println("Saindo do módulo cliente...");
                        break;
                    } else {
                        System.out.println("Opção inválida...");
                    }

                } else if (opcaoModulo == 3) {
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("----------- Acesso ao sistema de vendas realizado -----------");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Digite 1 para cadastrar vendas");
                    System.out.println("Digite 2 para visualizar vendas");
                    System.out.println("Digite 3 para alterar vendas");
                    System.out.println("Digite 4 para remover vendas");
                    System.out.println("Digite 5 para voltar ao módulo principal");
                    int opcao = sc.nextInt();

                    if (opcao == 1) {
                        System.out.println("------------------------------------------------------");
                        System.out.println("----------- Realizando cadastro de Venda -----------");
                        System.out.println("------------------------------------------------------");

                        System.out.println("Digite o nome do cliente:");
                        String nomeCliente = sc.next();

                        System.out.println("Digite o cpf do cliente: ");
                        String cpf = sc.next();

                        System.out.println("Digite o cpf do cliente: ");
                        String contato = sc.next();

                        Cliente cliente = new Cliente(nomeCliente, cpf, contato);
                        cliente.mostrarCliente();
                        listaClientes.add(cliente);
                    } else if (opcao == 2) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("----------- Listando todos os Clientes -----------");
                        System.out.println("--------------------------------------------------");

                        for (Cliente cliente : listaClientes) {
                            cliente.mostrarCliente();
                        }
                    } else if (opcao == 3) {
                        System.out.println("-----------------------------------------");
                        System.out.println("----------- Alterando Cliente -----------");
                        System.out.println("-----------------------------------------");

                        indiceCliente = 1;
                        for (Cliente cliente : listaClientes) {
                            System.out.println("-------------------------------------------");
                            System.out.println("Cliente" + indiceCliente);
                            indiceCliente += 1;
                        }

                        System.out.println("Digite o indice do cliente que você quer alterar:");
                        int opCliente = sc.nextInt();

                        System.out.println("Digite o novo contato:");
                        String contatoCliente = sc.next();

                        indiceCliente = 1;
                        for (Cliente cliente : listaClientes) {
                            if (indiceCliente == opCliente) {
                                cliente.setContato(contatoCliente);
                            }
                            indiceCliente += 1;
                        }
                    } else if (opcao == 4) {
                        System.out.println("-----------------------------------------");
                        System.out.println("----------- Removendo Cliente -----------");
                        System.out.println("-----------------------------------------");

                        indiceCliente = 1;
                        for (Cliente cliente : listaClientes) {
                            System.out.println("-------------------------------------------");
                            System.out.println("Cliente" + indiceCliente);
                            indiceProduto += 1;
                        }
                        System.out.println("Digite o indice do cliente que quer remover:");
                        int removerCliente = sc.nextInt();

                        removerCliente--;

                    } else if (opcao == 5) {
                        System.out.println("Saindo do módulo vendas...");
                        break;
                    } else {
                        System.out.println("Opção inválida...");
                    }

                } else if (opcaoModulo == 4) {
                    System.out.println("Saindo do sistema");
                    break;
                } else {
                    System.out.println("Opção inválida...");
                }
            }
        }
    }
}
