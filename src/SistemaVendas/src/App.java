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
        return (this.nome.equals(nomeLogin) && this.email.equals(emailLogin) && this.senha.equals(senha));
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
        System.out.println("------ Cadastro realizado com sucesso ------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Estoque: " + this.estoque);
        System.out.println("--------------------------------------------");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean verificacaoLogin = false;

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
            if (usuario.validarLogin(nomeLogin, emailLogin, senhaLogin)) {
                System.out.println("Login realizado com sucesso");
                System.out.println("-------------------------------------------");
                break;
            } else {
                System.out.println("Erro ao realizar o login");
                System.out.println("-------------------------------------------");
            }

            while (verificacaoLogin) {
                System.out.println("------------- Login da conta -------------");

            }

            System.out.println("----------- Cadastro de Produto -----------");

            System.out.println("Digite o nome de usuário:");
            String nome = sc.next();

            System.out.println("Digite quantidade de estoque:");
            String estoque = sc.nextInt();

            System.out.println("-------------------------------------------");

            Produto produto = new Produto(nome, estoque);
            mostrarProduto();

        }

    }
}
