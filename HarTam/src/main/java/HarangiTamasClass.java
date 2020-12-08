/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haran
 */
public class HarangiTamasClass {
    public static int szovegHossz(String szoveg){
        return szoveg.length();
    }
    public static void main(String[] args) {
        String TízBetus = "0123456789";
        System.out.println("A szöveg hossza: " + szovegHossz(TízBetus));
    }
}
