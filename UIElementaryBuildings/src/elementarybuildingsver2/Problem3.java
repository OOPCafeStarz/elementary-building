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
public class Problem3 extends Problem{
        private Problem3 p;
    
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
    
    public Problem3 getInstance(){
        if(p == null)
            p = new Problem3();
        
        return p;
    }
}
