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
public class Kubus extends Persegi implements BangunRuang{

    public Kubus(double sisi) {
        super(sisi);
    }
    
    @Override
    public double volume(){
       return luas()*sisi;
   }
   
    @Override
    public double luasPermukaan(){
       return 6*sisi*sisi;
   }
   

  
}
