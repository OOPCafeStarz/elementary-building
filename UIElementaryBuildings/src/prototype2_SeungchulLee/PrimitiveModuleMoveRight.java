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
public class PrimitiveModuleMoveRight extends PrimitiveModule{
    private static PrimitiveModuleMoveRight pmmr;
    private String icon = Constants.ICON_MOVE_RIGHT; 

    public static PrimitiveModuleMoveRight getInstance(){
        if(pmmr == null)
            pmmr = new PrimitiveModuleMoveRight();
        
        return pmmr;
    }
    
    @Override
    public void execute(){
        // change db
        
        // change ui
    }
}
