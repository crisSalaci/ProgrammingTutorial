package oop_mostenire;

public class Angajat extends Persoana {

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
}

