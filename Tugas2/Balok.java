package Tugas2;

public class Balok implements MenghitungRuang{
    double panjang;
    double lebar;
    double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }


    @Override
    public double volume() {
        return (panjang*lebar*tinggi);
    }

    @Override
    public double luasPermukaan() {
        return (2*(panjang*lebar+panjang*tinggi+lebar*tinggi));
    }
}
