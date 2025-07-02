
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
        System.out.println("---------------------------------------------------------------------");
        System.out.println("------------- Cadastro do usuário realizado com sucesso -------------");
        System.out.println("---------------------------------------------------------------------");
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
        System.out.println("---------------------------------------------------------------------");
        System.out.println("------------- Cadastro do cliente realizado com sucesso -------------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Nome: " + this.nome);
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

    Produto(String nomeProduto, int estoque, int valorProduto) {
        this.nomeProduto = nomeProduto;
        this.estoque = estoque;
        this.valorProduto = valorProduto;
    }

    void mostrarProduto() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("------------- Cadastro do produto realizado com sucesso -------------");
        System.out.println("---------------------------------------------------------------------");
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

    static class valorProduto {

        public valorProduto() {
        }
    }
}

class Venda {

    Produto produto;
    Cliente cliente;

    public Venda(Cliente cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;
    }

    void mostrarVenda() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("-------------- Cadastro da Venda realizado com sucesso --------------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Produto: " + this.produto.nomeProduto);
        System.out.println("Cliente: " + this.cliente.nome);
        System.out.println("Valor: R$" + this.produto.valorProduto);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean verificacaoLogin = false;

        int indiceProduto = 1;
        int indiceCliente = 1;
        int indiceVenda = 1;

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Cliente> listaVendas = new ArrayList<>();

        Cliente cliente = new Cliente("","","");
        Produto produto = new Produto("","","");

        clienteASerVendido = cliente;
        produtoASerVendido = produto;


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
            switch (opcaoModulo) {
                case 1 ->{
                        System.out.println("------------------------------------------------------------");
                        System.out.println("----------- Acesso ao sistema produtos realizado -----------");
                        System.out.println("------------------------------------------------------------");
                        System.out.println("Digite 1 para cadastrar o produto");
                        System.out.println("Digite 2 para visualizar todo estoque");
                        System.out.println("Digite 3 para alterar quantidade do produto");
                        System.out.println("Digite 4 para remover produto");
                        System.out.println("Digite 5 para sair do sistema");
                        int opcao = sc.nextInt();
                        }
                switch (opcao) {
                    case 1 -> {
                        System.out.println("------------------------------------------------------");
                        System.out.println("----------- Realizando cadastro do produto -----------");
                        System.out.println("------------------------------------------------------");
                        System.out.println("Digite o nome do produto:");
                        String nomeProduto = sc.next();
                        System.out.println("Digite quantidade de estoque do produto:");
                        int estoque = sc.nextInt();
                        System.out.println("Digite o valor do produto:");
                        int valorProduto = sc.nextInt();
                        Produto produto = new Produto(nomeProduto, estoque, valorProduto);
                        produto.mostrarProduto();
                        listaProdutos.add(produto);
                    }
                    case 2 -> {
                        System.out.println("--------------------------------------------------");
                        System.out.println("----------- Listando todos os produtos -----------");
                        System.out.println("--------------------------------------------------");
                        for (Produto produto : listaProdutos) {
                            produto.mostrarProduto();
                        }
                    }
                    case 3 -> {
                        System.out.println("-------------------------------------------------------");
                        System.out.println("----------- Alterando quantidade do Produto -----------");
                        System.out.println("-------------------------------------------------------");
                        indiceProduto = 1;
                        for (Produto produto : listaProdutos) {
                            System.out.println("-------------------------------------------");
                            System.out.println("Produto " + indiceProduto);
                            produto.mostrarProduto();
                            indiceProduto += 1;
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
                    }
                    case 4 -> {
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
                        removerProduto -= 1;
                        listaProdutos.remove(removerProduto);
                        System.out.println("Produto removido com sucesso...");
                    }
                    case 5 -> {
                        System.out.println("Saindo do módulo produtos...");
                    }
                    default -> System.out.println("Opção inválida...");
                }
                    }
                case 2 ->{
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("----------- Acesso ao sistema de clientes realizado -----------");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("Digite 1 para cadastrar cliente");
                        System.out.println("Digite 2 para visualizar clientes");
                        System.out.println("Digite 3 para alterar clientes");
                        System.out.println("Digite 4 para remover cliente");
                        System.out.println("Digite 5 para voltar ao módulo principal");
                        int opcao = sc.nextInt();
                }
                switch (opcao) {
                    case 1 -> {
                        System.out.println("------------------------------------------------------");
                        System.out.println("----------- Realizando cadastro do Cliente -----------");
                        System.out.println("------------------------------------------------------");
                        System.out.println("Digite o nome do cliente:");
                        String nomeCliente = sc.next();
                        System.out.println("Digite o cpf do cliente: ");
                        String cpf = sc.next();
                        System.out.println("Digite o contato do cliente: ");
                        String contato = sc.next();
                        Cliente cliente = new Cliente(nomeCliente, cpf, contato);
                        cliente.mostrarCliente();
                        listaClientes.add(cliente);
                    }
                    case 2 -> {
                        System.out.println("--------------------------------------------------");
                        System.out.println("----------- Listando todos os Clientes -----------");
                        System.out.println("--------------------------------------------------");
                        for (Cliente cliente : listaClientes) {
                            cliente.mostrarCliente();
                        }
                    }
                    case 3 -> {
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
                    }
                    case 4 -> {
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
                        removerCliente -= 1;
                        listaClientes.remove(removerCliente);
                        System.out.println("Cliente removido com sucesso...");
                    }
                    case 5 -> {
                        System.out.println("Saindo do módulo cliente...");
                    }
                    default -> System.out.println("Opção inválida...");
                }
                    }
                case 3 ->{
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("------------ Acesso ao sistema de vendas realizado ------------");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("Digite 1 para cadastrar vendas");
                        System.out.println("Digite 2 para visualizar vendas");
                        System.out.println("Digite 3 para alterar vendas");
                        System.out.println("Digite 4 para remover vendas");
                        System.out.println("Digite 5 para voltar ao módulo principal");
                        int opcao = sc.nextInt();
                        }
                switch (opcao){
                    case 1 -> {
                        System.out.println("------------------------------------------------------");
                        System.out.println("------------ Realizando registro de Venda ------------");
                        System.out.println("------------------------------------------------------");
                        indiceProduto = 1;
                        for (Produto produto : listaProdutos) {
                            System.out.println("Produto: " + indiceProduto);
                            produto.mostrarProduto();
                            indiceProduto ++;
                        }

                        System.out.println("Digite o indice do produto que quer registrar a venda: ");
                        int ProdutoVenda = sc.nextInt();
                        ProdutoVenda --;

                        indiceProduto= 0;

                        for (Produto produto : listaProdutos) {
                            if(indiceProduto : ProdutoVenda){
                                produtoASerVendido = produto;
                            }
                            indiceProduto++;
                        }

                        System.out.println("Digite o indice do produto que quer registrar a venda: ");
                        int ClienteVenda = sc.nextInt();
                        ClienteVenda --;

                        indiceCliente= 0;

                        for (Cliente cliente : listaClientes) {
                            if(indiceCliente : ClienteVenda){
                                clienteASerVendido = cliente;
                            }
                            indiceCliente++;
                        }

                        Venda venda = new Venda(produtoASerVendido,clienteAserVendido){
                            listaVendas.add(venda);
                        }
                    }
                    case 2 -> {
                        System.out.println("--------------------------------------------------");
                        System.out.println("------------ Listando todos as Vendas ------------");
                        System.out.println("--------------------------------------------------");
                        for (Venda venda : listaVendas) {
                            venda.mostrarVenda();
                        }
                    }
                    case 3 -> {
                        System.out.println("------------------------------------------");
                        System.out.println("------------ Alterando Vendas ------------");
                        System.out.println("------------------------------------------");
                        indiceVenda = 1;
                        for (Produto produto && Cliente cliente : listaVendas) {
                            System.out.println("-------------------------------------------");
                            System.out.println("Venda " + indiceVenda);
                            indiceVenda += 1;
                        }
                        System.out.println("Digite o indice da venda que você quer alterar:");
                        int opVenda = sc.nextInt();
                        System.out.println("Digite o novo produto:");
                        String produtoVenda = sc.next();
                        indiceVenda = 1;
                        for (Venda venda : listaVendas) {
                            if (indiceVenda == opVenda) {
                                venda.setVenda(produtoVenda);
                            }
                            indiceVenda += 1;
                        }
                    }
                    case 4 -> {
                        System.out.println("-----------------------------------------");
                        System.out.println("------------ Removendo Venda ------------");
                        System.out.println("-----------------------------------------");
                        indiceVenda = 1;
                        for (Venda venda : listaVendas) {
                            System.out.println("-------------------------------------------");
                            System.out.println("Venda" + indiceVenda);
                            indiceVenda += 1;
                        }
                        System.out.println("Digite o indice da venda que quer remover:");
                        int removerVenda = sc.nextInt();
                        removerVenda-= 1;
                    }
                    case 5 -> {
                        System.out.println("Saindo do módulo vendas...");
                    }
                    default -> {System.out.println("Opção inválida...");
                }
                
                case 4 -> {
                    System.out.println("Saindo do sistema");
                } 
                        
                default ->{
                    System.out.println("Opção inválida..."); 
                } 
            }
        }
        sc.close();
    }
}