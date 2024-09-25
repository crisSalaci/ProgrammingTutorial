package oop_v2;

public abstract class Persoana {
    //o clasa abstracta functioneaza aproape la fel ca o clasa normala
    //o clasa abstracta poate sau nu sa contina metode abstracte
    //putem mosteni o singura clasa abstracta
    //pentru a defini o metoda abstracta folosim cuvantul abstract
    //intr-o clasa abstracta putem avea metode care au diferit access control
    //o clasa abstracta poate avea un constructor => nu putem face un obiect
    //o clasa abstracta poate implementa o interfata

    private String nume;
    private String prenume;
    private int varsta;
    private String sex;
    private String adresa;

    public Persoana(String nume, String prenume, int varsta, String sex, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.adresa = adresa;
    }

    //definim in aceasta clasa abstracta toate metodele abstracte din cele 3 interfete din pachetul v1
    public abstract void ajungeLaTimpLaBirou();
    public abstract void munceste();
    public abstract void nuAreAbsente();
    public abstract void respectaConduita();

    public abstract void mergeLaAntrenament();
    public abstract void respectaProgramulDeAntrenament();

    public abstract void mergeLaCursuri();
    public abstract void trebuieSaStudieze();
    public abstract void saNuAibaRestante();
    public abstract void saStieSaCopieze();


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
