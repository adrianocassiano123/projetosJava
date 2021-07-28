package project;

public class Aluno {

	String nome;
	int idade;
	String nomeDaMae;
	String nomeDoPai;
	String dataMatricula;
	String nomeDaEscola;
	double nota1;
	double nota2;
	double nota3;
	double nota4;
	double nota5;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNomeDaMae() {
		return nomeDaMae;
	}
	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}
	public String getNomeDoPai() {
		return nomeDoPai;
	}
	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeDaEscola() {
		return nomeDaEscola;
	}
	public void setNomeDaEscola(String nomeDaEscola) {
		this.nomeDaEscola = nomeDaEscola;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
//	Método retorna a média do aluno
	public double getMediaNota() {
		
		return (nota1+nota2+nota3+nota4)/4;
		
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media>=70) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	
	
	
	
}
