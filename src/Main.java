import entities.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DipendenteFullTime d1=new DipendenteFullTime("2345",Dipartimento.PRODUZIONE,1800);

        System.out.println(d1);
        DipendentePartTime d2= new DipendentePartTime("4455",Dipartimento.VENDITE,170,8);
        System.out.println(d2.calcolaStipendio());
        Dirigente d3= new Dirigente("2233",Dipartimento.VENDITE,2500);
        Dipendente [] dipendenti ={d1,d2,d3};
        int stipendioTotale=0;
        for(int i=0;i<dipendenti.length;i++){
            stipendioTotale+=dipendenti[i].calcolaStipendio();

        }
        Object[] dipendent= new Object[4];
        dipendent[0]= new DipendenteFullTime("2222",Dipartimento.PRODUZIONE,2300);
        dipendent[1]= new DipendentePartTime("3333",Dipartimento.AMMINISTRAZIONE,90,8);
        dipendent[2]=new Dirigente("5555",Dipartimento.VENDITE,3000);
        dipendent[3]=new Volontario("Marco",25,"rrrrrtttttt");


    }
}