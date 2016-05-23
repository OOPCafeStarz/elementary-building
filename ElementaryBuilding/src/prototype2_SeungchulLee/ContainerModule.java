/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype2_SeungchulLee;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ContainerModule extends Module{
    
    public ContainerModule(){
        executableQueue = new Module[SIZE_OF_EXECUTABLE_QUEUE];
        
        queueRear = 0;
    }
    
    void enqueueIntoExecutableQueue(Module m){
        if(queueRear == SIZE_OF_EXECUTABLE_QUEUE){
            // TODO: dealing with Overflow.
            /* Overflow! */
            return;
        }
        
       executableQueue[queueRear] = m;
       queueRear++;
    }
    
    @Override
    public void execute(){
        for(int i=0;i<queueRear;i++){
            if(GameData.getInstance().getCurrentGameState() == GameData.GAME_STATE_STOP) return;
            
            try {
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ContainerModule.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            executableQueue[i].execute();
        }
    }
    
    private Module[] executableQueue;
    private int queueRear; // points next position of the last element
    
    private static final int SIZE_OF_EXECUTABLE_QUEUE = 10;
}
