/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Stringlerle_calisma {
    public static void main(String[] args)
    {
        String mesaj= "Bugun hava çok güzel.";
        System.out.println(mesaj);
        System.out.println("eleman sayisi: "+mesaj.length());
        System.out.println("5.eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" YAşasın!"));
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        
        char[] karakterler=new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf('a'));


    }
}
