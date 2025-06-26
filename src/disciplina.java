import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;
    Disciplina disc;
    Pessoa(String nome, int idade, Disciplina disc) {
        // Este registro
        this.nome = nome;
        this.idade = idade;
        this.disc = disc;
    }

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos. Sou aluno.");
        disc.apresentarDisciplina();
    }
}

// Adicionar classe de Disciplina
class Prof {
    String nome;
    int idade;

    Prof(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar() {
        System.out.println("Sou o professor " + nome + " e tenho " + idade + " anos.");
    }
}

class Disciplina {
    String nome;
    Prof prof;

    Disciplina(String nome, Prof prof) {
        this.nome = nome;
        this.prof = prof;
    }

    void apresentarDisciplina() {
        System.out.println("Disciplina: " + nome);
        prof.apresentar();
    }
}

public class Objetos {
    public static void main(String[] args) {
        Prof prof = new Prof("Fernanda", 20);
        prof.apresentar();
        Disciplina disc = new Disciplina("Programação Orientada a Objetos", prof);
        disc.apresentarDisciplina();
        Pessoa pessoa = new Pessoa("Enzo", 19, disc);
        pessoa.apresentar();
    }
}
