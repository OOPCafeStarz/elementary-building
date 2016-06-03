/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype3_YongJaeLee;

import elementarybuildingsver2.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author user
 */
public class UserBoardManager {
    public static void drop(String item)
    {
        if(item == Constants.ICON_BLACK_HEART){
            dropInk(item);
            return;
        }
        
        String[][] userboard = DB.getInstance().getUserBoard();
        int currentGrabPosition = DB.getInstance().getCurrentGrabPosition();
        
        for(int i=0;i<Constants.BOARD_ROW;i++){
            if(userboard[i][currentGrabPosition] == ""){
                if(i == Constants.BOARD_ROW-1 ||
                   userboard[i+1][currentGrabPosition] != ""){
                    // change db
                    userboard[i][currentGrabPosition] = item;
                
                    // change ui
                    GameWindow.getInstance().getUserTable().setValueAt(item, i, currentGrabPosition);
                
                    break;
                }else{
                    GameWindow.getInstance().getUserTable().setValueAt(item, i, currentGrabPosition);
                
                    try {
                        Thread.sleep(Constants.DELAY_TIME_DROP_ITEM);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(UserBoardManager.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    GameWindow.getInstance().getUserTable().setValueAt("", i, currentGrabPosition);
                }
            }else break;
        }
    }
    
    public static void changeGrabTo(int col)
    {
        // change ui
        GameWindow.getInstance().getGrabTable().setValueAt("", 0, DB.getInstance().getCurrentGrabPosition());
        GameWindow.getInstance().getGrabTable().setValueAt("↓", 0, col);
    
        // change db
        DB.getInstance().setCurrentGrabPosition(col);
    }
    
    public static void clearUserboard()
    {
        // change ui
        GameWindow.getInstance().getGrabTable().setValueAt("", 0, DB.getInstance().getCurrentGrabPosition());
        GameWindow.getInstance().getGrabTable().setValueAt("↓", 0, 0);
        
        // change db
        DB.getInstance().setCurrentGrabPosition(0);
        for (int i=0;i<Constants.BOARD_ROW;i++)
        {
            for (int j=0; j<Constants.BOARD_COL;j++)
            {
                DB.getInstance().getUserBoard()[i][j] = "";// db에있는 보드를 초기화
                GameWindow.getInstance().getUserTable().setValueAt("", i, j);//ui에 보이는 것을 초기화
            }
        } 
    }
    
    private static void dropInk(String item){
        // change db
        String[][] userboard = DB.getInstance().getUserBoard();
        int currentGrabPosition = DB.getInstance().getCurrentGrabPosition();
        
        for(int i=0;i<Constants.BOARD_ROW;i++){
            if(userboard[i][currentGrabPosition] == ""){
                GameWindow.getInstance().getUserTable().setValueAt(item, i, currentGrabPosition);
                
                try {
                    Thread.sleep(Constants.DELAY_TIME_DROP_ITEM);
                } catch (InterruptedException ex) {
                    Logger.getLogger(UserBoardManager.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                GameWindow.getInstance().getUserTable().setValueAt("", i, currentGrabPosition);
            
            }else{
                String s = userboard[i][currentGrabPosition];
                
                if(s == Constants.ICON_BOX){
                    // change db
                    userboard[i][currentGrabPosition] = Constants.ICON_BLACK_BOX;
                    
                    // change ui
                    GameWindow.getInstance().getUserTable().setValueAt(Constants.ICON_BLACK_BOX, i, currentGrabPosition);
                }
                else if(s == Constants.ICON_CIRCLE){
                    // change db
                    userboard[i][currentGrabPosition] = Constants.ICON_BLACK_CIRCLE;

                    // change ui
                    GameWindow.getInstance().getUserTable().setValueAt(Constants.ICON_BLACK_CIRCLE, i, currentGrabPosition);
                }
                else if(s == Constants.ICON_TRIANGLE){
                     // change db
                    userboard[i][currentGrabPosition] = Constants.ICON_BLACK_TRIANGLE;

                    // change ui
                    GameWindow.getInstance().getUserTable().setValueAt(Constants.ICON_BLACK_TRIANGLE, i, currentGrabPosition);
                
                }
                else if(s == Constants.ICON_STAR){
                     // change db
                    userboard[i][currentGrabPosition] = Constants.ICON_BLACK_STAR;

                    // change ui
                    GameWindow.getInstance().getUserTable().setValueAt(Constants.ICON_BLACK_STAR, i, currentGrabPosition);
                }
                
                break;
            }
        }
    }
}
