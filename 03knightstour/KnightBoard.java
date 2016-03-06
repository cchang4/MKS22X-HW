
public class KnightBoard{
    private int[][] board;
    
    public KnightBoard(int size){
	//add border of -1 (3) to handle out-of-bounds cases
	board = new int[size+6][size+6];

	for(int i = 0; i < size + 6; i++){
	    for(int j = 0; j< size + 6; j++){
		if (i < 3 || i > size + 2 || j < 3 || j > size + 2){
		    board[i][j]= -1;}
	    }
	}
    }

    public KnightBoard(int cols, int rows){
	board = new int[cols+6][rows+6];
	
	for(int i = 0; i < cols + 6; i++){
	    for(int j = 0; j< rows + 6; j++){
		if (i < 3 || i > cols + 2 || j < 3 || j > rows + 2){
		    board[i][j]= -1;}
	    }
	}
    }

    public boolean solve(){
	return solveH(3, 3, 1);	   
    }

    public boolean solveH(int col, int row, int turn){

	//out-of-bounds: don't put down any number!
	if (board[col][row] != 0){
	    return false;
	}

       	if (turn == (board.length * board[0].length) ){
	    return true;
	}

	//where you can't put down the knight
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board[0].length; j++){
		if (board[i][j]> turn){
		    board[i][j] = 0;
		}
	    }
	}

	board [col][row] = turn;

	return solveH(col + 1, row + 2, turn + 1) ||
	    solveH(col - 1, row + 2, turn + 1) ||
	    solveH(col + 1, row - 2, turn + 1) ||
	    solveH(col + 2, row + 1, turn + 1) ||
	    solveH(col - 2, row + 1, turn + 1) ||
	    solveH(col + 2, row - 1, turn + 1) ||
	    solveH(col - 2, row - 1, turn + 1) ||
	    solveH(col - 1, row - 2, turn + 1);	


    }
    



    public void printSolution(){
	//minus 3 when you finished figuring out the rest!

	for(int i = 3; i < board.length -3 ; i++){
	    for (int j = 3; j < board[0].length -3 ; j++){
		if (board[i][j] < 0){
		    System.out.print(board[i][j]+ " ");
		}else{
		
		    if (board.length*board[0].length >= 10 && board[i][j] < 10){
			System.out.print("_" + board[i][j]+ " ");
		    }else{
			System.out.print(board[i][j]+ " ");
		    }
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

	k.solve();
	k.printSolution();
	b.solve();
       	b.printSolution();
    }

    */
    
    

    

}
	
