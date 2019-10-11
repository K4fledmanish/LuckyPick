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
public class CPony implements CObject {
    
    String description = "Pony";
    String size;
    boolean sold;

    public String getDesc() {
        return description;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void setValue(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
    
    public String getSize() {
        return size;
    }

    public boolean isSold() {
        return sold;
    }
}
