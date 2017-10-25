/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacker;

import java.util.*;

/**
 *
 * @author zroehl
 */
public class Stacker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackerClass<String> stacker = new StackerClass<>(3);
        
        stacker.push("dog");
        stacker.push("cat");
        stacker.push("pig");
        
        System.out.println(stacker.pop());
        System.out.println(stacker.pop());
        System.out.println(stacker.pop());
    }
    
}
