package variabilaMetoda;

import org.testng.annotations.Test;

public class Animal {
    public String rasa;
    public boolean esteMamifer;
    public String culoare;
    public int varsta;
    public double greutate;

    @Test
    public void metodaTest(){


        prezentareAnimal("caine",true,"maro",2,20.1);
        prezentareAnimal("pisica",true,"alb",3,3.2);
        //prezentareAnimal("soarece",true,"gri",1,0.2);
    }

    public void prezentareAnimal(String param1, boolean param2,String param3,int param4, double param5){
        int pret = 50; //asta e o variabila locala pt ca e in interiorul metodei
        System.out.println("Pretul animalului este: "+pret);
        System.out.println("Rasa animalului este: "+param1);
        System.out.println("Animalul este mamifer: "+param2);
        System.out.println("Culoarea animalului este: "+param3);
        System.out.println("Varsta animalului este: "+param4);
        System.out.println("Greutatea animalului este: "+param5);
        System.out.println();
    }


}
