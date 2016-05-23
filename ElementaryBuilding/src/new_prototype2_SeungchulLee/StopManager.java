/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_prototype2_SeungchulLee;

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
        
    }
}
