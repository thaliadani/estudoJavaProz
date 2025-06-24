class Pessoa{
    String nome;
    int idade;
    
    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar(){
        System.out.println("Ola, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

public class Objetos{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Paula", 30);
        p1.apresentar();
    }
}