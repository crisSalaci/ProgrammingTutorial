package obiectConstructor.hotel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Hotel {
    public String nume;
    public String adresa;
    public String tara;
    public String oras;
    public String stele;
    public int numarCamere;
    public boolean micDejun;
    public int numarEtaje;
    public List<String> facilitati;
    public int pretPornire;

    public Hotel() {
        nume = "Imperial House";
        adresa="Strada Mamaia";
        tara="Romania";
        oras="Constanta";
        stele="***";
        numarCamere=60;
        micDejun=true;
        numarEtaje=6;
        facilitati= Arrays.asList("Wifi","Hartie igienica", "TV", "Frigider", "Loc parcare");
        pretPornire=1000;
    }

    public void prezentareHotel(){
        System.out.println("Numele hotelului este: "+nume);
        System.out.println("Strada hotelului este: "+adresa);
        System.out.println("Tara hotelului este: "+tara);
        System.out.println("Numarul stele hotel: "+stele);
        System.out.println("Numar camere: "+numarCamere);
        System.out.println("Mic dejun inclus: "+micDejun);
    }

    public void pretOferta(HashMap<String, String> oferta){
        System.out.println("Pretul de pornire este "+pretPornire);

        for (String optiune: oferta.keySet()){
            if (optiune.equals("Durata oferta")){
                //clientul are dorinta de a avea oferta cu valabilita mai mare
                //se calculeaza pretul pe baza mai multor intervale

                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);
                if(number<5){
                    pretPornire=pretPornire+100;
                }
                if(number>5&&number<10){
                    pretPornire=pretPornire+2000;
                }
                else {
                    pretPornire=pretPornire+850;
                }
            }

            if (optiune.equals("Perioada sedere")){
                //clientul are dorinta de a avea oferta cu valabilita mai mare
                //se calculeaza pretul pe baza mai multor intervale

                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);
                if(number<5){
                    pretPornire=pretPornire+100;
                }
                if(number>5&&number<10){
                    pretPornire=pretPornire+2000;
                }
                else {
                    pretPornire=pretPornire+850;
                }
            }

            if(optiune.equals("Offseason")){
                if(oferta.get(optiune).equals("Da")){
                    pretPornire=pretPornire-1000;
                }
                else{
                    pretPornire=pretPornire+500;
                }
            }
        }
    }

}
