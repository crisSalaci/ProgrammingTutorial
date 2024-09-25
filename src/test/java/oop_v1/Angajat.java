package oop_v1;

public class Angajat extends Persoana implements AngajatInterface {

    private String firma;
    private String pozitie;
    private int salariu;
    private String experienta;

    public Angajat(String nume, String prenume, int varsta, String sex, String adresa, String firma,
                   String pozitie, int salariu, String experienta) {
        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitie = pozitie;
        this.salariu = salariu;
        this.experienta = experienta;
    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Firma la care lucreaza angajatul este "+firma);
        System.out.println("Pozitia angajatului in firma este "+pozitie);
        System.out.println("Salariul angajatului este "+salariu);
        System.out.println("Experienta angajatului este "+experienta);
    }

    public void mananca(){
        super.mananca();
        System.out.println("Angajatul mananca cand are pauza.");
    }

    //polimorfism static
    public void marire(){
        System.out.println("Angajatul primeste marirea anuala standard.");
    }

    public void marire(int procent){
        System.out.println("Angajatul primeste marirea anuala de "+procent+"%.");
    }

    public void marire(String grad){
        System.out.println("Angajatul primeste gradul "+grad);
    }

    public void marire(int procent, String grad){
        System.out.println("Angajatul primeste gradul "+grad+" si procentul de "+procent+"%");
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getPozitie() {
        return pozitie;
    }

    public void setPozitie(String pozitie) {
        this.pozitie = pozitie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public String getExperienta() {
        return experienta;
    }

    public void setExperienta(String experienta) {
        this.experienta = experienta;
    }

    @Override
    public void ajungeLaTimpLaBirou() {
        System.out.println("Angajatul trebuie sa ajunga la birou intre 8:00 si 17:00");
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul trebuie sa munceasca in intervalul specificat");

    }

    @Override
    public void nuAreAbsente() {
        System.out.println("Nu are absente");

    }

    @Override
    public void respectaConduita() {
        System.out.println("Angajatul respecta conduita");

    }
}

