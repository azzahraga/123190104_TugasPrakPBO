/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int pilih;
       char loop;
       boolean bool = false;
       
        do{
       
        System.out.println("+========================+");
        System.out.println("|      RUMUS GEOMETRI    |");
        System.out.println("+========================+");
        System.out.println("| Menu                   |");
        System.out.println("| 1. Persegi             |");
        System.out.println("| 2. Lingkaran           |");
        System.out.println("| 3. Persegi Panjang     |");
        System.out.println("| 4. Segitiga            |");
        System.out.println("| 5. Kubus               |");
        System.out.println("| 6. Silinder            |");
        System.out.println("| 7. Balok               |");
        System.out.println("| 0. EXIT                |");
        System.out.println("+========================+");
        try{
        System.out.print("PILIH : "); 
        pilih = in.nextInt();
        switch(pilih){ 
            case 0 ->{
                System.exit(0);break;
            }
            case 1 -> { 
                persegi();
                break;
            }
            case 2 ->{
                lingkrn();
                break;
            }
            case 3 ->{
                pp();
                break;
            }
            
            case 4 ->{
                segi3();
                break;
            }
            case 5 ->{
                kbs();
                break;
            }
            
            case 6 ->{
                slndr();
                break;
            }
            
            case 7 ->{
                blk();
                break;
            }
            default -> {
                System.out.println("Pilihan menu tidak tersedia");
                break; 
            }}
            
       System.out.print("Kembali ke menu?(y/n) : ");
        }catch (Exception x){
            System.out.println("Hanya bisa menginput angka");
            bool=true;
        }
       loop=in.next().charAt(0);
       System.out.println();
      }while( bool || loop=='y'||loop=='Y');
        System.out.println("TERIMA KASIH!");
       
    }
    
    public static void persegi(){
        Scanner in = new Scanner(System.in);
        double s;
                try{
                System.out.print("Masukan Sisi : "); s = in.nextDouble();
                BangunDatar persegi = new Persegi(s);
                System.out.println("Luas Persegi = "+persegi.luas());
                System.out.println("Keliling Persegi = "+persegi.keliling());
                }catch(Exception i){
                    System.out.println("Error adalah " + i.getMessage() + ", hanya diperbolehkan input angka");
                }
    }
    public static void pp(){
        Scanner in = new Scanner(System.in);
        double p,l;
        try{
            System.out.print("Masukan Panjang : "); p = in.nextDouble();
            System.out.print("Masukan Lebar : "); l = in.nextDouble();
            BangunDatar pp = new Persegipanjang(p,l);
            System.out.println("Luas Persegi Panjang = "+pp.luas());
            System.out.println("Keliling Persegi Panjang = "+pp.keliling());
            }catch(Exception i){
                    System.out.println("Error adalah " + i.getMessage() + ", hanya diperbolehkan input angka");
                }
    }
    public static void lingkrn(){
        Scanner in = new Scanner(System.in);
        double j;
        try{
            System.out.print("Masukan Jari-jari : "); j = in.nextDouble();
            BangunDatar lingkaran  = new Lingkaran(j);
            System.out.println("Luas Lingkaran = "+lingkaran.luas());
            System.out.println("Keliling Lingkaran = "+lingkaran.keliling());
            }catch(Exception i){
                    System.out.println("Error adalah " + i.getMessage() + ", hanya diperbolehkan input angka");
                }
    }
    public static void segi3(){
        Scanner in = new Scanner(System.in);
        double a,t;
        try{
                System.out.print("Masukan Alas : "); a = in.nextDouble();
                System.out.print("Masukan Tinggi : "); t = in.nextDouble();
                BangunDatar segi3 = new Segitiga(a,t);
                System.out.println("Luas Segitiga = "+segi3.luas());
                System.out.println("Keliling Lingkaran = "+segi3.keliling());
                }catch(Exception i){
                    System.out.println("Error adalah " + i.getMessage() + ", hanya diperbolehkan input angka");
                }
    }
    public static void blk(){
        Scanner in = new Scanner(System.in);
        double pj,lb,tg;
        try{
                System.out.print("Masukan Panjang : "); pj = in.nextDouble();
                System.out.print("Masukan Lebar : "); lb = in.nextDouble();
                System.out.print("Masukan Tinggi : "); tg = in.nextDouble();
                Balok balok = new Balok(pj, lb, tg);
                System.out.println("Luas Alas = "+balok.luas());
                System.out.println("Keliling Alas = "+balok.keliling());
                System.out.println("Volume = " + balok.volume());
                System.out.println("Luas Permukaan Balok = "+balok.luasPermukaan());
                }catch(Exception i){
                    System.out.println("Error adalah " + i.getMessage() + ", hanya diperbolehkan input angka");
                }
        
    }
    public static void slndr(){
        Scanner in = new Scanner(System.in);
        double jr, tinggi;
        try{
                System.out.print("Masukan Jari-jari : "); jr = in.nextDouble();
                System.out.print("Masukan Tinggi : "); tinggi = in.nextDouble();
                Silinder silinder  = new Silinder(jr, tinggi);
                System.out.println("Luas Lingkaran = "+silinder.luas());
                System.out.println("Keliling Lingkaran = "+silinder.keliling());
                System.out.println("Volume Silinder = " + silinder.volume());
                System.out.println("Luas Permukaan Silinder = "+silinder.luasPermukaan());
                }catch(Exception i){
                    System.out.println("Error adalah " + i.getMessage() + ", hanya diperbolehkan input angka");
                }
    }
    public static void kbs(){
        Scanner in = new Scanner(System.in);
        double ss;
        try{
                System.out.print("Masukan Sisi : "); ss = in.nextDouble();
                Kubus kubus = new Kubus(ss);
                System.out.println("Luas Persegi = "+kubus.luas());
                System.out.println("Keliling Persegi = "+kubus.keliling());
                System.out.println("Volume Kubus = " +kubus.volume());
                System.out.println("Luas Permukaan Kubus = "+kubus.luasPermukaan());
                }catch(Exception i){
                    System.out.println("Error adalah " + i.getMessage() + ", hanya diperbolehkan input angka");
                }
    }
}


