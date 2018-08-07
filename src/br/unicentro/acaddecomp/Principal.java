package br.unicentro.acaddecomp;

public class Principal {
	public static void main(String[] args) {
		Guerra g = new Guerra();
		Inimigo i1 = new Inimigo (9000, false);
		Inimigo i2 = new Inimigo (12000, false);
		Inimigo i3 = new Inimigo (4000, true);
		g.definirEstrategia(i3);
		g.declararGuerra();
		g.encerrarGuerra();
	}
}
