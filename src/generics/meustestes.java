package generics;

import java.util.ArrayList;

public class meustestes {
    public static void main(String[] args) {

        String aluno0 = "igor";
        String aluno1 = "Ana";
        String aluno2 = "Davi";
        String aluno3 = "Raul";
        String aluno4 = "Silvio";
        String aluno5 = "";

        ArrayList<String> alunos = new ArrayList<>();

        alunos.add(aluno0);
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);

        System.out.println(alunos.get(4));

    }
}
