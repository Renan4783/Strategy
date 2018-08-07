package br.unicentro.acaddecomp;

public class Guerra {

	Estrategia acao;
	public void definirEstrategia(Inimigo i){
		if (i.getExercito() > 10000){
			acao = new AliancaVizinho();
		} else if (i.isNuclear()){
			acao = new Diplomacia();
		} else {
			acao = new AtacarSozinho();
		}
	}
	
	public void declararGuerra(){
		acao.atacar();
	}
	
	public void encerrarGuerra(){
		acao.concluir();
	}
}
