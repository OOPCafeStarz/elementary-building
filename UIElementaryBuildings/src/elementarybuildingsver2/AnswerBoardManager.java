/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarybuildingsver2;

/**
 *
 * @author user
 */
public class AnswerBoardManager {
    public static void show(){
        clearUIBoard();
        for (int i=0;i<Constants.BOARD_ROW;i++)
        {
            for (int j=0; j<Constants.BOARD_COL;j++)
            {
                GameWindow.getInstance().getAnsTable().setValueAt(DB.getInstance().getAnswerBoard()[i][j], i, j);//ui에 보이는 것을 초기화
            }
        }
    }
    public static void load(int problemNumber){
        DB.getInstance().loadProblem(problemNumber);
        AnswerBoardManager.show();
    }
    public static void clearUIBoard(){
        for (int i=0;i<Constants.BOARD_ROW;i++)
        {
            for (int j=0; j<Constants.BOARD_COL;j++)
            {
                GameWindow.getInstance().getAnsTable().setValueAt("", i, j);//ui에 보이는 것을 초기화
            }
        }
    }
}
