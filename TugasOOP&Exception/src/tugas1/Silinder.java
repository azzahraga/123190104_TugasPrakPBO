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
public class Silinder extends Lingkaran implements BangunRuang{
    
    double tinggi;
    
    public Silinder(double jari, double tinggi) {
        super(jari);
        this.tinggi= tinggi;
    }
    
    @Override
    public double volume(){
       return luas()*tinggi;
   }
   
    @Override
    public double luasPermukaan(){
       return keliling()*(jari+tinggi);
   }
}
