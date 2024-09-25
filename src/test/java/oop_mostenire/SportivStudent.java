package oop_mostenire;

public class SportivStudent extends Persoana implements StudentInterface, SportivInterface{

    private String sport;
    private boolean sportEchipa;
    private int experienta;
    private boolean performanta;
    private int medalii;

    private String facultate;
    private String domeniu;
    private int an;
    private boolean bursa;
    private boolean restante;

    public SportivStudent(String nume, String prenume, int varsta, String sex, String adresa, String sport, boolean sportEchipa, int experienta, boolean performanta, int medalii, String facultate, String domeniu, int an, boolean bursa, boolean restante) {
        super(nume, prenume, varsta, sex, adresa);
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
        this.performanta = performanta;
        this.medalii = medalii;
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.an = an;
        this.bursa = bursa;
        this.restante = restante;
    }

    @Override
    public void mergeLaAntrenament() {

    }

    @Override
    public void respectaProgramulDeAntrenament() {

    }

    @Override
    public void mergeLaCursuri() {

    }

    @Override
    public void trebuieSaStudieze() {

    }

    @Override
    public void saNuAibaRestante() {

    }

    @Override
    public void saStieSaCopieze() {

    }
}
