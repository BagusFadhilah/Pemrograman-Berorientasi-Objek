/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunRuang;

/**
 *
 * @author bagus
 */
public class BangunRuang {
    double a;
    double b;

    BangunRuang (double alas, double tinggi) {
        a = alas;
        b = tinggi;
    }

    public void hitungLuas() {
        double luas = a * b;
    }
}

class segitiga extends BangunRuang {
    segitiga (double alas, double tinggi) {
        super(alas, tinggi);
    }
    
    public void hitungLuas() {
        double luas = a * b / 2;
        System.out.println("Alas = " + a);
        System.out.println("Tinggi = " + b);
        System.out.println("Luas Segitiga = " + luas);
    }
}

class persegiPanjang extends BangunRuang {
    persegiPanjang (double panjang, double lebar) {
        super(panjang, lebar);
    }
    
    public void hitungLuas() {
        double luas = a * b;
        System.out.println("Panjang = " + a );
        System.out.println("Lebar = " + b );
        System.out.println("Luas Persegi Panjang = " + luas);
    }
}
