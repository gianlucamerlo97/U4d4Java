package entities;


public abstract class Dipendente {

    protected String matricola;
    protected int stipendio;
    protected Dipartimento dipartimento;

    public Dipendente(String matricola,  Dipartimento dipartimento){
        this.matricola=matricola;
        this.dipartimento=dipartimento;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public abstract int calcolaStipendio();

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }
}
