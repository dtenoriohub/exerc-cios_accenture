package Sample_03.ChessBoard;
import java.util.Scanner;

public class ChessBoard {
	static Scanner input = new Scanner(System.in);
	ChessBoard chessBoard = new ChessBoard();
	public static void main(String[] args) {
		
		String[][] board = {
				{"R","N","B","Q","K","B","N","R"},
				{"P","P","t","P","P","P","P","P"},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{"p","p","p","p","p","p","p","p"},
				{"r","n","b","q","k","b","n","r"}};
		
		for(int i = 0; i<4 ;i++) {
			imprimirBoard(board);
			askMove(board);
			askMove(board);
		}
	}
	
	//--------------------solicitacao do movimento do peao-----------------
	public static void askMove(String[][] board) {
		System.out.println("digite as coordenadas X do peão");
		int linePawn = Integer.parseInt(input.nextLine());
		System.out.println("digite as coordenadas Y do peão");
		int ColumnPawn = Integer.parseInt(input.nextLine());
		
		movePawn(board, linePawn, ColumnPawn);

	}
	//-------------------- movimento peao---------------------------
	public static void movePawn(String[][] board, int line, int column) {
		if(board[6][column]== "p") {
			board[6-2][column] = "p";
			board[line][column] = "";
			imprimirBoard(board);
		}
		else if(board[line-1][column] == " " ) {
			if(board[line][column]!= board[6][column]){
				board[line][column] = "";
				board[line-1][column] = "p";
				imprimirBoard(board);
			}
		}
		else {
			if(board[line-1][column+1]!= " ") {
				System.out.println("atacar direita ou esquerda? (esq 0 - dir 1");
				int response = Integer.parseInt(input.nextLine());
				System.out.println(response);
				if(response == 1) {
					board[line-1][column+1] ="P";
					imprimirBoard(board);
					board[line][column] =" " ;
					System.out.println("Peça derrotada!");
				}
			}
		}
	}

	// --------------Impressao do Tabuleiro---------------------------------------
	public static void imprimirBoard(String[][] board) {
		 System.out.println("======================");

		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
		 System.out.println("======================");
	}
}
