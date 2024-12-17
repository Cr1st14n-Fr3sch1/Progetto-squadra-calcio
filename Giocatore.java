abstract class Giocatore {
    protected String nome;
    protected int eta;
    protected boolean capitano;

    public Giocatore(String nome, int eta, boolean capitano) {
        this.nome = nome;
        this.eta = eta;
        this.capitano = capitano;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }   
        public boolean getcapitano() {
            return capitano;
    }

    public abstract void calcolaStatistiche();
}

class Pivot extends Giocatore {
    private int golSegnati;

    public Pivot(String nome, int eta, boolean capitano, int golSegnati) {
        super(nome, eta, capitano);
        this.golSegnati = golSegnati;
        
    }

    @Override
    public void calcolaStatistiche() {
        System.out.println("Pivot: " + getNome() + ", eta: " + eta + ", Gol Segnati: " + golSegnati);
    if(capitano){
        System.out.println("capitano");
    }
    }
}

class Centrale extends Giocatore {
    private int contrastiriusciti;

    public Centrale(String nome, int eta,  boolean capitano, int contrastiriusciti) {
        super(nome, eta, capitano);
        this.contrastiriusciti = contrastiriusciti;
    }

    @Override
    public void calcolaStatistiche() {
        System.out.println("Centrale: " + getNome()  + ", eta: " + eta +  ", Contrasti Riusciti: " + contrastiriusciti);
    }
}

class Portiere extends Giocatore {
    private int golsubiti;

    public Portiere(String nome, int eta,  boolean capitano, int golsubiti) {
        super(nome, eta, capitano);
        this.golsubiti = golsubiti;
    }

    @Override
    public void calcolaStatistiche() {
        System.out.println("Portiere: " + getNome()  + ", eta: " + eta + ", Gol Subiti: " + golsubiti);
    }
}

class Ala extends Giocatore {
    private int assist;

    public Ala(String nome, int eta,  boolean capitano, int assist) {
        super(nome, eta, capitano);
        this.assist = assist;
    }

    @Override
    public void calcolaStatistiche() {
        System.out.println("Ala: " + getNome()  + ", eta: " + eta + ", Assist: " + assist);
    }
}

class Presidente {
    private String nome;

    public Presidente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void mostraDettagli() {
        System.out.println("presidente: " + nome);
    }
}

class Allenatore {
    private String nome;

    public Allenatore(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void mostraDettagli() {
        System.out.println("Allenatore: " + nome);
    }
}
