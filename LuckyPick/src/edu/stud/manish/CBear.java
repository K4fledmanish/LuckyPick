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
public class CBear implements CObject {
    
    String description = "Bear";
    int value;
    String size;
    boolean sold;

    @Override
    public String getDesc() {
        return description;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void setValue(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSold(boolean sold) {
        this.sold = sold;
    }
    
    
    

    @Override
    public void setSize(String size) {
        this.size = size;
    }
    
    @Override
    public boolean isSold() {
        return sold;
    }
    
    
    

    
    
    
    
}
