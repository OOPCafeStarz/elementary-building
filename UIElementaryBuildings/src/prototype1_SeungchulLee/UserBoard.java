/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype1_SeungchulLee;

/**
 *
 * @author user
 */
public class UserBoard {
    
    public UserBoard(){
        boardIcons = new String[NUM_OF_ROWS][NUM_OF_COLUMNS];
        
        for(int i=0;i<NUM_OF_ROWS;i++){
            boardIcons[i] = new String[NUM_OF_COLUMNS];
        }
    }
    
    private String[][] boardIcons;

    public static final int NUM_OF_ROWS = 4;
    public static final int NUM_OF_COLUMNS = 8;
}
