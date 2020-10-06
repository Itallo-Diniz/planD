package lab2;

public class Lazer {
	private String atividade;
	private int tempoLimite;
	private int tempoTotal;
	private int numAtividades = 0;
	private String[] subatividades;
	private int[] tempoSubatividades;
	public Lazer(String atividade , int tempoLimite) {
		this.tempoLimite = tempoLimite;
		this.atividade = atividade;
		this.tempoTotal = 0;
		this.subatividades = new String[tempoLimite];
		this.tempoSubatividades = new int[tempoLimite];
		
	}
	public Lazer(String atividade) {
		this(atividade,60);
	}
	public void cadastraAtividade(String nome, int minutos) {
		if(minutos + tempoTotal <= tempoLimite) {
			subatividades[numAtividades] = nome;
			tempoSubatividades[numAtividades] = minutos;
			numAtividades += 1;
			tempoTotal += minutos;
			
		}
		
	}
	public int totalAtividades() {
		return this.numAtividades;
	}
	public int tempoTotal() {
		return this.tempoTotal;
	}
	public String toString() {
		String saida = this.atividade + ":";
		for(int i = 0; i < this.numAtividades; i++) {
			saida += " " + this.subatividades[i] + ",";
		}
		return saida.substring(0, saida.length()-1);
	}

}
