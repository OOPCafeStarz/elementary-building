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
public class PrimitiveModuleMoveLeft extends PrimitiveModule{
    private static PrimitiveModuleMoveLeft pmml; 
    
    private PrimitiveModuleMoveLeft(){
        setIcon(Constants.ICON_MOVE_LEFT);
    }
    
    public static PrimitiveModuleMoveLeft getInstance(){
        if(pmml == null)
            pmml = new PrimitiveModuleMoveLeft();
        
        return pmml;
    }
    
    @Override
    public void execute(){
        UserBoardManager.changeGrabTo((DB.getInstance().getCurrentGrabPosition() - 1 + Constants.BOARD_COL) % Constants.BOARD_COL);
    }
}
