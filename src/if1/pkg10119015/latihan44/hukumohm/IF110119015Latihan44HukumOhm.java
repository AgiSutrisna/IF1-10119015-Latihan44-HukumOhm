/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan44.hukumohm;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Baterai baterai1 = new Baterai();
        Baterai baterai2 = new Baterai(3,12);
        System.out.println("Kuat Arus : " + baterai2.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + baterai2.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + baterai2.hitungTegangan() + " volt");
    }
    
}
