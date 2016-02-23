//IM REALLY SORRY 

public class KnightBoard{
    private int board[][];
    
    public KnightBoard(int size){
	board = new int[size][size];
    }

    public KnightBoard(int cols, int rows){
	board = new int[cols][rows];
    }

    public boolean solve(){
	return true;
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
    /*
    
    public static void main(String[]adajsd){
	KnightBoard k = new KnightBoard(3);
	KnightBoard b = new KnightBoard(5,6);

	k.printSolution();
	b.printSolution();
    }
    
    */

    

}
	
