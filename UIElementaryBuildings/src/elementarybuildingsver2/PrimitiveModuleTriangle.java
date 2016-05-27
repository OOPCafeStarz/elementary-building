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
public class PrimitiveModuleTriangle extends PrimitiveModule{
    private static PrimitiveModuleTriangle pmt;

    private PrimitiveModuleTriangle(){
        setIcon(Constants.ICON_TRIANGLE);
    }
    
    public static PrimitiveModuleTriangle getInstance(){
        if(pmt == null)
            pmt = new PrimitiveModuleTriangle();
        
        return pmt;
    }
    
    @Override
    public void execute(){
        UserBoardManager.drop(getIcon());
    }
}