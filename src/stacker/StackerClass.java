/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacker;

import java.util.ArrayList;

/**
 *
 * @author zroehl
 */
public class StackerClass<T> {
    private int maxSize;
    private int top;
    private ArrayList<T> items;
    
    public StackerClass(int maxSize)
    {
        items = new ArrayList<>(maxSize);
        this.maxSize = maxSize;
        top = 0;
    }
    
    public void push(T item)
    {
        items.add(top, item);
        top++;
    }
    
    public T pop()
    {
        T tip = items.remove(--top);
        return tip;
    }
}
