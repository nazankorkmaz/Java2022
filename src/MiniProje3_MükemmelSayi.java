/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class MiniProje3_MükemmelSayi {
    public static void main(String[] args)
    {
        int number=28;
        int total=0;
        for(int i=1; i<number;i++)
        {
            if(number%i==0)
                total+=i;
        }
        if(total==number)
            System.out.println("Mükemmel sayıdır...");
        else
            System.out.println("Mükemmel sayı değildir...");
    }
}
