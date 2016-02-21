public class QueenBoard{
    private int[][]board;
    
    public QueenBoard(int size){
	board = new int[size][size];
	for (int row = 0; row < size; row++){
	    for (int col = 0; col < size; col++) {
		board[row][col] = 0;
	    }
	}
    }

    /**
     *precondition: board is filled with 0's only.
     *postcondition: 
     *-return false, and board is still filled
     *with 0's for a board that cannot be solved.
     *-return true, and board is filled with the 
     *final configuration of the board after adding 
     *all n queens.
     */
    public boolean solve()
    {
       
	return solveH(0);
    }

    /**
     *Helper method for solve. 
     */
    private boolean solveH(int col){

	if(col == board.length) return true;

	for (int i = 0; i < board.length; i++){
	    addQueen(i, col);
	    if (board[i][col] < -1){
		removeQueen(i, col);}
	    solveH(col + 1);
	}
	    

	return false;

    }

    public void printSolution(){
	/**Print the board like toString, except
	   all negative numbers, and 0's are replaced with '_'
	   and all 1's are replaced with 'Q'
	 */

	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board[0].length; c++){
		
		if (board[r][c] == 0 || board[r][c] < 0)
		    System.out.print("_ ");
		

		if (board[r][c] == 1)
		    System.out.print("Q ");	
		
	    }
	    System.out.println();
	}
	

	System.out.println();
    }



    /********Do Not Edit Below This Line**********************************/

    private boolean addQueen(int row, int col){
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

    private boolean removeQueen(int row, int col){
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

    public String  toString(){
	String ans = "";
	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board[0].length; c++){
		ans+= board[r][c]+" ";
	    }
	    ans+="\n";
	}
	return ans;
    }
    
    public static void main(String[]args){
	QueenBoard b = new QueenBoard(5);
	
	b.solve();
	System.out.print(b);
	b.printSolution();
       
	
	/*
        System.out.println(b);
	b.addQueen(3,0);
	b.addQueen(0,1);
        System.out.println(b);
	b.printSolution();
	b.removeQueen(3,0);
        System.out.println(b);
	*/
    }
    
    
}
