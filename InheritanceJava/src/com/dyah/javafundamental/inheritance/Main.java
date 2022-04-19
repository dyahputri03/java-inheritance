package com.dyah.javafundamental.inheritance;

public class Main {
    
    public static void main(String[] args) {
        Menu menu = new Menu(); // memanggil constructor
        pilihanMenu pilihanMenu = new pilihanMenu();
        pilihanMenu.makanan();
        pilihanMenu.minuman();
        
        System.out.println("------------------------");
        
        pilihanMenu.pilihan("Bakso");
    }
}