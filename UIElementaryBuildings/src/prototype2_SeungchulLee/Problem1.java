/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype2_SeungchulLee;

/**
 *
 * @author user
 */
public class Problem1 extends Problem{
    private Problem1 p;
    
    private Problem1(){
        String[][] answerboard = new String[Constants.BOARD_ROW][Constants.BOARD_COL];
        
        //make board
        
        setBoard(answerboard);
    }
    
    public Problem1 getInstance(){
        if(p == null)
            p = new Problem1();
        
        return p;
    }
}
