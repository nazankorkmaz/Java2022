/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Recapdemo2_DizilerleCalisma {
    public static void main(String[] args)
    {
        //double türünde diziler tanımlama
    double[] myList= {1.2,1.3, 4.3,5.6};
    
    //double[] myList = new double[4];
    
    double total=0;
    double max =myList[0];
    for (double number:myList)
    {
        if(max<number)
        {
            max=number;
        }
        total += number;
        System.out.println(number);
    }
    System.out.println("Toplam = " + total);
    System.out.println("En Büyük = " + max);
    }
    

}
