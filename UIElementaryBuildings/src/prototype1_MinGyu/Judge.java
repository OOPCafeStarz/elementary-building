package prototype1_MinGyu;

public class Judge {
    public Judge() {}
    public static void mark(){
        String[][] inputUserBoard = UserBoard.getInstance().getBoard();
        String[][] inputAnswerBoard = AnswerBoard.getInstance().getBoard();
        for(int i=0; i<UserBoard.USER_BOARD_ROW; i++){
            for(int j=0; j<UserBoard.USER_BOARD_COL; j++){
                if(inputUserBoard[i][j].equals(inputAnswerBoard[i][j])){
                }else{
                    GameViewAndControl.getInstance().getJudge().setText("Wrong Answer");
                    return;
                }
            }
        }
        GameViewAndControl.getInstance().getJudge().setText("Accepted");
        return;
    }
}
