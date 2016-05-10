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
public class GameData {
    
    private GameData(){
        this.containerModules = new ContainerModule[NUM_OF_CONTAINER_MODULES];
        this.primitiveModules = new PrimitiveModule[NUM_OF_PRIMITIVE_MODULES];
        
        for(int i=0;i<NUM_OF_CONTAINER_MODULES;i++)
            containerModules[i] = new ContainerModule();
        for(int i=0;i<NUM_OF_PRIMITIVE_MODULES;i++)
            primitiveModules[i] = new PrimitiveModule();
        
        currentContainerModule = 0;
        
    }
    
    public void enqueueIntoCurrentModule(Module m){
        containerModules[currentContainerModule].enqueueIntoExecutableQueue(m);
    }
    
    public GameData getInstance(){
        if(gameData == null)
            gameData = new GameData();
        
        return gameData;
    }
    
    
    private static GameData gameData;
    private final ContainerModule[] containerModules;
    private final PrimitiveModule[] primitiveModules;
    private int currentContainerModule;

    private static final int NUM_OF_CONTAINER_MODULES = 4;
    private static final int NUM_OF_PRIMITIVE_MODULES = 4;
}
