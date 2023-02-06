package br.com.academico.teste;

import br.com.academico.dao.AlunoDAO;
import br.com.academico.modelo.Aluno;

public class TesteDeCRUD {

  public static void main(String[] args) throws Exception {
    try {
      Aluno aluno1 = new Aluno();

      aluno1.setCpf("1");
      aluno1.setNome("Henzo");
      aluno1.setIdade(20);
      aluno1.setAltura(1.81);

      System.out.println("Aluno criado e preenchido");

      AlunoDAO alunoDAO1 = new AlunoDAO();
      alunoDAO1.criar(aluno1);
      System.out.println("Inserido por objeto");

      alunoDAO1.deletar(aluno1);
      System.out.println("Excluído por objeto");
    } catch (Exception e) {
      System.err.println("Erro no banco de dados: " + "\n" + 
          e.getMessage() + "\n" + 
          e.getClass());
//    e.printStackTrace();
    }
  }
}
