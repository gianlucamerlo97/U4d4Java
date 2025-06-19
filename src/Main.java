import entities.Dipartimento;
import entities.Dipendente;
import entities.DipendenteFullTime;
import entities.DipendentePartTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DipendenteFullTime d1=new DipendenteFullTime("2345",Dipartimento.PRODUZIONE,1300);

        System.out.println(d1);
        DipendentePartTime d2= new DipendentePartTime("4455",Dipartimento.VENDITE,170,8);
        System.out.println(d2.calcolaStipendio());


    }
}