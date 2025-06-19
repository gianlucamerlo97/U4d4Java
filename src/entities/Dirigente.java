package entities;

import interfaces.checkIn;

public class Dirigente extends Dipendente implements checkIn {


    public Dirigente(String matricola, Dipartimento dipartimento, int stipendio) {
        super(matricola, dipartimento);
        this.stipendio=stipendio;

    }

    @Override
    public int calcolaStipendio() {
        return this.stipendio;
    }


    @Override
    public void checkIn() {

    }
}
