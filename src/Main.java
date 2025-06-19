import entities.Dipartimento;
import entities.Dipendente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dipendente d1=new Dipendente(4567,2000, Dipartimento.AMMINISTRAZIONE) {
        };
        System.out.println("Io sono il dipendente con matricola: "+d1.getMatricola());
        Dipendente d2=new Dipendente(2345,1500,Dipartimento.VENDITE);
        System.out.println("Io sono il dipendente con matricola: "+d2.getMatricola());
        Dipendente d3=new Dipendente(2358,1000,Dipartimento.PRODUZIONE);
        System.out.println("Io sono il dipendente con matricola: "+d3.getMatricola());


    }
}