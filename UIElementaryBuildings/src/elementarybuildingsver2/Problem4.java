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
public class Problem4 extends Problem{
       private Problem4 p;
    
    private Problem4(){
        String[][] answerboard = {
            {"△","","","","","","","△"},
            {"■","","","","","","","■"},
            {"□","","","☆","☆","","","□"},
            {"□","","△","▲","▲","△","","□"},
            {"□","△","■","○","○","■","△","□"},
            {"○","■","□","●","●","□","■","○"},
            {"■","□","■","△","△","■","□","■"},
            {"□","■","□","■","■","□","■","□"}
        };
        
        setBoard(answerboard);
    }
    
    public Problem4 getInstance(){
        if(p == null)
            p = new Problem4();
        
        return p;
    }
}
