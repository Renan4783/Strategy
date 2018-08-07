package br.unicentro.acaddecomp;

public class AtacarSozinho implements Estrategia{

	@Override
	public void atacar() {
		System.out.println("Plantando evidências falsas!");
		System.out.println("Soltando Bombas!");
		System.out.println("Derrubando Governo!");
	}

	@Override
	public void concluir() {
		System.out.println("Estabelecendo Governo Amigo!");
	}

}
