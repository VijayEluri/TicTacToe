
public class TicTacToe {
	private Board board = new Board();
	private WinningMove winningMove = new WinningMove();
	private Block block = new Block();
	private Fork fork = new Fork();
	private GameOver gameOver;
	private Center center = new Center();

	public TicTacToe(Board board){
		this.board = board;
		gameOver = new GameOver(board);
	}
	
	public void play(){
		while(!gameOver.win('0') || !gameOver.win('X')){
			findNextMove();
			gameOver.incrementNumberOfMoves();
		}
	}
	
	public Position findNextMove() {
		Position position = winningMove.findWinningMove(getBoard());
		if (position != null){
			return position;
		} 
		position = block.findBlockMove(getBoard());
		if (position != null){
			return position;
		} 
		position = fork.createFork(getBoard());
		if (position != null){
			return position;
		} 
		position = fork.blockFork(getBoard());
		if (position != null){
			return position;
		} 
		return center.playTheCenter();
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public Board getBoard() {
		return board;
	}
}