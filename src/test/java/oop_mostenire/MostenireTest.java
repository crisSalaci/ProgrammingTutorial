package oop_mostenire;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test
    public void metodaTest(){
        Angajat angajat = new Angajat("popescu", "andrei", 20, "masculin", "timisoara",
                "adesso","tester",10000,"2 ani");
        angajat.infoAngajat();

        System.out.println(angajat.getVarsta());
        angajat.setVarsta(21);
        System.out.println(angajat.getVarsta());

        angajat.mananca();

        angajat.marire();
        angajat.marire(10);
        angajat.marire("engineer");
        angajat.marire(10,"engineer");

        angajat.ajungeLaTimpLaBirou();
        angajat.respectaConduita();
        angajat.nuAreAbsente();
        angajat.munceste();

        System.out.println("");
//        System.out.println();
//
//        Sportiv sportiv = new Sportiv("ionescu", "ion",10,"masculin", "timisoara",
//                "fotbal",true,2,true,2);
//        sportiv.infoSportiv();
//
//        System.out.println();
//
        Student student = new Student("ion", "alina", 21,"feminin", "timisoara",
                "politehica", "it",3,true,true);
        student.infoStudent();

        student.saNuAibaRestante();
        student.mergeLaCursuri();
        student.saStieSaCopieze();
        student.trebuieSaStudieze();

        System.out.println("");

        Sportiv sportiv = new Sportiv("pop","alex",17,"m","oradea","baschet",
                true, 2, true,3);
        sportiv.infoSportiv();

        sportiv.mergeLaAntrenament();
        sportiv.respectaProgramulDeAntrenament();
    }
}
