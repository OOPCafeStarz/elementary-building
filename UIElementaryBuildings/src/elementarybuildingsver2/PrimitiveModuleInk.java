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
public class PrimitiveModuleInk extends PrimitiveModule{
    private static PrimitiveModuleInk pmInk;
   
    private PrimitiveModuleInk(){
        setIcon(Constants.ICON_BLACK_HEART);
    }
  
    public static PrimitiveModuleInk getInstance(){
        if(pmInk == null)
            pmInk = new PrimitiveModuleInk();
        
        return pmInk;
    }
    
    @Override
    public void execute(){
        SoundManager.getInstance().playWaterdropSound();
        UserBoardManager.drop(getIcon());
    }
}
