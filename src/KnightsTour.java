import java.util.Random;

/**
 * 
 * @author kutneya1
 *
 */
public class KnightsTour {
  private int[][] board;
  private int size;
  private int possibleMoves = 8;
  private int[][] coordinateMoves ={{2,1},{2,-1},{1,2},{1,-2},{-1,2},{-1,-2},{-2,1},{-2,-1}};
  private int moveNumber;	 
	 
  /** 
   * This is the constructor of the class, this allows the user to input a size
   * for the 
   * @param size
   */
	public KnightsTour(int size){
	this.size = size;
	this.size = size;
	 board = new int[size][size];
	 moveNumber=0;
	 }
	 
	
	 public int[] startCoordinate(){
	 Random generator = new Random();
	 int[] pos = new int[2];
	 pos[0] = generator.nextInt(size);
	 pos[1] = generator.nextInt(size);
	 board[ pos[0] ][ pos[1] ] = ++moveNumber;
	 return pos;
	 }
	 
	 public int[] nextMove(int[] pos){
	 int xStart = pos[0];
	 int yStart = pos[1];
	 int access = possibleMoves;
	 
	 for (int i=0 ; i< possibleMoves ; i++){
	 int newX = xStart + coordinateMoves[i][0];
	 int newY = yStart + coordinateMoves[i][1];
	 int newAccessibility = getAccessibility(newX, newY);
	 
	 if( inRangeAndEmpty(newX, newY) && newAccessibility < access ){
	 pos[0] = newX;
	 pos[1] = newY;
	 access = newAccessibility;
	 }
	 }
	 
	 board[ pos[0] ][ pos[1] ] = ++moveNumber;
	 return pos;
	 }
	 
	 private int getAccessibility(int x, int y){
	 int access = 0;
	 for(int i=0; i < possibleMoves ; i++){
	 if ( inRangeAndEmpty(x + coordinateMoves[i][0], y + coordinateMoves[i][1] ) )
	 access++;
	 }
	 return access;
	 }
	 
	 private boolean inRangeAndEmpty(int x, int y){
	 return ( x < size  && x >= 0 && y < size   && y >=0  &&
	 board[x][y] == 0 );
	 }
	 
	 public void printBoard(){
	 for (int i=0; i < size ; i++){
	 for (int j=0; j < size ; j++){
	 System.out.print(board[i][j] + "\t");
	 }
	 System.out.print("\n");
	 }
	 }
	 
	 public int getSize(){
	 return size * size;
	 }
	
	 
	 // Initialize board 
	public static void main(String[] args) {
	  
	 KnightsTour knightsTour = new KnightsTour(7);
	 int[] position = knightsTour.startCoordinate();
	 
	 // Determine the next position
	 for (int i=1; i< knightsTour.getSize() ; i++){
	 position = knightsTour.nextMove(position);
	 }
	 
	 // Print board
	 knightsTour.printBoard();
	 
	 }
  
}
