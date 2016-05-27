/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarybuildingsver2;

import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author user
 */
public class QueueManager {
    public static void enqueuePrimitiveModule(int index){
        // DB
        DB.getInstance().enqueuePrimitiveModule(index);
        
        // queue ui change
        showQueue();
    }
    
    public static void enqueueContainerModule(int index){
        // container queue db change
        DB.getInstance().enqueueContainerModule(index);
        
        // queue ui change
        showQueue();
    }
    
    public static void changeCurModuleTo(int index){
        // current queue db change
        DB.getInstance().setCurrentContainerModule(index);
      
        // queue ui change
        showQueue();
    }
    
    public static void clearCurrentQueue(){
        // current queue db change
        DB.getInstance().clearCurrentModule();
        
        // queue ui change
        clearUIQueue();
    }
    
    private static void showQueue(){
        clearUIQueue();
        
        GameWindow gw = GameWindow.getInstance();
        DB db = DB.getInstance();
        String currentContainerModuleName = db.getCurrentContainerModule().getIcon();
        
        // 큐 이름 출력
        gw.getQueueName().setText(currentContainerModuleName);
        
        // 큐 내용 출력
        ContainerModule currentContainerModule = db.getCurrentContainerModule();
        int queueSize = currentContainerModule.getQueueRear(); 
        
        for(int i=0;i<queueSize;++i){
            String icon = currentContainerModule.getModuleAt(i).getIcon();
            gw.getQueue().setValueAt(icon, Constants.QUEUE_SIZE-1-i, 0);
        }
    }
    
    private static void clearUIQueue(){
        for(int i=0; i<Constants.QUEUE_SIZE; i++){
            GameWindow.getInstance().getQueue().setValueAt("",i, 0);
        }
    }
}
