package entities;


import interfaces.checkIn;

public class DipendenteFullTime extends Dipendente implements checkIn {
    private int stipendioMensile;
    public DipendenteFullTime(String matricola, Dipartimento dipartimento,int stipendioMensile){
        super(matricola,dipartimento);
        this.stipendioMensile=stipendioMensile;
    }
    @Override
    public int calcolaStipendio(){
        return stipendioMensile;
    }
    public void checkIn(){
        System.out.println("CheckIn eseguito alle 14:00");
    }
}
