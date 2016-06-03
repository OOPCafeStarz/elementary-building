/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype3_YongJaeLee;

import elementarybuildingsver2.*;

/**
 *
 * @author user
 */
public class PlayManager {
    
    public static void play(){
        if(DB.getInstance().getCurrentGameState() == Constants.GAME_STATE_RUN) return;
        DB.getInstance().setCurrentGameState(Constants.GAME_STATE_RUN);
        new Thread(){
            @Override
            public void run(){
                DB.getInstance().getCurrentContainerModule().execute();
            }
        }.start();
    }
}
