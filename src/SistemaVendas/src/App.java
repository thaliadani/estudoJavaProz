import java.util.Scanner;

class Usuario {

    String nome;
    String email;
    String senha;

    Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    void mostrarUsuario(){
        System.out.println("------ Cadastro realizado com sucesso ------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " +this.email);
        System.out.println("Senha: " + this.senha);
        System.out.println("--------------------------------------------");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Cadastro do usuário
        System.out.println("----------- Cadastro da conta -----------");

        System.out.println("Digite o nome de usuário:");
        String nome = sc.next();

        System.out.println("Digite seu email :");
        String email = sc.next();

        System.out.println("Digite sua senha:");
        String senha = sc.next();

        System.out.println("-------------------------------------------");

        Usuario usuario = new Usuario(nome,email,senha);
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
            if ((nome.equals(nomeLogin)) && (email.equals(emailLogin)) && (senha.equals(senhaLogin))) {
                System.out.println("Login realizado com sucesso");
                System.out.println("-------------------------------------------");
                break;
            } else {
                System.out.println("Erro ao realizar o login");
                System.out.println("-------------------------------------------");
            }
        }

    }
}
