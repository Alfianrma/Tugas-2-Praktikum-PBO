package Tugas2;

public class Tabung implements MenghitungRuang{
    double jari;
    double tinggi;

    public Tabung(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {

        return (Math.PI*jari*jari*tinggi);
    }

    @Override
    public double luasPermukaan() {

        return (2*Math.PI*jari*(jari+tinggi));
    }
}
