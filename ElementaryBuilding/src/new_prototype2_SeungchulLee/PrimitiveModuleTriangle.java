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
public class PrimitiveModuleTriangle extends PrimitiveModule{
    private static PrimitiveModuleTriangle pmt;
    private String icon = Constants.ICON_TRIANGLE; 

    private PrimitiveModuleTriangle(){}
    
    public static PrimitiveModuleTriangle getInstance(){
        if(pmt == null)
            pmt = new PrimitiveModuleTriangle();
        
        return pmt;
    }
    
    @Override
    public void execute(){
        // change db
        
        // change ui
    }
}
