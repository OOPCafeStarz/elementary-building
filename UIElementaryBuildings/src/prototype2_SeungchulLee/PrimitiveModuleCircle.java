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
public class PrimitiveModuleCircle extends PrimitiveModule{
    private static PrimitiveModuleCircle pmc;
    
    private PrimitiveModuleCircle(){
        setIcon(Constants.ICON_CIRCLE);
    }
    
    public static PrimitiveModuleCircle getInstance(){
        if(pmc == null)
             pmc = new PrimitiveModuleCircle();
        
        return pmc;
    }

    @Override
    public void execute(){
        // change db
        
        // change ui
    }
}
