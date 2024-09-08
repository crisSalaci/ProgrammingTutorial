package obiectConstructor;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MasinaTest {
    @Test
    public void testMasinaMethod(){
//        Masina Dacia = new Masina("Dacia", "Logan", 2015, "alb",
//                Arrays.asList("- Aer conditionat", "- Airbag", "- Radio"), "benzina");
//        Dacia.prezentareMasina();
//        Dacia.calculImpozit();
//        System.out.println();
//
//        Masina Kia = new Masina("Kia", "Sportage", 1997, "albastru",
//                Arrays.asList("- Aer conditionat", "- Airbag", "- Radio", "- Scaune incalzite", "- Navigatie"),
//                "benzina + electric");
//        Kia.prezentareMasina();
//        Kia.calculImpozit();
//        System.out.println();

        Masina Kia2 = new Masina("Kia", "Sportage", 2021, "albastru",
                Arrays.asList("- Aer conditionat", "- Airbag", "- Radio", "- Scaune incalzite",
                        "- Navigatie"), "benzina + electric", 25000);
        Kia2.prezentareMasina();
        Kia2.calculImpozit();
        Kia2.calculReducere(50);
    }
}
