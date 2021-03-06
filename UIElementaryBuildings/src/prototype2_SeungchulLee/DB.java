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
public class DB {
    private static DB db;
    private ContainerModule[] containerModules = new ContainerModule[Constants.NUM_CONTAINER_MODULE_BUTTON];
    private PrimitiveModule[] primitiveModules = new PrimitiveModule[Constants.NUM_PRIMITIVE_MODULE_BUTTON];
    private String[][] userBoard = new String[Constants.BOARD_ROW][Constants.BOARD_COL];
    private String[][] answerBoard = new String[Constants.BOARD_ROW][Constants.BOARD_COL];
    private int rowcnt = 0;
    private int colcnt = 0;

    public int getRowcnt() {
        return rowcnt;
    }

    public void setRowcnt(int rowcnt) {
        this.rowcnt = rowcnt;
    }

    public int getColcnt() {
        return colcnt;
    }

    public void setColcnt(int colcnt) {
        this.colcnt = colcnt;
    }
    
    private int currentGrabPosition;
    
    int currentContainerModuleIndex = 0;
    
    private int currentGameState = Constants.GAME_STATE_STOP;
    
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
    
    private DB(){
        init();
    }
    
    private void init(){
        
        // userboard init
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
    }
    
    public static DB getInstance(){
        if(db == null)
            db = new DB();
        
        return db;
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
    
    
    public void clearCurrentModule(){
        containerModules[currentContainerModuleIndex].clear();
    }
    
    public int getcurrentContainerModuleIndex(){
        return currentContainerModuleIndex;
    }
    
    public void clearUserBoard()
    {   
         for (int i=0;i<Constants.BOARD_ROW;i++)
        {
            for (int j=0; j<Constants.BOARD_COL;j++)
            {
               getUserBoard()[i][j] = "";// db에있는 보드를 초기화
               GameWindow.getInstance(). getUserTable().setValueAt("", i, j);//ui에 보이는 것을 초기화
            }
        }   
    }
}