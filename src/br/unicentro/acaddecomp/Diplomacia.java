package br.unicentro.acaddecomp;

public class Diplomacia implements Estrategia{

	@Override
	public void atacar() {
		System.out.println("Recuando tropas!");
		System.out.println("Propondo Coopera��o Econ�mica!");
	}

	@Override
	public void concluir() {
		System.out.println("Desarmando Inimigo!");
	}

}
