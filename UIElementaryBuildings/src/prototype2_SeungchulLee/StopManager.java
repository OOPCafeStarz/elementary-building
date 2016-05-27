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
public class StopManager {
    private static StopManager sm;
    
    private StopManager(){}
    
    public static StopManager getInstance(){
        if(sm == null)
            sm = new StopManager();
        
        return sm;
    }
    
    public void stop(){
       
        
        for (int i=0;i<Constants.BOARD_ROW;i++)
        {
            for (int j=0; j<Constants.BOARD_COL;i++)
            {
                DB.getInstance().getUserBoard()[i][j] = "";// db에있는 보드를 초기화
                GameWindow.getInstance().getUserTable().setValueAt("", i, j);//ui에 보이는 것을 초기화
            }
        }   
        DB.getInstance().setColcnt(0);//DB에있는 현재 열의 값을 초기값으로 돌림
        DB.getInstance().setRowcnt(0);//DB에있는 현재 행의 값을 초기값으로 돌림
        DB.getInstance().setCurrentGameState(Constants.GAME_STATE_STOP); 
    }
}
