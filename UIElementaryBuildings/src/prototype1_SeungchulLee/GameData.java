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
        
        // init user board
        userBoard = new UserBoard();
        
        currentContainerModule = 0;
        currentGameState = GAME_STATE_STOP;
    }
    
    public void runCurrentContainerModule(){
        containerModules[currentContainerModule].execute();
    }
    
    public void stop(){
        currentGameState = GAME_STATE_STOP;
    }
    
    public void enqueueIntoCurrentModule(Module m){
        containerModules[currentContainerModule].enqueueIntoExecutableQueue(m);
    }
    
    public static GameData getInstance(){
        if(gameData == null)
            gameData = new GameData();
        
        return gameData;
    }

    public int getCurrentGameState() {
        return currentGameState;
    }
    
    
    
    
    private static GameData gameData;
    private ContainerModule[] containerModules;
    private PrimitiveModule[] primitiveModules;
    private int currentContainerModule;
    private UserBoard userBoard;
    
    private int currentGameState;
    
    public static final int NUM_OF_CONTAINER_MODULES = 4;
    public static final int NUM_OF_PRIMITIVE_MODULES = 4;
    public static final int GAME_STATE_RUNNING = 0;
    public static final int GAME_STATE_STOP = 1;
}
