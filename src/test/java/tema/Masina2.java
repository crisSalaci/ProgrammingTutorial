package tema;

import org.testng.annotations.Test;

public class Masina2 {
    public String marca;
    public boolean numarDeLocuriInPicioare;
    public String culoare;
    public double lungime;


    @Test
    public void prezentareMasina() {

        prezentareMasina("toyota",false,"verde",3.75);
        prezentareMasina("opel",true,"gri",5.99);
    }
    public void prezentareMasina(String param1, boolean param2, String param3, double param4){
        System.out.println("marca masinii este: "+param1);
        System.out.println("are locuri in picioare? "+param2);
        System.out.println("culoarea masinii este: "+param3);
        System.out.println("lungimea masinii este: "+param4);
        System.out.println("");
    }

}
