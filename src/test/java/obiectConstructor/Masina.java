package obiectConstructor;

import java.util.List;

public class Masina {


    //un constructor = are ca rol sa initializeze variabilele unei clase
    //recunoastem un constructor intr-o clasa dupa numele acestuia
    //de cele mai multe ori constructorul este public
    //intr-o clasa putem avea mai multi constuctori care se diferentiaza prin numarul/tipul de parametri
    //o clasa contine intotdeauna un constructor default (nu are parametri)
    //constructorii pot fi de 2 tipuri: cu parametri/fara parametri

    //obiect = instanta unei clase
    //dintr-o clasa putem sa definim mai multe obiecte care sa aiba valori diferite pentru proprietati
    //in momentul cand avem un obiect de tipul unei clase putem accesa varabile/metode din clasa respectiva
    //obiectele se diferentiaza prin numele acestora
    //recunoastem un obiect dupa cuvantul cheie "new"
    //structura: tipObiect numeObiect = new tipObiect(); (exemplu: Masina Dacia = new Masina();)

    public String marca;
    public  String model;
    public int an;
    public String culoare;
    public List<String> dotariInterioare;
    public String motorizare;
    public int pret;
    public int pretFinal;

    //constructor cu 6 parametri
    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, String motorizare){
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
    }
    //constructor cu 7 parametri
    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, String motorizare, int pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentareMasina(){
        System.out.println("Marca masinii este: "+marca);
        System.out.println("Modelul masinii este: "+model);
        System.out.println("Anul fabricatiei: "+an);
        System.out.println("Culoarea: "+culoare);
        System.out.println("Dotarile interioare sunt: ");
        for (int i=0; i<dotariInterioare.size(); i++){
            System.out.println(dotariInterioare.get(i));
        }
        System.out.println("Motorizarea: "+motorizare);
        calculPret();
    }

    //determinam impozitul in functie de anul de fabricatie:
    //<2000 => 500 RON
    //2005-2015 => 300 RON
    //>2020 => 100 RON
    public void calculImpozit(){
        if(an <= 2000){
            System.out.println("Impozitul pe masina este 500 RON.");
        }
        else if(an >= 2005 && an <= 2015){
            System.out.println("Impozitul pe masina este 300 RON.");
        }
        else if(an >= 2020){
            System.out.println("Impozitul pe masina este 100 RON.");
        }
    }

    //determinam pretul standard si pretul final in functie de dotarile masinii
    public void calculPret(){
        if (pret !=0){
            System.out.println("Pretul de pornire este: "+pret);
        }
        if (dotariInterioare.isEmpty()){
            System.out.println("Pretul final este: "+pret);
        }
        else {
            int dotari = 0;
            for(int i=0;i<dotariInterioare.size();i++){
                switch (dotariInterioare.get(i)){
                    case "- Radio":
                        dotari = dotari+1000;
                        break;
                    case  "- Airbag":
                        dotari=dotari+800;
                        break;
                    case "- Aer conditionat":
                        dotari=dotari+1500;
                        break;
                    case "- Scaune incalzite":
                        dotari=dotari+3000;
                        break;
                    case "- Navigatie":
                        dotari=dotari+400;
                        break;
                }
            }
            System.out.println("Pretul dotarilor este: "+dotari);
            pretFinal=pret+dotari;
            System.out.println("Pretul final este: "+pretFinal);
        }
    }

    public void calculReducere(int procentReducere){

        int reducere=(pretFinal*procentReducere)/100;
        pretFinal=pretFinal-reducere;
        System.out.println("S-a aplicat o reducere de "+procentReducere+"% din pretul final.");
        System.out.println("Pretul final cu reducere este: "+pretFinal);
    }
}
