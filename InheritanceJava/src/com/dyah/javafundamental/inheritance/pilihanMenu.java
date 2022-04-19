package com.dyah.javafundamental.inheritance;

public class pilihanMenu extends Menu{
    
    public pilihanMenu(){
    super(); // akan tetap memanggil constructor dari parent Class
    }
    
    public void pilihan(String pilih) { // overloading
        System.out.println("Menu yang dipilih: " + pilih);
    }
}
