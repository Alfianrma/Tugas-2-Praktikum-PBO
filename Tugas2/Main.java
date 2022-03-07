
package Tugas2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih,ulang = 0;
        double panjang,lebar,tinggi,jari;
        do{
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih :");
            pilih = input.nextInt();
            if (pilih == 1) {
                System.out.print("Input Panjang : ");
                panjang = input.nextDouble();
                System.out.print("Input Lebar : ");
                lebar = input.nextDouble();
                System.out.print("Input Tinggi: ");
                tinggi = input.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                System.out.println("Luas Persegi Panjang : " + persegiPanjang.luas());
                System.out.println("Keliling Persegi Panjang : " + persegiPanjang.keliling());
                Balok balok = new Balok(panjang, lebar, tinggi);
                System.out.println("Volume Balok : " + balok.volume());
                System.out.println("Luas Permukaan Balok : " + balok.luasPermukaan());
                System.out.println("Ulangi?(ya : 1 || tidak : 0) : ");
                ulang = input.nextInt();
            }
            if(pilih == 2){
                System.out.print("Input Tinggi: ");
                tinggi = input.nextDouble();
                System.out.print("Input Jari-jari : ");
                jari = input.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jari);
                System.out.println("Luas Lingkaran : " + lingkaran.luas());
                System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
                Tabung tabung = new Tabung(tinggi,jari);
                System.out.println("Volume Balok : " + tabung.volume());
                System.out.println("Luas Permukaan Balok : " + tabung.luasPermukaan());
                System.out.println("Ulangi?(ya : 1 || tidak : 0) : ");
                ulang = input.nextInt();
            }
            else if(pilih == 0)
                System.exit(1);
        }while(ulang == 1);
    }
}

