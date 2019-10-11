/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.stud.manish;

/**
 *
 * @author exam
 */
public class CGiftCard implements CObject{
    
    String description = "GiftCard";
    int value;
    boolean sold;

    public String getDesc() {
        return description;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void setSize(String size) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSize() {
        return "null"; //To change body of generated methods, choose Tools | Templates.
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
    
    
    public void setValue(int value) {
        this.value = value;
    }

    public boolean isSold() {
        return sold;
    }
    
    
    
}
