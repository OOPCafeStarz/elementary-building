/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype1_YongJaeLee;

import prototype1.*;

/**
 *
 * @author user
 */
public class UserBoard {
    
    public static UserBoard ub = new UserBoard();
    private UserBoard() {
        
    };
    public static UserBoard getInstance() {
        return ub;
    }
    
    private int rowcnt = 0;
    private int colcnt = 0;
    public static final int USER_BOARD_ROW = 8;
    public static final int USER_BOARD_COL = 4;
    
    private String[][] board = new String[USER_BOARD_ROW][USER_BOARD_COL];
    
    public void initialBoard() {
        
        for(int i=0; i<USER_BOARD_ROW; i++)
        {
            for(int j=0; j<USER_BOARD_COL; j++)
            {
                board[i][j] = " ";
            }
        }
    }

    public int getRowcnt() {
        return rowcnt;
    }

    public void setRowcnt(int rowcnt) {
        this.rowcnt = rowcnt;
    }

    public int getColcnt() {
        return colcnt;
    }

    public void setColcnt(int colcnt) {
        this.colcnt = colcnt;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }
   
    public String[][] getBoard() {
        return board;
    }
}
