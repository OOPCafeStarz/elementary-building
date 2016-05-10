/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype1_MinGyu;

/**
 *
 * @author MinGyu
 */
public class MinQueue {
    private String[] queue = new String[]{" "," "," "," "," "," "," "," "};
    private int index=0;
    private static MinQueue minqueue = new MinQueue();
    private MinQueue(){ }
    
    public static MinQueue getInstance(){
        return minqueue;
    } 
    
    public void inputQueue(String input){
        if(this.index==8)
            return;
        queue[this.index++]=input;
    }
    public void deleteQueue(){
        if(this.index==0)
            return;
        this.index--;
        queue[this.index]=" ";
    }
    public String[] getQueue(){
        return queue;
    }
    public int getIndex(){
        return this.index;
    }
}
