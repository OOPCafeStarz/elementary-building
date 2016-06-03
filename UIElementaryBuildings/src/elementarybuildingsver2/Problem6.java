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
public class Problem6 extends Problem{
       private static Problem6 p;
    
    private Problem6(){
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
    
    public static  Problem6 getInstance(){
        if(p == null)
            p = new Problem6();
        
        return p;
    }
}
