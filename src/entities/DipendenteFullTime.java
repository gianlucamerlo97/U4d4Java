package entities;

public class DipendenteFullTime extends Dipendente{
    private int stipendioMensile;
    public DipendenteFullTime(String matricola, Dipartimento dipartimento,int stipendioMensile){
        super(matricola,dipartimento);
        this.stipendioMensile=stipendioMensile;
    }
    @Override
    public int calcolaStipendio(){
        return stipendioMensile;
    }

}
