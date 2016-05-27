/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarybuildingsver2;

import java.util.logging.Level;
import java.util.logging.Logger;

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
        DB.getInstance().setCurrentGameState(Constants.GAME_STATE_STOP);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(StopManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        UserBoardManager.clearUserboard();
    }
}
