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
public class PrimitiveModuleStar extends PrimitiveModule{
    private static PrimitiveModuleStar pm;

    private PrimitiveModuleStar(){
        setIcon(Constants.ICON_STAR);
    }
    
    public static PrimitiveModuleStar getInstance(){
        if(pm == null)
            pm = new PrimitiveModuleStar();
        
        return pm;
    }
    
    @Override
    public void execute(){
        UserBoardManager.drop(getIcon());
    }
}
