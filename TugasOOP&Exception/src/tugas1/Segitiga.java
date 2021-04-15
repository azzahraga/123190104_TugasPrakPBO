/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author asus
 */
public class Segitiga implements BangunDatar{
    double alas,tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
     @Override
    public double luas(){
        return 0.5*alas*tinggi;
    } 

    @Override
    public double keliling() {
        // segitiga sama sisi
        return 3*alas;
    }
    
}
