package oop_v1;

public interface AngajatInterface {
    //abstractizarea = conceptul prin care putem defini comportamentul unei clase
    //se poate face prin doua feluri: interfete si clase abstracte
    //interfata contine doar metode abstracte (metode care nu au body)
    //toate aceste metode abstracte sunt publice
    //intr-o interfata putem defini metode cu void sau return
    //intro interfata nu putem avea un constructor => nu putem face un obiect
    //interfata se implementeaza
    //clasa care implementeaza interfata trebuie sa implementeze toate metodele din ea
    //o clasa poate implementa mai multe interfete
    //o interfata poate mosteni o alta interfata

    void ajungeLaTimpLaBirou();
    void munceste();
    void nuAreAbsente();
    void respectaConduita();
}
