/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype1_MinGyu;

/**
 *
 * @author user
 */
public class AnswerBoard {
    public static final int ANSWER_BOARD_ROW = 8;
    public static final int ANSWER_BOARD_COL = 4;
    
    private String[][] board = new String[ANSWER_BOARD_ROW][ANSWER_BOARD_COL];

    public String[][] getBoard() {
        return board;
    }
    
}
