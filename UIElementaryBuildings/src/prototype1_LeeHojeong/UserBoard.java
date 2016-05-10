/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype1_LeeHojeong;

import prototype1.*;

/**
 *
 * @author user
 */
public class UserBoard {
    private static UserBoard ub = new UserBoard();
    private UserBoard(){};
    public static UserBoard getInstance(){
        return ub;
    }
    public static final int USER_BOARD_ROW = 8;
    public static final int USER_BOARD_COL = 4;
    
    private String[][] board = new String[USER_BOARD_ROW][USER_BOARD_COL];
    
    public void setBoard(String[][] board){
        for(int r=0;r<USER_BOARD_ROW;r++){
            for(int c = 0;c<USER_BOARD_COL;c++){
                this.board[r][c] = board[r][c];
            }
        }
        
        // dealing with ui
        for(int i=0;i<USER_BOARD_ROW;i++)
        {
                for(int j=0;j<USER_BOARD_COL;j++)
                {
                        GameViewAndControl.getInstance().getjTable1().setValueAt(UserBoard.getInstance().getBoard()[i][j], i, j);
                }
        }
    }

    public String[][] getBoard() {
        return board;
    }
}
