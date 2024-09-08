package multimi;

import com.beust.jcommander.StringKey;
import org.testng.annotations.Test;

import java.util.*;

public class Multimi {
    //multimi: array, list, set, map

    @Test
    public void metodaTest() {
        //cursantiArray();
        //cursantiList();
        //listaMasini();
        //mapExample();
        //tariOrase();
        caietRetete();

    }

    //afisam cursantii de la cursul de automation
    public void cursantiArray() {
        String[] cursanti = new String[10];
        cursanti[0] = "Cristina";
        cursanti[1] = "Rares";
        cursanti[2] = "Magda";
        cursanti[3] = "Razvan";
        cursanti[4] = "Radu";
        cursanti[5] = "Andrei";
        for (int index = 0; index < cursanti.length; index++) {
            System.out.println("Numele cursantului este " + cursanti[index]);
        }

    }

    //v2-list
    public void cursantiList() {
        List<String> cursanti = new ArrayList<>();
        cursanti.add("Cristina");
        cursanti.add("Rares");
        cursanti.add("Magda");
        cursanti.add("Razvan");
        cursanti.add("Magda");
        cursanti.add("Radu");
        cursanti.add("Andrei");
        for (int index = 0; index < cursanti.size(); index++) {
            System.out.println("Numele cursantului este " + cursanti.get(index));
        }
    }

    //definim o multime de masini din care afisam doar masinile de pe pozitii impare
    public void listaMasini() {
        List<String> masini = new ArrayList<>();
        masini.add("Toyota");
        masini.add("Dacia");
        masini.add("Ford");
        masini.add("VW");
        masini.add("Mercedes");
        for (int index = 0; index < masini.size(); index++) {
            if (index % 2 != 1) {
                System.out.println("Numele masinii este " + masini.get(index));
            }
        }
    }

    //map: key=value
    //parcurgerea se face pe baza cheilor (folosind un set)
    public void mapExample(){
        Map<String,String> elemente=new HashMap<>();
        elemente.put("masina","Dacia");
        elemente.put("persoana","Cristina");
        elemente.put("telefon","IPhone");
        for (String key: elemente.keySet()){
            System.out.println("Cheia este "+key);
            System.out.println("Valoarea este "+elemente.get(key));
        }
    }

    //afisam tari cu anumite orase
    public void tariOrase(){
        Map<String,List<String>> obiecte=new HashMap<>();

        List<String> oraseRomania= Arrays.asList("Cluj","Oradea","Timisoara");
        List<String> oraseItalia= Arrays.asList("Bari","Roma","Napoli");
        List<String> oraseSpania= Arrays.asList("Barcelona","Valencia","Madrid");

        obiecte.put("Romania",oraseRomania);
        obiecte.put("Italia",oraseItalia);
        obiecte.put("Spania",oraseSpania);

        for (String key: obiecte.keySet()){
            System.out.println("Tara este "+key);
            System.out.println("Orasele sunt "+obiecte.get(key));
        }

    }

    //ingrediente pentru supa de pui
    public void caietRetete(){
        Map<String,List<String>> ingrediente=new HashMap<>();

        List<String> ingredienteSupaPui= Arrays.asList("carne pui","apa","taitei");
        List<String> ingredienteSarmale= Arrays.asList("varza","carne","orez");
        List<String> ingredienteDesert= Arrays.asList("faina","zahar","dulceata de caise");

        ingrediente.put("Supa Pui", ingredienteSupaPui);
        ingrediente.put("Sarmale",ingredienteSarmale);
        ingrediente.put("Desert",ingredienteDesert);

        for (String key: ingrediente.keySet()){
            System.out.println("Reteta este "+key);
            System.out.println("Ingredientele sunt "+ingrediente.get(key));
        }


    }
}
