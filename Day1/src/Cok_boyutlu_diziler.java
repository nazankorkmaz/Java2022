/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Cok_boyutlu_diziler {
    public static void main(String[] args)
    {
        String [][] sehirler= new String[3][3];
        
        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "bursa";
        sehirler[0][2] = "bilecik";
        sehirler[1][0] = "ankara";
        sehirler[1][1] = "konya";
        sehirler[1][2] = "kayseri";
        sehirler[2][0] = "balıkesir";
        sehirler[2][1] = "van";
        sehirler[2][2] = "antalya";
        
        for (int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
                System.out.println(sehirler[i][j]);
            System.out.println("----------");
        }
        

    }
}
