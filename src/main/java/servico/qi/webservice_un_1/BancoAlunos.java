package servico.qi.webservice_un_1;

import java.util.ArrayList;

public class BancoAlunos {
    private static ArrayList<Aluno> listaAlunos = new ArrayList<>();

    static {
        listaAlunos.add(new Aluno(1, "Joao", "joao@joao.com", 3));
        listaAlunos.add(new Aluno(2, "Maria", "maria@maria.com", 1));
        listaAlunos.add(new Aluno(3, "Jose", "jose@mariajoao.com", 2));
        listaAlunos.add(new Aluno(4, "Pedro", "pedro@email.com", 3));
    }

    public static ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public static Aluno getAluno(int id) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }
        return null;
    }
}

