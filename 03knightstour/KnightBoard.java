//IM REALLY SORRY 
//totes do not understand lol im stupid
import java.io.*;

public class KnightBoard{
    private int board[][];
    
    public KnightBoard(int size){
	board = new int[size][size];
    }

    public KnightBoard(int cols, int rows){
	board = new int[cols][rows];
    }

    public boolean solve(){
	for(int i = 0; i < board.length; i++){
	    for (int j = 0; j < board[0].length; j++){
		solveH(j, i, 0);
	    }
    }
	return true;
    }

    private boolean solveH(int col, int row, int turn){



	board[col][row] = turn;
	
	if(turn == (col * row) -1) {
	    return false;
	}else{
	    if (board[col][row]== 0){
		if (board[col + 2][row - 1] == 0 ||
		    board[col + 1][row - 2] == 0 ||
		    board[col - 1][row - 2] == 0 ||
		    board[col - 2][row - 1] == 0 ||
		    board[col - 2][row + 1] == 0 ||
		    board[col - 1][row + 2] == 0 ||
		    board[col + 1][row + 2] == 0 ||
		    board[col + 2][row + 1] == 0){
		    solveH(col, row, turn + 1);
		}
		return true;
	    }
	}
	
	
	return false;
    }
    



    public void printSolution(){

	for(int i = 0; i < board.length; i++){
	    for (int j = 0; j < board[0].length; j++){
		if (board.length*board[0].length >= 10 && board[i][j] < 10){
		    System.out.print("_" + board[i][j]+ " ");
		}else{
		System.out.print(board[i][j]+ " ");
		}
	    }
	    System.out.println();
	}
	System.out.println();
    }
    
    
    public static void main(String[]adajsd){
	KnightBoard k = new KnightBoard(3);
	KnightBoard b = new KnightBoard(5,6);

	k.solve();
	k.printSolution();
	b.printSolution();
    }
    
    

    

}
	
