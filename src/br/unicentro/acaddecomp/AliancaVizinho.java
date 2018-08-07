package br.unicentro.acaddecomp;

public class AliancaVizinho implements Estrategia{

	@Override
	public void atacar() {
		System.out.println("Vizinho atacou pelo norte!");
		System.out.println("Você atacou pelo sul!");
	}

	@Override
	public void concluir() {
		System.out.println("Dividindo Beneficios!");
		System.out.println("Dividindo Reconstrução!");
	}

}
