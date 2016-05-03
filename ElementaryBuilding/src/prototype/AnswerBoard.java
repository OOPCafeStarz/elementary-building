package prototype;

public class AnswerBoard {
	private String[][] board = new String[Constants.BOARD_HEIGHT][Constants.BOARD_WIDTH];
	
	
	public String[][] getBoard() {
		return board;
	}

	public void setBoard(String[][] board) {
		this.board = board;
	}

	public AnswerBoard(){
		for(int i=0;i<Constants.BOARD_WIDTH;i++){
			board[Constants.BOARD_HEIGHT-1][i] = "бс";
		}
	}
	
	public String getItem(int r, int c){
		if(!inRange(r, c)){
			System.out.println("ERROR[getItem() in AnswerBoard class] : index error");
			return " ";
		}
		return board[r][c];
	}
	
	private boolean inRange(int r, int c){
		if(r < 0 || r >= Constants.BOARD_HEIGHT
				|| c < 0 || c >= Constants.BOARD_WIDTH)
			return false;
		return true;
	}
}
