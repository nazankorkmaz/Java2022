/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Stringler2 {
    public static void main(String[] args)
    {
        String mesaj= "Bugun hava çok güzel.";
       // System.out.println(mesaj.trim());
//BAşında sonunda boşlukları atardı
        System.out.println(mesaj);
        
        String yeniMesaj= mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));
        
        for(String kelime: mesaj.split(" "))
        {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        
     



    }
}
