/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesWithAttributes;


public class Main {
    public static void main(String[] args)
    {
        Product product= new Product(1,"laptop","Asus Laptop",3000,2,"Siyah");
        /*
        Product product =new Product();
        product.setName("Laptop");
        product.setId(1); ;
        product.setDescription("Asus Laptop") ;
        product.setPrice(5000) ;
        product.setStockAmount(3);
        */
        System.out.println(product.getKod());
        
        ProductManager pm=new ProductManager();
        pm.Add(product);
        //System.out.println(product.name);
    }
}
