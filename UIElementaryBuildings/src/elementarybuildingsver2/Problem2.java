/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarybuildingsver2;

/**
 *
 * @author user
 */
public class Problem2 extends Problem{
    private static Problem2 p;
      private Problem2(){
        
        
        String [][] ans2 = {
        
        {"","●","●","","","●","●",""},
        {"","■","■","","","★","★",""},
        {"","□","□","","","□","□",""},
        {"","□","□","","","□","□",""},
        {"","□","□","","","□","□",""},
        {"","□","□","","","□","□",""},
        {"▲","□","□","▲","▲","□","□","▲"},
        {"△","■","■","△","△","■","■","△"}
    };
   
    
        
        setBoard(ans2);
    }
    
    
     public static  Problem2 getInstance(){
        if(p == null)
            p = new Problem2();
        
        return p;
    }
}
