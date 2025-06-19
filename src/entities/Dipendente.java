package entities;
import java.util.Random;

public abstract class Dipendente {

    private int matricola;
    private int stipendio;


    public Dipendente(int matricola, int stipendio, Dipartimento dipartimento){
        this.matricola=matricola;
        this.stipendio=stipendio;
    }
    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }
}
