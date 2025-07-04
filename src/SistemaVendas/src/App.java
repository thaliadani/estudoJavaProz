import java.util.ArrayList;
import java.util.Scanner;

class Usuario{
    String user;
    String senha;
    // Construtore para juntar as informações em um objeto
    Usuario(String user, String senha){
        // This significa "este registro"
        this.user = user;
        this.senha = senha;
    }

    // Função para mostrar informações de usuário
    // void significa "Sem retorno"
    void mostrarUsuario(){
        System.out.println("--------------------------------------------");
        System.out.println("------ Cadastro realizado com sucesso ------");
        System.out.println("--------------------------------------------");
        System.out.println("Usuario: " + this.user);
        System.out.println("Senha: " + this.senha);
    }
    // Função para retornar verdadeiro ou falso
    // Vendo se o login foi digitado corretamente para acessar a conta
    boolean validarLogin(String userLogin, String senhaLogin){
        return (this.user.equals(userLogin) && this.senha.equals(senhaLogin));
    }
}

class Produto{
    String nome;
    int estoque;

    Produto(String nome, int estoque){
        this.nome = nome;
        this.estoque = estoque;
    }

    void mostrarProduto(){
        System.out.println("--------------------------------------------");
        System.out.println("----- Cadastro de produto com sucesso ------");
        System.out.println("--------------------------------------------");
        System.out.println("Produto: " + this.nome);
        System.out.println("Estoque: " + this.estoque);
    }
    // GET signifca buscar
    // Tipo de retorno de acordo com o tipo de dado a ser retornado
    public String getNome() {
        return nome;
    }
    // SET para alteração de informação
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}

class Cliente{
    String nome;
    String cpf;
    String contato;
    
    public Cliente(String nome, String cpf, String contato) {
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

class Venda{
    Produto produto;
    Cliente cliente;

    
}

public class App {
    public static void main(String[] args) throws Exception {
        // Declarando scanner "sc" para poder receber informações digitadas
        Scanner sc = new Scanner(System.in);
        boolean verificacaoLogin = false;
        int indiceProduto = 1;
        // ArrayList para podemos adicionar vários produtos no sistema
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        System.out.println("----------------------------------------------");
        System.out.println("------ Realizando cadastro de sua conta ------");
        System.out.println("----------------------------------------------");
        // Coletando dados do usuário - @ e senha
        System.out.println("Digite seu novo usuário");
        String user = sc.next();
        System.out.println("Digite sua nova senha");
        String senha = sc.next();
        // Chamando o construtor de Usuario para fazer o registro
        Usuario usuario = new Usuario(user, senha);
        // Chamando a função de mostrar as informações para o 
        // usuário que acabou de ser cadastrado
        usuario.mostrarUsuario();

        // Adicionando repetição para várias tentativas de login
        while(true){
            // Realizar validação de login
            System.out.println("------------------------------");
            System.out.println("------ Realizando login ------");
            System.out.println("-------------------------------");
            System.out.println("Digite seu nome de usuário: ");
            String userLogin = sc.next();
            System.out.println("Digite sua senha de acesso: ");
            String senhaLogin = sc.next();

            // Validação do login
            verificacaoLogin = usuario.validarLogin(userLogin, senhaLogin);
            if(verificacaoLogin){
                System.out.println("Login realizado com sucesso");
                // Break para parar a repetição (apenas momentaneamente)
                break;
            }else{
                System.out.println("Cadastro inválido, Digite novamente: ");
            }
        }

        // Sistema para cadastro de produto
        while(verificacaoLogin){
            System.out.println("----------------------------------------------");
            System.out.println("--------- Acesso ao sistema realizado --------");
            System.out.println("----------------------------------------------");
            System.out.println("Digite 1 para entrar no módulo de produto");
            System.out.println("Digite 2 para entrar no módulo de cliente");
            System.out.println("Digite 3 para sair");
            System.out.println("Digite a opção que deseja realizar:");
            int opModulo = sc.nextInt();

            // Condicional para os módulos do sistema
            if(opModulo==1){
                // Módulo produto
                System.out.println("Digite 1 para cadastrar produto");
                System.out.println("Digite 2 para visualizar todo o estoque");
                System.out.println("Digite 3 para alterar estoque");
                System.out.println("Digite 4 para excluir produto");
                System.out.println("Digite 5 para sair do sistema");
                int opcao = sc.nextInt();
                // Adicionar opção de excluir produto
                if(opcao == 1){
                    System.out.println("----------------------------------------------");
                    System.out.println("------- Realizando cadastro de produto -------");
                    System.out.println("----------------------------------------------");
                    // Coletando dados do usuário - @ e senha
                    System.out.println("Digite o nome do produto");
                    String nome = sc.next();
                    System.out.println("Digite a quantidade do estoque");
                    int estoque = sc.nextInt();
                    // Chamando o construtor de Produto para fazer o registro
                    Produto produto = new Produto(nome, estoque);
                    produto.mostrarProduto();
                    listaProdutos.add(produto);
                }else if(opcao == 2){
                    System.out.println("----------------------------------------------");
                    System.out.println("--------- Listando todos os produtos ---------");
                    System.out.println("----------------------------------------------");
                    for(Produto produto : listaProdutos){
                        produto.mostrarProduto();
                    }
                }else if(opcao == 3){
                    // Antes de alterarmos o produto, precisamos mostrar todos na tela para o usuário escolher
                    // O índiceProduto vai servir apenas para mostrar o número de cada produto Ex: 1, 2, 3...
                    indiceProduto = 1;
                    // Percorrendo toda a lista de produtos para mostrar na tela
                    for(Produto produto : listaProdutos){
                        System.out.println("-------------------------------------------");
                        System.out.println("Produto: " + indiceProduto);
                        produto.mostrarProduto();
                        indiceProduto += 1;
                    }
                    // Recebendo qual produto vamos alterar e a quantidade dele
                    System.out.println("Digite o índice do produto que você quer alterar:");
                    int opProduto = sc.nextInt();
                    System.out.println("Digite a nova quantidade do produto");
                    int quantidadeProduto = sc.nextInt();

                    // Mesma repetição que temos acima, mas agora para alterar o valor
                    indiceProduto = 1;
                    // Percorrendo toda a lista de produtos para mostrar na tela
                    for(Produto produto : listaProdutos){
                        if(indiceProduto == opProduto){
                            // Chamando método set para alterar o valor do estoque
                            produto.setEstoque(quantidadeProduto);
                        }
                        indiceProduto += 1;
                    }
                }else if(opcao == 4){
                    // Excluir produto
                    // Antes de excluirmos o produto, precisamos mostrar todos na tela para o usuário escolher
                    // O índiceProduto vai servir apenas para mostrar o número de cada produto Ex: 1, 2, 3...
                    indiceProduto = 1;
                    // Percorrendo toda a lista de produtos para mostrar na tela
                    for(Produto produto : listaProdutos){
                        System.out.println("-------------------------------------------");
                        System.out.println("Produto: " + indiceProduto);
                        produto.mostrarProduto();
                        indiceProduto += 1;
                    }
                    System.out.println("Digite o índice do produto que você quer remover:");
                    int removerProduto = sc.nextInt();
                    // A lista começa a contar da posição zero, então vamos diminuir um número 
                    // do que o usuário escolher, para pegarmos a posição correta
                    removerProduto = removerProduto - 1;
                    // Removendo uma posição específica com o método remove
                    listaProdutos.remove(removerProduto);
                    System.out.println("Produto removido com sucesso");
                }else if(opcao == 5){
                    System.out.println("Saindo do programa...");
                    break;
                }else{
                    System.out.println("opção inválida");
                }
            }else if(opModulo == 2){
                // Módulo cliente
                System.out.println("Digite 1 para cadastrar cliente");
                System.out.println("Digite 2 para visualizar todos os clientes");
                System.out.println("Digite 3 para sair do módulo cliente");
                int opcaoCliente = sc.nextInt();
                if( opcaoCliente == 1){
                    System.out.println("Cadastrando cliente");
                    System.out.println("Digite o nome do Cliente");
                    String nomeCliente = sc.next();
                    System.out.println("Digite o CPF do cliente");
                    String cpf = sc.next();
                    System.out.println("Digite o telefone de contato");
                    String contato = sc.next();
                    // Chamando o construtor de Produto para fazer o registro
                    Cliente cliente = new Cliente(nomeCliente, cpf, contato);
                    listaClientes.add(cliente);
                }else if(opcaoCliente == 2){
                    // Adcionar a função de Visualizar todos os clientes
                    System.out.println("Visualizando clientes");
                }else{
                    System.out.println("Saindo do sistema");
                }
            }
else if(opModulo == 3){
                System.out.println("Registrando venda...");

                // Recebendo produto a ser vendido
                System.out.println("Selecione o produto que deseja registrar a venda");
                indiceProduto = 1;
                    // Percorrendo toda a lista de produtos para mostrar na tela
                    for(Produto produto : listaProdutos){
                        System.out.println("-------------------------------------------");
                        System.out.println("Produto: " + indiceProduto);
                        produto.mostrarProduto();
                        indiceProduto += 1;
                    }
                System.out.println("Digite o índice do produto que você deseja registrar a venda");
                int produtoVenda = sc.nextInt();
                produtoVenda -= 1;
                // Acessar o produto específico par vender
                // indice produto é o contador da posicao de cada elemento da lista
                indiceProduto = 0;
                // produto venda é o produto escolhido pelo usuário
                for(Produto produto : listaProdutos){
                    // Se a posição da lista foi a posição escolhida pelo usuário, nós vamos pegar
                    // o valor de produto
                    if (indiceProduto == produtoVenda){
                        produtoASerVendido = produto;
                    }
                    indiceProduto += 1;
                }


                // Recebendo o Cliente a registrar a venda
                System.out.println("Selecione o produto que deseja registrar a venda");
                int indiceCliente = 1;
                    // Percorrendo toda a lista de produtos para mostrar na tela
                    for(Cliente cliente : listaClientes){
                        System.out.println("-------------------------------------------");
                        System.out.println("Cliente: " + indiceCliente);
                        cliente.mostrarCliente();
                        indiceCliente += 1;
                    }
                System.out.println("Digite o índice do produto que você deseja registrar a venda");
                int clienteVenda = sc.nextInt();
                clienteVenda -= 1;
                
                // Acessar o Cliente específico par vender
                // indice Cliente é o contador da posicao de cada elemento da lista
                indiceCliente = 0;
                // Cliente venda é o Cliente escolhido pelo usuário
                for(Cliente cliente : listaClientes){
                    // Se a posição da lista foi a posição escolhida pelo usuário, nós vamos pegar
                    // o valor de Cliente
                    if (indiceCliente == clienteVenda){
                        clienteASerVendido = cliente;
                    }
                    indiceCliente += 1;
                }

                Venda venda = new Venda(produtoASerVendido, clienteASerVendido);
                listaVendas.add(venda);
            }
            
        }
        sc.close();
    }
}