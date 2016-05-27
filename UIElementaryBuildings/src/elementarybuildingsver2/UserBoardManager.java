/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarybuildingsver2;


/**
 *
 * @author user
 */
public class UserBoardManager {
    public static void drop(String item)
    {
        String[][] userboard = DB.getInstance().getUserBoard();
        int currentGrabPosition = DB.getInstance().getCurrentGrabPosition();
        
        for(int i=Constants.BOARD_ROW-1;i>=0;i--){
            if(userboard[i][currentGrabPosition] == ""){
                // change db
                userboard[i][currentGrabPosition] = item;
                
                // change ui
                GameWindow.getInstance().getUserTable().setValueAt(item, i, currentGrabPosition);
                
                break;
            }
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
}
