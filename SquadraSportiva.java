public class SquadraSportiva {
    private Giocatore[] giocatori;
    private Presidente presidente;
    private Allenatore allenatore;
    private int numeroGiocatori;

    public SquadraSportiva(int dimensione, Presidente presidente, Allenatore allenatore) {
        giocatori = new Giocatore[dimensione];
        this.presidente = presidente;
        this.allenatore = allenatore;
        numeroGiocatori = 0;
    }

    public void aggiungiGiocatore(Giocatore giocatore) {
        if (numeroGiocatori < giocatori.length) {
            giocatori[numeroGiocatori++] = giocatore;
        } else {
            System.out.println("Impossibile aggiungere giocatore: squadra piena.");
        }
    }

    public void mostraStatistiche() {
        presidente.mostraDettagli();
        allenatore.mostraDettagli();
        for (int i = 0; i < numeroGiocatori; i++) {
            giocatori[i].calcolaStatistiche();
        }
    }
}
