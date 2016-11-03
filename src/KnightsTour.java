import java.util.Random;

/**
 * This class, KnightsTour will recreate the Knights Tour 
 * board, of any size that is over 3. 
 * @author kutneya1
 *
 */
public class KnightsTour {
  private static int[][] board;
  private static int size;
  private int possibleMoves = 8;
  private int[][] coordinateMoves ={{2,1},{2,-1},{1,2},{1,-2},{-1,2},{-1,-2},{-2,1},{-2,-1}};
  private static int moveNum;	 
	 
  /** 
   * This is the constructor of the class, this allows the user to input a size
   * for the board, but, will throw an exception if the size is three or lower.
   * @param size: int size of board
   */
	public KnightsTour(int size){
	 if(size <= 3){
	   throw new IndexOutOfBoundsException("The size of the board must be greater than 3");
	 }else{
	   this.size = size;
	   this.size = size;
	   board = new int[size][size];
	   moveNum = 0;
	 }
	 }
	 
	/**
	 * This method will create a random starting coordinate on the board for the path.
	 * @return pos: position of the start coordinate 
	 */
	 public static int[] startCoordinate(){
	 Random generator = new Random();
	 int[] pos = new int[2];
	 pos[0] = generator.nextInt(size);
	 pos[1] = generator.nextInt(size);
	 board[ pos[0] ][ pos[1] ] = ++moveNum;
	 return pos;
	 
	 }
	 
	 /**
	  * This method will decide whether the knight can move or not due to its column and row sizes. 
	  * @param row: int for row length
	  * @param col: int for column height
	  * @param size:
	  * @return
	  */
	 public boolean canMove(int row, int col, int size) {
		if (row >= 0 && col >= 0 && row < size && col < size) {
			return true;
		}else{
		return false;
	 	}
	}
	 
	 
	 /**
	  * 
	  * @param position
	  * @return
	  */
	 public int[] nextMove(int[] position){
	 int xStart = position[0];
	 int yStart = position[1];
	 int access = possibleMoves;
	
	 
	 for (int i=0 ; i< possibleMoves ; i++){
		 int new_X = xStart + coordinateMoves[i][0];
		 int new_Y = yStart + coordinateMoves[i][1];
		 int newAccess = getAccessibility(new_X, new_Y);
		 
		 if(inBoundsAndEmpty(new_X, new_Y) && newAccess < access ){
		 position[0] = new_X;
		 position[1] = new_Y;
		 access = newAccess;
		 }
		 }
		 board[position[0]][position[1]] = ++moveNum;
		 
		 /*if(moveNum != size){
		   nextMove(position++);
		 }*/
		 return position;
	 
	 }

	 
	 /**
	  * 
	  * @param x
	  * @param y
	  * @return
	  */
	private int getAccessibility(int x, int y){
	 int access = 0;
	 for(int i=0; i < possibleMoves ; i++){
	 if ( inBoundsAndEmpty(x + coordinateMoves[i][0], y + coordinateMoves[i][1] ) )
	 access++;
	 }
	 return access;
	 }
	 
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	 private boolean inBoundsAndEmpty(int x, int y){
	 return ( x < size  && x >= 0 && y < size   && y >=0  &&
	 board[x][y] == 0 );
	 }
	 
	 /**
	  * 
	  */
	 public void printBoard(){
	   for (int i=0; i < size ; i++){
		 for (int j=0; j < size ; j++){
		   System.out.print(board[i][j] + "\t");
		 }
		 System.out.print("\n");
	   }
	 }
	 
	 /**
	  * 
	  * @return
	  */
	 public int getSize(){
	 return size * size;
	 }
	
	 
	 // Initialize board 
	public static void main(String[] args) {
	  
	  KnightsTour knightsTour = new KnightsTour(7);
	 //int[] position = knightsTour.startCoordinate();
	 
	 // Determine the next position
	// for (int i=1; i< knightsTour.getSize() ; i++){
	// position = knightsTour.nextMove(position);
	// }
	 
	 // Print board
	// knightsTour.printBoard();
	 
	 }
  
}
