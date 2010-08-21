public class GameOver {

	private Board board;
	private int numberOfMoves;

	public GameOver(Board board) {
		this.board = board;
	}

	public boolean win(char typeOfMark) {

		return hasWinInColumn(typeOfMark) || hasWinInRow(typeOfMark)
				|| hasWinInDownDiagonal(typeOfMark)
				|| hasWinInUpDiagonal(typeOfMark);
	}

	private boolean hasWinInDownDiagonal(char typeOfMark) {
		char[] diagonal = board.extractDownDiagonal();
		if (isWinInSection(diagonal, typeOfMark))
			return true;

		return false;
	}

	private boolean hasWinInUpDiagonal(char typeOfMark) {
		char[] diagonal = board.extractUpDiagonal();
		if (isWinInSection(diagonal, typeOfMark))
			return true;

		return false;
	}

	private boolean hasWinInRow(char typeOfMark) {
		for (int rowNumber = 0; rowNumber < board.getBoard().length; rowNumber++) {
			char[] row = board.extractRow(rowNumber);
			if (isWinInSection(row, typeOfMark))
				return true;
		}
		return false;
	}

	private boolean hasWinInColumn(char typeOfMark) {
		for (int columnNumber = 0; columnNumber < board.getBoard().length; columnNumber++) {
			char[] column = board.extractColumn(columnNumber);
			if (isWinInSection(column, typeOfMark))
				return true;
		}
		return false;
	}

	private boolean isWinInSection(char[] column, char typeOfMark) {
		int numberOfMarks = board.countOfNumberOfMarks(column, typeOfMark);

		if (numberOfMarks == 3)
			return true;
		return false;
	}

	public void incrementNumberOfMoves() {
		numberOfMoves++;
	}
}
