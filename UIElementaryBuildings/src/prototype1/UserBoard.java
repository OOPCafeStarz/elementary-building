/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype1;

/**
 *
 * @author user
 */
public class UserBoard {
    public static final int USER_BOARD_ROW = 8;
    public static final int USER_BOARD_COL = 4;
    
    private String[][] board = new String[USER_BOARD_ROW][USER_BOARD_COL];
    
    public UserBoard(){
        
    }

    public String[][] getBoard() {
        return board;
    }
}
