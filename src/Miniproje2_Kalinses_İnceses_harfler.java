/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Miniproje2_Kalinses_İnceses_harfler {
    public static void main(String[] args)
    {
        char harf= 'a';
        switch(harf)
        {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın sesli harfler");
                break;
            default:
                System.out.println("İnce sesli harfler");
         
        }
    }
}
