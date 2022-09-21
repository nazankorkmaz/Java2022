/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class MiniProje5_SayiBulma {
    public static void main(String[] args)
    {
        int [] sayilar= new int[] {1,2,5,7,9,0};
        int aranacak =15;
        boolean varMi=false;
        
        for(int sayi: sayilar)
        {
            if(sayi==aranacak)
            {
                varMi=true;
                break;
            }
        }
        if(varMi)
            System.out.println("Sayı mevcuttur.");
        else
            System.out.println("Sayı bulunamamıştır..");
    }
}
