package entities;
import java.util.Random;

public abstract class Dipendente implements checkIn{

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
        this.stipendio = (int) stipendio;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    private static int calculateSalary(){
        if(DipendenteFullTime==true){
            int stipendio=2500;
        }else{
            Dipendente
        }
    }
}
