/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zroehl
 */
public class StackerClass {
    private int maxSize;
    private int top;
    private int[] items;
    
    public StackerClass(int maxSize)
    {
        items = new int[maxSize];
        this.maxSize = maxSize;
        top = 0;
    }
    
    public void push(int item)
    {
        items[top] = item;
        top++;
    }
    
    public int pop()
    {
        return items[--top];
    }
    
    public boolean isEmpty()
    {
        return (top == 0);
    }
}
