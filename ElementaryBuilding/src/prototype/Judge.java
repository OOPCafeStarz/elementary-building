package prototype;

public class Judge {
	UserBoard userBoard;
	AnswerBoard answerBoard;
	
	Judge(UserBoard userBoard, AnswerBoard answerBoard){
		this.userBoard = userBoard;
		this.answerBoard = answerBoard;
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

	public boolean judge(){
		String[][] u = userBoard.getBoard();
		String[][] a = answerBoard.getBoard();
		
		for(int r=0;r<Constants.BOARD_HEIGHT;r++){
			for(int c = 0;c < Constants.BOARD_WIDTH;c++){
				if(!u[r][c].equals(a[r][c])) return false;
			}
		}
		
		return true;
	}
	
	
}
