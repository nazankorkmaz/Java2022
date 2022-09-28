/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesWithAttributes;

//özellik tutma
public class Product {
   
    public Product(int id, String name, String description, double price, int stockAmount, String renk)
    {
        System.out.println("Yapıcı blok çalıştı.");
        this.id=id;
        this.description=description;
        this.name=name;
        this.price=price;
        this.renk=renk;
        this.stockAmount=stockAmount;
    }
    public Product()
    {
        //Overloading
    }
    // attribute || field
    
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod ;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the stockAmount
     */
    public int getStockAmount() {
        return stockAmount;
    }

    /**
     * @param stockAmount the stockAmount to set
     */
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kod
     */
    public String getKod() {
        return this.name.substring(0,1)+id  ;
    }

    
    
    
    
}
