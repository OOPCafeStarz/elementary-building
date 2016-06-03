/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarybuildingsver2;

import java.io.Serializable;

/**
 *
 * @author user
 */
public abstract class Problem implements Serializable{
    private String[][] board;

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }
    
    
}
