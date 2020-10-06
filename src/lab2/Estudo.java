package lab2;

//Classe Estudo que contém a meteria e os minutos estudados
public class Estudo {
	private String materia;
	private int minutos;
	public Estudo(String materia) {
		this.materia = materia;
		this.minutos = 0;
	}
	public void adicionaMinutos(int i) {
		this.minutos += i;
	}
	public boolean deveDescansar() {
		if (this.minutos >= 120) {
			return true;
		}
		return false;
	}
	public String toString() {
		return this.materia + " (" + this.minutos + " min)";
	}
}
