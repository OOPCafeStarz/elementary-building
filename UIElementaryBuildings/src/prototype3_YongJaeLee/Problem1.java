/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype3_YongJaeLee;

import elementarybuildingsver2.*;

/**
 *
 * @author user
 */
public class Problem1 extends Problem{
    private  static Problem1 p;
    
    private Problem1(){
        
        
        String [][] ans1 = {
        
        {"","□","□","","","■","■",""},
        {"","□","□","","","□","□",""},
        {"","□","□","","","□","□",""},
        {"","□","□","","","□","□",""},
        {"","□","□","","","□","□",""},
        {"","□","□","","","□","□",""},
        {"△","□","□","△","△","□","□","△"},
        {"△","□","□","△","△","□","□","△"}
    };
   
    
        
        setBoard(ans1);
    }
    
    public static Problem1 getInstance(){
        if(p == null)
            p = new Problem1();
        
        return p;
    }
}
