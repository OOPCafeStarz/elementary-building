package prototype1_MinGyu;

public class Judge {
    public Judge() {}
    public void mark(){
        String[][] inputUserBoard = UserBoard.getInstance().getBoard();
        String[][] inputAnswerBoard = AnswerBoard.getInstance().getBoard();
        for(int i=0; i<UserBoard.USER_BOARD_ROW; i++){
            for(int j=0; j<UserBoard.USER_BOARD_COL; j++){
                if(inputUserBoard[i][j].equals(inputAnswerBoard[i][j])){
                }else{
                    // 메세지에 틀렸다고 출력
                    return;
                }
            }
        }
        // 메세지에 맞았다고 출력
        return;
    }
}
