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
public class Lingkaran implements BangunDatar{
    double jari;
    final double PHI = 3.14;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

     @Override
    public double luas(){
        return PHI*jari*jari;
    } 
    
    @Override
    public double keliling(){
        return 2*PHI*jari;
    }
    
    
}
