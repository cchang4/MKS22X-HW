//IM REALLY SORRY 
//totes do not undertand lol im stupid


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

	//start at 0,0
	//move in L shape (+-1 X, +-2 Y, +-2 X +-1 Y diff combos)
	//after moving, 0 turns to "turn" number
	//if number already there, backtrack, try diff direction

	if (board[col][row] == 0) {board[col][row] = turn;}
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
    
    
    public static void main(String[]adajsd){
	KnightBoard k = new KnightBoard(3);
	KnightBoard b = new KnightBoard(5,6);

	k.printSolution();
	b.printSolution();
    }
    
    

    

}
	
