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
public class UserBoard {
    public static final int USER_BOARD_ROW = 8;
    public static final int USER_BOARD_COL = 4;
    
    private String[][] board = new String[USER_BOARD_ROW][USER_BOARD_COL];
    private static UserBoard userBoard = new UserBoard();
    private UserBoard(){
        
    }
    public static UserBoard getInstance(){
        return userBoard;
    }
    public String[][] getBoard() {
        return board;
    }
}
