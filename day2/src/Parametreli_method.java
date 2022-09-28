/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Parametreli_method {
    public static void main(String[] args)
    {
        String mesaj = " Artık sonbahardayız";
         String yenimesaj= sehirVer();
         System.out.println(yenimesaj);
         int sayi=topla(9,8);
         System.out.println(sayi);
    }
    public static void ekle()
    {
        System.out.println("Eklendi");
    }
    public static void sil()
    {
        System.out.println("Silindi");
    }
    public static void guncelle()
    {
        System.out.println("Güncellendi");
    }
    public static int topla(int a,int b)
    {
        return(a+b);
    }
    public static String sehirVer()
    {
        return "İstanbul";
    }
}
