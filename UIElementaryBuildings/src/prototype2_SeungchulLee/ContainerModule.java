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
public class ContainerModule extends Module{
    private Module[] queue = new Module[Constants.QUEUE_SIZE];
    private int queueRear = 0; // points next position of the last element
    
    public ContainerModule(){
    }
    
    void enqueue(Module m){
        if(queueRear == Constants.QUEUE_SIZE){
            // TODO: dealing with Overflow.
            /* Overflow! */
            return;
        }
        
       queue[queueRear] = m;
       queueRear++;
    }
    
    @Override
    public void execute(){
        Judge.doItJudge();
        for(int i=0;i<queueRear;i++){
            if(DB.getInstance().getCurrentGameState() == Constants.GAME_STATE_STOP) return;
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
            
            queue[i].execute();
            
            Judge.doItJudge();

        }
    }
    
    public void clear(){
        queueRear = 0;
    }
    
    public Module getModuleAt(int index){
        return queue[index];
    }
    
    public int getQueueRear(){
        return queueRear;
    }
}
