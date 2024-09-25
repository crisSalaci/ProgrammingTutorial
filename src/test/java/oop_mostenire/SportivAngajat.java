package oop_mostenire;

public class SportivAngajat extends Persoana implements SportivInterface, AngajatInterface{

    private String sport;
    private boolean sportEchipa;
    private boolean performanta;
    private int medalii;

    private String firma;
    private String pozitie;
    private int salariu;
    private String experienta;

    public SportivAngajat(String nume, String prenume, int varsta, String sex, String adresa, String sport,
                          boolean sportEchipa, String experienta, boolean performanta, int medalii, String firma,
                          String pozitie, int salariu) {
        super(nume, prenume, varsta, sex, adresa);
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
        this.performanta = performanta;
        this.medalii = medalii;
        this.firma = firma;
        this.pozitie = pozitie;
        this.salariu = salariu;
    }

    @Override
    public void mergeLaAntrenament() {

    }

    @Override
    public void respectaProgramulDeAntrenament() {

    }

    @Override
    public void ajungeLaTimpLaBirou() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void nuAreAbsente() {

    }

    @Override
    public void respectaConduita() {

    }
}
