/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype2_SeungchulLee;

import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author user
 */
public class QueueManager {
    private static QueueManager instance;
    
    private QueueManager(){
        
    }
    
    public static QueueManager getInstance(){
        if(instance == null)
            instance = new QueueManager();
        
        return instance;
    }
    
    public void enqueuePrimitiveModule(int index){
        // primitive queue db change
        DB.getInstance().enqueuePrimitiveModule(index);
        System.out.println("asdfsadf");
        
        // queue ui change
        showQueue();
    }
    
    public void enqueueContainerModule(int index){
        // container queue db change
        DB.getInstance().enqueueContainerModule(index);
        
        // queue ui change
        showQueue();

    }
    
    public void changeCurModuleTo(int index){
        // current queue db change
        DB.getInstance().setCurrentContainerModule(index);
      
        // queue ui change
        showQueue();
    }
    
    public void clearCurrentQueue(){
        // current queue db change
        DB.getInstance().clearCurrentModule();
        
        // queue ui change
        showQueue();

    }
    
    private void showQueue(){
        clearUIQueue();
        
        System.out.println("asdfsdfsdfsfdsdfsdfsdf");
        
        // queue ui change
        ContainerModule ccm = DB.getInstance().getCurrentModule();
        int size = DB.getInstance().getcurrentContainerModuleIndex();
        String icon = ccm.getIcon();
        
        JTable queue = GameWindow.getInstance().getQueue();
        JTableHeader th = queue.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        TableColumn tc = tcm.getColumn(0);
        tc.setHeaderValue(icon); // queue header change
        
        for(int i=0;i<size;i++){
            int queuePosition = (Constants.QUEUE_SIZE-1) - i;
            queue.setValueAt(ccm.getModuleAt(i).getIcon(), 0, queuePosition);    
        }
    }
    
    private void clearUIQueue(){
        System.out.println("XXX");
        
        // queue ui change
        int currentContainerModuleIndex = DB.getInstance().getcurrentContainerModuleIndex();
        JTable queue = GameWindow.getInstance().getQueue();
        GameWindow.getInstance().getQueueName().setText(Integer.toString(currentContainerModuleIndex));
        
        for(int i=0;i<Constants.QUEUE_SIZE;i++){
            queue.setValueAt(" ", 0, i);    
        }
        
                System.out.println("ZZZ");

    }
}
