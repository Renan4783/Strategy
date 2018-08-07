package br.unicentro.acaddecomp;

public class Inimigo {

	private int exercito;
	private boolean nuclear;
	
	public Inimigo (int exercito, boolean nuclear){
		this.exercito = exercito;
		this.nuclear = nuclear;
	}

	public int getExercito() {
		return exercito;
	}

	public boolean isNuclear() {
		return nuclear;
	}
}
