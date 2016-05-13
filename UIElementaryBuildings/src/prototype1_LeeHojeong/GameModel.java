package prototype1_LeeHojeong;

import prototype1.*;

public class GameModel {
    private static GameModel gameModel = new GameModel();
    private GameModel(){}
    private UserBoard userBoard;
    private AnswerBoard answerBoard;
    private Judge judge;
    public static GameModel getInstance(){
        return gameModel;
    }
    public UserBoard getUserBoard() {
        return userBoard;
    }
    public void setUserBoard(UserBoard userBoard) {
        this.userBoard = userBoard;
    }
    public AnswerBoard getAnswerBoard() {
        return answerBoard;
    }
    public void setAnswerBoard(AnswerBoard answerBoard) {
        this.answerBoard = answerBoard;
    }
    public Judge getJudge() {
        return judge;
    }
    public void setJudge(Judge judge) {
        this.judge = judge;
    }
   public  void text() {                                       
        // TODO add your handling code here:
      GameViewAndControl.getInstance().getjButton1().setText("a");
        
    }         
}
