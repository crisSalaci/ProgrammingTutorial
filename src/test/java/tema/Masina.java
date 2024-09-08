package tema;

import org.testng.annotations.Test;

public class Masina {
    public String categorie;
    public String marca;
    public String tipul;
    public int anulFabricatiei;
    public String numarDeIdentificare;
    public int masaKg;
    public int numarDeLocuri;
    public boolean numarDeLocuriInPicioare;
    public double lungimeM;
    public double latimeM;
    public double inaltimeM;
    public String sursaEnergie;
    public String culoarea;
    public int capacitateRezervorL;

    @Test
    public void prezentareMasina() {
        categorie = "Autoturism";
        marca = "Toyota";
        tipul = "Yaris";
        anulFabricatiei = 2008;
        numarDeIdentificare = "VNKKG9850A190";
        masaKg = 1077;
        numarDeLocuri = 5;
        numarDeLocuriInPicioare = false;
        lungimeM = 3.75;
        latimeM = 1.69;
        inaltimeM = 1.50;
        sursaEnergie = "Benzina";
        culoarea = "Verde";
        capacitateRezervorL = 42;

        System.out.println("Categoria masinii este "+categorie);
        System.out.println("Marca masinii este "+marca);
        System.out.println("Tipul masinii este "+tipul);
        System.out.println("Anul de fabricatie al masinii este "+anulFabricatiei);
        System.out.println("Numarul de identificare al masinii este "+numarDeIdentificare);
        System.out.println("Masa masinii este de "+masaKg+" kilograme");
        System.out.println("Numarul de locuri este "+numarDeLocuri);
        System.out.println("Masina are locuri in picioare? "+numarDeLocuriInPicioare);
        System.out.println("Lungimea masinii este de "+lungimeM+" metri");
        System.out.println("Latimea masinii este de "+latimeM+" metri");
        System.out.println("Inaltimea masinii este de "+inaltimeM+" metri");
        System.out.println("Sursa de energie a masinii este "+sursaEnergie);
        System.out.println("Culoarea masinii este "+culoarea);
        System.out.println("Capacitatea rezervorului este "+capacitateRezervorL+" de litri");
    }

}
