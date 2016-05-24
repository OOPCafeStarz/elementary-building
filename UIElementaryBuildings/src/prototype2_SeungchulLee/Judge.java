/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype2_SeungchulLee;

/**
 *
 * @author MinGyu
 */
public class Judge {
     public static boolean doItJudge(){
         String[][] userBoard = DB.getInstance().getUserBoard();
         String[][] answerBoard = DB.getInstance().getAnswerBoard();
         for(int i=0; i<Constants.BOARD_ROW; i++){
             for(int j=0; j<Constants.BOARD_COL; j++){
                 if(userBoard[i][j].equals(answerBoard[i][j])==false){
                     return false;
                 }
             }
         }
         return true;
     }
}
