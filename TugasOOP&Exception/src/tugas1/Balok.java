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
public class Balok extends Persegipanjang implements BangunRuang{
    
    double tinggi;
   
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume(){
       return luas()*tinggi;
   }
   
    @Override
    public double luasPermukaan(){
     return 2*((luas())+ (panjang*tinggi) +(lebar*tinggi));
       
   }
    
    
}
