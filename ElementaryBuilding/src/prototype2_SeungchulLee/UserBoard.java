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
public class UserBoard {
    
    public UserBoard(){
        boardIcons = new String[NUM_OF_ROWS][NUM_OF_COLUMNS];
        
        for(int i=0;i<NUM_OF_ROWS;i++){
            boardIcons[i] = new String[NUM_OF_COLUMNS];
        }
    }
    
    public void setIconInUserBoard(int r, int c, String icon){
        if(!rangeCheck(r, c)){
            // TODO: out of bound exception
            return;
        }
        
        boardIcons[r][c] = icon;
        GameUIModifier.setIconInUserBoard(r, c, icon);
    }
    
    public void setIconInUserBoard(String[][] icons){
        
    }
    
    boolean rangeCheck(int r, int c){
        if(r < 0 || r >= NUM_OF_ROWS ||
                c < 0 || c >= NUM_OF_COLUMNS) return false;
        return true;
    }
    
    public String[][] getBoardIcons(){
        return boardIcons.clone();
    }
    
    private String[][] boardIcons;

    public static final int NUM_OF_ROWS = 4;
    public static final int NUM_OF_COLUMNS = 8;
}
