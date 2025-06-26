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
        System.out.println("------ Cadastro realizado com sucesso ------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Senha: " + this.senha);
        System.out.println("--------------------------------------------");
    }

    boolean validarLogin(String nomeLogin, String emailLogin, String senhaLogin) {
        return (this.nome.equals(nomeLogin) && this.email.equals(emailLogin) && this.senha.equals(senhaLogin));
    }
}

class Produto(){
    String nome;
    int estoque;

    Produto(String nome, int estoque){
        this.nome = nome;
        this.estoque = estoque;
    }

    void mostrarProduto() {
        System.out.println("------ Cadastro do produto realizado com sucesso ------");
        System.out.println("Produto: " + this.nome);
        System.out.println("Estoque: " + this.estoque);
        System.out.println("--------------------------------------------");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean verificacaoLogin = false;

        ArrayList<Produto>listaProdutos = new ArrayList<>();

        // Cadastro do usuário
        System.out.println("----------- Cadastro da conta -----------");

        System.out.println("Digite o nome de usuário:");
        String nome = sc.next();

        System.out.println("Digite seu email :");
        String email = sc.next();

        System.out.println("Digite sua senha:");
        String senha = sc.next();

        System.out.println("-------------------------------------------");

        Usuario usuario = new Usuario(nome, email, senha);
        usuario.mostrarUsuario();

        // Login do usuário
        while (true) {
            System.out.println("------------- Login da conta -------------");

            System.out.println("Digite o nome do usuário:");
            String nomeLogin = sc.next();

            System.out.println("Digite o seu email:");
            String emailLogin = sc.next();

            System.out.println("Digite sua senha:");
            String senhaLogin = sc.next();

            System.out.println("-------------------------------------------");

            // Validando login
            verificacaoLogin = usuario.validarLogin(nomeLogin, emailLogin, senhaLogin);
            if (verificaoLogin) {
                System.out.println("Login realizado com sucesso");
                System.out.println("-------------------------------------------");
                break;
            } else {
                System.out.println("Erro ao realizar o login");
                System.out.println("-------------------------------------------");
            }

            while (verificacaoLogin) {
                System.out.println("----------- Acesso ao sistema realizado -----------");
                System.out.println("----------- Cadastro de Produto -----------");
                System.out.println("----------- Digite 1 para cadastrar o produto -----------");
                System.out.println("----------- Digite 2 para visualizar todo estoque -----------");
                System.out.println("----------- Digite 2 para sair do sistema -----------");
                int opcao = sc.nextInt();

                if(opcao == 1){
                    System.out.println("----------- Realizando cadastro do produto -----------");
                    
                    System.out.println("Digite o nome do produto:");
                    String nome = sc.next();

                    System.out.println("Digite quantidade de estoque:");
                    int estoque = sc.nextInt();
                    
                    Produto produto = new Produto(nome, estoque);
                    produto.mostrarProduto();
                    listaProdutos.add(produto);
                    System.out.println("-------------------------------------------");
                }else if(opcao == 2){
                    System.out.println("----------- Lista dos produtos -----------");
                    for(Produto produto:listaProdutos){
                        produto.mostrarProduto();
                    }
                    System.out.println("-------------------------------------------");
                }else{
                    System.out.println("----------- Saindo do sistema -----------");
                    break;
                }
            }
        }
    }
}
