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
public class PlayManager {
    private static PlayManager pm;
    
    private PlayManager(){}
    
    public static PlayManager getInstance(){
        if(pm == null)
            pm = new PlayManager();
        
        return pm;
    }
    
    public void play(){
        DB.getInstance().getCurrentContainerModule().execute();
    }
}
