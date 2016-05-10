/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype1_SeungchulLee;

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
        for(int i=0;i<queueRear;i++)
            executableQueue[i].execute();
    }
    
    private Module[] executableQueue;
    private int queueRear; // points next position of the last element
    
    private static final int SIZE_OF_EXECUTABLE_QUEUE = 10;
}
