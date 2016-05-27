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
public class PlayManager {
    
    public static void play(){
        DB.getInstance().setCurrentGameState(Constants.GAME_STATE_RUN);
        DB.getInstance().getCurrentContainerModule().execute();
    }
}
