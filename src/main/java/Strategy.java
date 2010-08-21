
public class Strategy {
	
	public Position twoInARowDown(Board board, char mark) {
		Position position = new Position(0,0);
		for (int x = 0; x < board.getBoard().length; x++) {
			int numberOfMarks = 0;
			int numberOfSpaces = 0;

			for (int y = 0; y < board.getBoard().length; y++) {
				if (board.getBoard()[x][y] == mark) {
					numberOfMarks++;
				} else if (board.getBoard()[x][y] == 0) {
					numberOfSpaces++;
					position.setX(x);
					position.setY(y);
				}
			}
			if (numberOfMarks == 2 && numberOfSpaces == 1)
				return position;
		}

		return null;
	}

	public Position twoInARowAcross(Board board, char mark) {
		Position position = new Position(0,0);
		for (int y = 0; y < board.getBoard().length; y++) {
			int numberOfMarks = 0;
			int numberOfSpaces = 0;

			for (int x = 0; x < board.getBoard().length; x++) {
				if (board.getBoard()[x][y] == mark) {
					numberOfMarks++;
				} else if (board.getBoard()[x][y] == 0) {
					numberOfSpaces++;
					position.setX(x);
					position.setY(y);
				}
			}
			if (numberOfMarks == 2 && numberOfSpaces == 1)
				return position;
		}

		return null;
	}

	public Position twoDownDiagonal(Board board, char mark) {
		int numberOfMarks = 0;
		int numberOfSpaces = 0;
		Position position = new Position(0,0);
		for (int x = 0, y = 0; x < board.getBoard().length; x++, y++) {
			if (board.getBoard()[x][y] == mark) {
				numberOfMarks++;
			} else if (board.getBoard()[x][y] == 0) {
				numberOfSpaces++;
				position.setX(x);
				position.setY(y);
			}
		}
		if (numberOfMarks == 2 && numberOfSpaces == 1)
			return position;

		return null;
	}
	
	public Position twoUpDiagonal(Board board, char mark) {;
		int numberOfMarks = 0;
		int numberOfSpaces = 0;
		Position position = new Position(0,0);
		for (int x = 0, y = 2; x < board.getBoard().length; x++, y--) {
			if (board.getBoard()[x][y] == mark) {
				numberOfMarks++;
			} else if (board.getBoard()[x][y] == 0) {
				numberOfSpaces++;
				position.setX(x);
				position.setY(y);
			}
		}
		if (numberOfMarks == 2 && numberOfSpaces == 1)
			return position;
		
		return null;
	}


}
