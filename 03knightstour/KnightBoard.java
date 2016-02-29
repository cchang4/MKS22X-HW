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
	for(int i = 0; i < board.length; i++){
	    for (int j = 0; j < board[0].length; j++){
		solveH(j, i, 0);
	    }
	return true;
    }

    public void solveH(int col, int row, int turn){

	
    }

     private boolean addKnight(int row, int col){
	if(board[row][col] != 0){
	    return false;
	}
	board[row][col] = 1;
	int offset = 1;
	while(col+offset < board[row].length){
	    board[row][col+offset]--;
	    if(row - offset >= 0){
		board[row-offset][col+offset]--;
	    }
	    if(row + offset < board.length){
		board[row+offset][col+offset]--;
	    }
	    offset++;
	}
	return true;
    }

    private boolean removeKnight(int row, int col){
	if(board[row][col] != 1){
	    return false;
	}
	board[row][col] = 0;
	int offset = 1;
	while(col+offset < board[row].length){
	    board[row][col+offset]++;
	    if(row - offset >= 0){
		board[row-offset][col+offset]++;
	    }
	    if(row + offset < board.length){
		board[row+offset][col+offset]++;
	    }
	    offset++;
	}
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
	
