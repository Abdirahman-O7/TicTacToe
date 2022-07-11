package sprint3_1.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sprint3_1.product.TicTacToeConsole;
import sprint3_1.product.TicTacToeGame;

public class TestGameConsole {
	private TicTacToeGame game;
	@Before
	public void setUp() throws Exception {
		game = new TicTacToeGame();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEmptyBoard() {	
		new TicTacToeConsole(game).displayBoard();
	}
	
	@Test
	public void testNonEmptyBoard() {
		game.makeMove(0, 0);
		game.makeMove(1, 1);		
		new TicTacToeConsole(game).displayBoard();
	}

}
