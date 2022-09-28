/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Switch {
    public static void main(String[] args)
    {
        char grade = 'B';
        
        switch (grade)
        {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Gçtiniz");
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
        }
    }
}
