package entities;

public class DipendentePartTime extends Dipendente{

    private int orePagate;
    private int pagaOraria;
    public DipendentePartTime(String matricola,  Dipartimento dipartimento,int orePagate,int pagaOraria){
        super(matricola, dipartimento);
    this.orePagate=orePagate;
    this.pagaOraria=pagaOraria;

    }

    @Override
    public int calcolaStipendio() {
        return pagaOraria*orePagate;
    }
}
