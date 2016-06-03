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
public class Problem3 extends Problem{
        private static Problem3 p;
    
    private Problem3(){
        String[][] answerboard= {
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","★","","","",""},
            {"△","","","☆","","","△",""},
            {"■","","","■","","","■",""},
            {"□","○","○","□","○","○","□",""},
            {"■","■","■","■","■","■","■",""},
            {"□","□","□","□","□","□","□",""}
        };
        
        //make board
        
        setBoard(answerboard);
    }
    
    public static Problem3 getInstance(){
        if(p == null)
            p = new Problem3();
        
        return p;
    }
}
