/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReCap_Demo1;

/**
 *
 * @author Lenovo
 */
public class DortIslem {
    public int Topla(int sayi1, int sayi2)
    {
        return sayi1+sayi2;
    }
    public int Cikar(int sayi1, int sayi2)
    {
        return sayi1-sayi2;
    }
    public int Carp(int sayi1, int sayi2)
    {
        return sayi1*sayi2;
    }
    public int Bol(int sayi1, int sayi2)
    {
        if(sayi2!=0)
            return sayi1/sayi2;
        else
            return 0;
    }
}
