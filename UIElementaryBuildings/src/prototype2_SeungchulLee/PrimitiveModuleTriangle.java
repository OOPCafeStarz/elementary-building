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
         if(DB.getInstance().getRowcnt()==8) // 보드 사이즈는 8
            return; 
        // change db
        DB.getInstance().getUserBoard()[DB.getInstance().getRowcnt()][DB.getInstance().getColcnt()] = Constants.ICON_TRIANGLE;
        
        DB.getInstance().setRowcnt(DB.getInstance().getRowcnt() + 1);
        // change ui
        GameWindow.getInstance().getUserTable().setValueAt(Constants.ICON_TRIANGLE, Constants.BOARD_ROW - DB.getInstance().getRowcnt(), DB.getInstance().getColcnt());
    }
}
