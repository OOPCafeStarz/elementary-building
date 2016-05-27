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
       
        
      DB.getInstance().clearUserBoard();// 유저보드의 db와 ui를 초기화 시킨다
        
    }
}
