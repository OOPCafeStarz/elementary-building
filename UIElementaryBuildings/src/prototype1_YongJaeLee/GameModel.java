package prototype1_YongJaeLee;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import prototype1.*;

public class GameModel implements MouseListener{
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

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
       GameViewAndControl.getInstance().getjButton2().setText("a");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
