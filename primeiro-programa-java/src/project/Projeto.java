package project;

import javax.swing.JOptionPane;

public class Projeto {

	public static void main(String[] args) {

		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");
		String matricula = JOptionPane.showInputDialog("Qual o numero da matricula?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mae do aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
		
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		String nota5 = JOptionPane.showInputDialog("Nota 5");
		
		
		
		
		
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); // passar string para inteiro
		aluno1.setDataMatricula(matricula);
		aluno1.setNomeDaEscola(nomeEscola);
		aluno1.setNomeDaMae(nomeMae);
		aluno1.setNomeDoPai(nomePai);
		
		aluno1.setNota1(Double.parseDouble(nota1)); //passar de string para double
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println(aluno1.getNome());

	}

}
