class Aluno{
    String nome;
    int idade;
    
    Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar(){
        System.out.println("Ola, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

class Disciplina{
    String nome;
    double nota;

    Disciplina(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    void apresentarDisciplina(){
        System.out.println("Disciplina: " + nome + ", nota:" + nota);
    }
}

public class Alunos{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Laura", 15);
        aluno1.apresentar();
        Disciplina disciplina1 = new Disciplina("Programação Orientada a Objeto", 9.20);
        disciplina1.apresentarDisciplina();
    }
}
