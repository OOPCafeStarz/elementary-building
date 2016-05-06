package prototype1;

public class Judge {
    public Judge() {}
    public boolean mark(UserBoard ub, AnswerBoard ab){
        String[][] inputUserBoard = ub.getBoard();
        String[][] inputAnswerBoard = ab.getBoard();
        for(int i=0; i<UserBoard.USER_BOARD_ROW; i++){
            for(int j=0; j<UserBoard.USER_BOARD_COL; j++){
                if(inputUserBoard[i][j].equals(inputAnswerBoard[i][j])){
                    continue;
                }else
                    return false;
            }
        }
        return true;
    }
}
