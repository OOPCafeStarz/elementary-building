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
public class PrimitiveModuleMoveRight extends PrimitiveModule{
    private static PrimitiveModuleMoveRight pmmr;

    private PrimitiveModuleMoveRight(){
        setIcon(Constants.ICON_MOVE_RIGHT);
    }
    
    public static PrimitiveModuleMoveRight getInstance(){
        if(pmmr == null)
            pmmr = new PrimitiveModuleMoveRight();
        
        return pmmr;
    }
    
    @Override
    public void execute(){
                UserBoardManager.changeGrabTo((DB.getInstance().getCurrentGrabPosition() + 1) % Constants.BOARD_COL);
    }
}
