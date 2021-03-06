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
        if(DB.getInstance().getRowcnt()==8) // 보드 사이즈는 8
            return; 
        // change db
        DB.getInstance().getUserBoard()[DB.getInstance().getRowcnt()][DB.getInstance().getColcnt()] = Constants.ICON_BOX;
        
        DB.getInstance().setRowcnt(DB.getInstance().getRowcnt() + 1);
        // change ui
        GameWindow.getInstance().getUserTable().setValueAt(Constants.ICON_BOX, Constants.BOARD_ROW- DB.getInstance().getRowcnt(), DB.getInstance().getColcnt());
    }
}
