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
public class PrimitiveModuleBox extends PrimitiveModule{
    private static PrimitiveModuleBox pmBox;
    
    private String icon = Constants.ICON_BOX; 
    
    private PrimitiveModuleBox(){}
  
    public static PrimitiveModuleBox getInstance(){
        if(pmBox == null)
            pmBox = new PrimitiveModuleBox();
        
        return pmBox;
    }
    
    @Override
    public void execute(){
        // change db
        
        // change ui
    }
}
