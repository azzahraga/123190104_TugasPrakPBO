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
public class Persegi implements BangunDatar {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    @Override
    public double luas(){
        return sisi*sisi;
    } 
    
    @Override
    public double keliling(){
        return 4*sisi;
    }
    
}
