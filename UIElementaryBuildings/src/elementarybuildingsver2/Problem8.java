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
public class Problem8 extends Problem{
        private static Problem8 p;
    
    private Problem8(){
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
    
    public static Problem8 getInstance(){
        if(p == null)
            p = new Problem8();
        
        return p;
    }
}
