public class Main {
	public static void main(String[] args) {
		Presidente presidente = new Presidente("LI Xiaoe");
		Allenatore allenatore = new Allenatore("Alessandra Federica Francesca Logli");
		SquadraSportiva squadra = new SquadraSportiva(14, presidente, allenatore);

		//giocatori:
		//pivot:
		squadra.aggiungiGiocatore(new Pivot("Cristian Freschi", 18, true, 24));
		squadra.aggiungiGiocatore(new Pivot("Matteo D'Alessandro", 17, true, 29));
		squadra.aggiungiGiocatore(new Pivot("Kristian Spema", 17, false, 17));

		//ala:
		squadra.aggiungiGiocatore(new Ala("Alberto Nicolia", 17, false, 24));
		squadra.aggiungiGiocatore(new Ala("Nicolas Marciello", 16, false, 22));
		squadra.aggiungiGiocatore(new Ala("Claudio Moreno", 17, false, 10));
		squadra.aggiungiGiocatore(new Ala("Manuel Gamarra", 20, false, 13));

		//centrale:
		squadra.aggiungiGiocatore(new Centrale("Satria Altini", 19, false, 27));
		squadra.aggiungiGiocatore(new Centrale("Lorenzo Neri", 17, false, 48));
		squadra.aggiungiGiocatore(new Centrale("Francsco Caione", 17, false, 36));

		//portiere:
		squadra.aggiungiGiocatore(new Portiere("Anjan Sani", 18, false, 27));
		squadra.aggiungiGiocatore(new Portiere("Giacomo Casanova", 16, false, 14));
		System.out.println("Statistiche della squadra:");
		squadra.mostraStatistiche();
	}
}

