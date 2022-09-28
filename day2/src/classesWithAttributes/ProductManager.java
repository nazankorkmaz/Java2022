/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesWithAttributes;

/**
 *
 * @author Lenovo
 */
public class ProductManager {
    public void Add(Product product)
    {
        //JDBC
        System.out.println("Ürün eklendi "+ product.getName() );
    }
}
