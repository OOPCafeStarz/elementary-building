/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarybuildingsver2;

import java.io.Serializable;


/**
 *
 * @author user
 */
public class DB implements Serializable{
    private static DB db;
    private ContainerModule[] containerModules = new ContainerModule[Constants.NUM_CONTAINER_MODULE_BUTTON];
    private PrimitiveModule[] primitiveModules = new PrimitiveModule[Constants.NUM_PRIMITIVE_MODULE_BUTTON];
    private String[][] userBoard = new String[Constants.BOARD_ROW][Constants.BOARD_COL];
    private String[][] answerBoard = new String[Constants.BOARD_ROW][Constants.BOARD_COL];
    private int currentGrabPosition;
    private int currentContainerModuleIndex = 0;
    private int currentGameState = Constants.GAME_STATE_STOP;
    private Problem[] problems = new Problem[Constants.NUM_SELECT_PROBLEM_BUTTON];
    
    public int getCurrentGrabPosition() {
        return currentGrabPosition;
    }

    public void setCurrentGrabPosition(int currentGrabPosition) {
        this.currentGrabPosition = currentGrabPosition;
    }   

    public int getCurrentGameState(){
        return currentGameState;
    }
    
    public void setCurrentGameState(int newGameState){
        currentGameState = newGameState;
    }
    
    public String[][] getUserBoard() {
        return userBoard;
    }

    public void setUserBoard(String[][] userBoard) {
        this.userBoard = userBoard;
    }

    public String[][] getAnswerBoard() {
        return answerBoard;
    }
    public void setAnswerBoard(String[][] answerBoard) {
        this.answerBoard = answerBoard;
    }
    public static void setDB(DB input){
        DB.db=input;
    }
    public ContainerModule[] getContainerModules() {
        return containerModules;
    }

    public void setContainerModules(ContainerModule[] containerModules) {
        this.containerModules = containerModules;
    }

    public int getCurrentContainerModuleIndex() {
        return currentContainerModuleIndex;
    }

    public void setCurrentContainerModuleIndex(int currentContainerModuleIndex) {
        this.currentContainerModuleIndex = currentContainerModuleIndex;
    }
    
    private DB(){
        init();
    }
    
    private void init(){
        
        // userboard and answerboard init
        for(int i=0;i<Constants.BOARD_ROW; i++)
        { 
            userBoard[i] = new String[Constants.BOARD_COL];
            answerBoard[i] = new String[Constants.BOARD_COL];
            
            for(int j=0; j<Constants.BOARD_COL; j++)
            {
                userBoard[i][j] = "";
                answerBoard[i][j] = "";
            }
        }
        
        // container modules init
        for(int i=0;i<Constants.NUM_CONTAINER_MODULE_BUTTON;++i){
            containerModules[i] = new ContainerModule();
            containerModules[i].setIcon(Integer.toString(i));
        }
        
        // primitive modules init
        primitiveModules[Constants.PM_BUTTON_BOX] = PrimitiveModuleBox.getInstance();
        primitiveModules[Constants.PM_BUTTON_CIRCLE] = PrimitiveModuleCircle.getInstance();
        primitiveModules[Constants.PM_BUTTON_TRIANGLE] = PrimitiveModuleTriangle.getInstance();
        primitiveModules[Constants.PM_BUTTON_MOVE_LEFT] = PrimitiveModuleMoveLeft.getInstance();
        primitiveModules[Constants.PM_BUTTON_MOVE_RIGHT] = PrimitiveModuleMoveRight.getInstance();
        primitiveModules[Constants.PM_BUTTON_STAR] = PrimitiveModuleStar.getInstance();
        primitiveModules[Constants.PM_BUTTON_INK] = PrimitiveModuleInk.getInstance();
        
        // problems int
        problems[0] = Problem1.getInstance();
        problems[1] = Problem2.getInstance();
        problems[2] = Problem3.getInstance();
        problems[3] = Problem4.getInstance();
        problems[4] = Problem5.getInstance();
        problems[5] = Problem6.getInstance();
        problems[6] = Problem7.getInstance();
        problems[7] = Problem8.getInstance();
        problems[8] = Problem9.getInstance();
        problems[9] = Problem10.getInstance();
    }
    
    public static DB getInstance(){
        if(db == null)
            db = new DB();
        
        return db;
    }
    
    public void loadProblem(int problemNumber){
        answerBoard = problems[problemNumber].getBoard();
    }
    
    public ContainerModule getCurrentContainerModule(){
        return containerModules[currentContainerModuleIndex];
    }
    
    public void setCurrentContainerModule(int newCurrentContainerModuleIndex){
        currentContainerModuleIndex = newCurrentContainerModuleIndex;
    }
    
    public PrimitiveModule getPrimitiveModule(int index){
        return primitiveModules[index];
    }
    
    public void enqueuePrimitiveModule(int index){
        getCurrentContainerModule().enqueue(primitiveModules[index]);
    }
    
    public void enqueueContainerModule(int index){
        containerModules[currentContainerModuleIndex].enqueue(containerModules[index]);
    }
    
    public void deleteCurrentModuleQueueTopElement() {
        containerModules[currentContainerModuleIndex].delete();
    }
    
    public void clearCurrentModule(){
        containerModules[currentContainerModuleIndex].clear();
    }
    
    public int getcurrentContainerModuleIndex(){
        return currentContainerModuleIndex;
    }
}
