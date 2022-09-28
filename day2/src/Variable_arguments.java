/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Variable_arguments {
    public static void main(String[] args)
    {
         int sayi=topla(9,8);
         System.out.println(sayi);
         int toplam =topla2(2,3,4,-4,5,6);
         System.out.println(toplam);
    }
    public static int topla(int a,int b)
    {
        return(a+b);
    }
    
    //int array gibi çalısır.
   public static int topla2(int... sayilar)
   {
       int toplam=0;
       for (int sayi: sayilar)
       {
           toplam+=sayi;
       }
       return toplam;
   }
}
