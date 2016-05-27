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
public class PrimitiveModuleBox extends PrimitiveModule{
    private static PrimitiveModuleBox pmBox;
   
    private PrimitiveModuleBox(){
        setIcon(Constants.ICON_BOX);
    }
  
    public static PrimitiveModuleBox getInstance(){
        if(pmBox == null)
            pmBox = new PrimitiveModuleBox();
        
        return pmBox;
    }
    
    @Override
    public void execute(){
        // change db
        DB.getInstance().getUserBoard()[7 - DB.getInstance().getRowcnt()][DB.getInstance().getColcnt()] = Constants.ICON_BOX;
        
        DB.getInstance().setRowcnt(DB.getInstance().getRowcnt() + 1);
        // change ui
        GameWindow.getInstance().getUserTable().setValueAt(Constants.ICON_BOX, DB.getInstance().getRowcnt(), DB.getInstance().getColcnt());
    }
}
