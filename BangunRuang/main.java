/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunRuang;

public class main {
    public static void main(String[] args) {
        segitiga triangle = new segitiga(5, 20);
        persegiPanjang rectangle = new persegiPanjang(4, 18);

        triangle.hitungLuas();
        rectangle.hitungLuas();
    }
}