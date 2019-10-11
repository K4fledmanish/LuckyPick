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
public class PrizeReader {
    
    public static CObject[] getObjects() {
        
        CObject[] objects = new CObject[16];
        
        CPony ponyOne = new CPony();
        ponyOne.setSize("Medium");
        objects[0] = (CObject) ponyOne;
        
        CPony ponyTwo = new CPony();
        ponyTwo.setSize("Medium");
        objects[1] = (CObject) ponyTwo;
        
        CPony ponyThree = new CPony();
        ponyThree.setSize("Medium");
        objects[2] = (CObject) ponyThree;
        
        CPony ponyFour = new CPony();
        ponyFour.setSize("Medium");
        objects[3] = (CObject) ponyFour;
        
        CPony ponyFive = new CPony();
        ponyFive.setSize("Large");
        objects[4] = (CObject) ponyFive;
        
        CPony ponySix = new CPony();
        ponySix.setSize("Large"); 
        objects[5] = (CObject) ponySix;
        
        CPony ponySeven = new CPony();
        ponySeven.setSize("Large");
        objects[6] = (CObject) ponySeven;
        
        CPony ponyEight = new CPony();
        ponyEight.setSize("Large");
        objects[7] = (CObject) ponyEight;
        
        CBear bearOne = new CBear();
        bearOne.setSize("Small");
        objects[8] = (CObject) bearOne;
        
        CBear bearTwo = new CBear();
        bearTwo.setSize("Small");
        objects[9] = (CObject) bearTwo;
        
        CBear bearThree = new CBear();
        bearThree.setSize("Small");
        objects[10] = (CObject) bearThree;
        
        CBear bearFour = new CBear();
        bearFour.setSize("Large");
        objects[11] = (CObject) bearFour;
        
        CBear bearFive = new CBear();
        bearFive.setSize("Large");
        objects[12] = (CObject) bearFive;
        
        CBear bearSix = new CBear();
        bearSix.setSize("Large");
        objects[13] = (CObject) bearSix;
        
        CGiftCard giftCardOne = new CGiftCard();
        giftCardOne.setValue(50);
        objects[14] = (CObject) giftCardOne;
        
        CGiftCard giftCardTwo = new CGiftCard();
        giftCardTwo.setValue(100);
        objects[15] = (CObject) giftCardTwo;
        
        return objects;
        
    }
    
    public static void main(String args[]) {
        PrizeReader.getObjects();
    }
    
}
