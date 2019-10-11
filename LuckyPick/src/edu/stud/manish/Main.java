/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.stud.manish;
import java.io.IOException;
import edu.stud.manish.LuckyPickGUI;

/**
 *
 * @author exam
 */
public class Main {
    public static void main(String args[])throws IOException {
        new LuckyPickGUI(PrizeReader.getObjects()).setVisible(true);
    }
    
}
