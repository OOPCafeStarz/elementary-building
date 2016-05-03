package prototype;

public class UserBoard {
	private String[][] board = new String[Constants.USERBOARD_WIDTH][Constants.USERBOARD_HEIGHT];
	private static final int width = Constants.USERBOARD_WIDTH;
	private static final int height = Constants.USERBOARD_HEIGHT;
	int currentGrabPositionX = Constants.INIT_GRAB_POS_X;
	int currentGrabPositionY = Constants.INIT_GRAB_POS_Y;
	
	public String[][] getBoard() {
		return board;
	}

	public void setBoard(String[][] board) {
		this.board = board;
	}

	public UserBoard(){}
	
	public void clearAll(){
		for(int i = 0;i<Constants.USERBOARD_HEIGHT;i++){
			for(int j=0;j<Constants.USERBOARD_WIDTH;j++){
				board[i][j] = " ";
			}
		}
	}
	
	public void move(int fromR, int fromC, int toR, int toC){
		if(!inRange(fromR, fromC) || !inRange(toR, toC)){
			System.out.println("ERROR[move() in UserBoard]: Can't move item in UserBorad");
			return;
		}
		
		board[toR][toC] = board[fromR][fromC];
	}
	
	public void setItem(int r, int c, String item){
		if(!inRange(r, c)){
			System.out.println("ERROR[set() in UserBoard] : board OutOfBoundIndex error");
			return;
		}
		
		board[r][c] = item;
	}
	
	public String getItem(int r, int c){
		if(!inRange(r, c)){
			System.out.println("ERROR[set() in UserBoard] : board OutOfBoundIndex error");
			return " ";
		}
		return board[r][c];
	}
	
	private boolean inRange(int r, int c){
		if(r < 0 || r >= Constants.USERBOARD_HEIGHT
				|| c < 0 || c >= Constants.USERBOARD_WIDTH)
			return false;
		return true;
	}
}
