package lab2;

public class Organizacao {
	private String local;
	private int[] tarefas;
	private int numTarefasCadastradas = 0;
	
	public Organizacao(String local, int numTarefas) {
		this.local = local;
		this.tarefas = new int[numTarefas];
	}	
	
	public void cadastraTarefa(int idTarefa, int minutos) {
		if (tarefas[idTarefa] == 0) {
			this.numTarefasCadastradas += 1;
		}
		tarefas[idTarefa] = minutos;		
	}

	public int getDuracaoTarefa(int idTarefa) {
		return this.tarefas[idTarefa];
	}

	public int mediaTarefa() {
		int media = 0;
		int contador = 0; 
		for(int i = 0; i < this.tarefas.length; i++) {
			if (tarefas[i] != 0) {
				media += tarefas[i];
				contador += 1;
			}
		}
		if (contador!= 0) {
			media = media/contador;
		}
		return media;
	}
	 
	public String toString() {
		return this.local + " (" + this.numTarefasCadastradas + " tarefas, " + this.mediaTarefa() + " min/tarefa)" ;
	}
}
