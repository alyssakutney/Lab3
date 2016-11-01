
import java.util.Scanner;
/**
 * 
 * @author kutneya1
 *
 */
public class KnightsTour {
  static int size; //size of how many numbers will be in each row and column
  static int startX;
  static int startY;
  static int board[][]; // matrix board for the game
  static Scanner sc = new Scanner(System.in);
		
		
  KnightsTour(int size, int startX, int startY){ // may also need to have a parameter to enter 
														 //in the coordinate of the knight's start position
	if(size <= 3){
	  throw new IndexOutOfBoundsException("Size must be over 3.");
	}else{
	  this.size = size;
	}		
		board = new int[size][size];
				
  }
			
			public static void main(String[] args){
		//		KnightsTour knightTour = new KnightsTour(3,2,0);
				
			}
			
	static void printBoard(){ //just for now, not sure if keeping
		for(int x=0; x < size; x++){
			for(int y =0; y < size; y++){
					System.out.println(board[x][y] + " ");
			}
		}
		
		int[] x_points = {2,1,-1,-2,-2,-1,1,2};		//will work with int[] y_points, considering each matching index as coordinates
		int[] y_points = {1,2,2,1,-1,-2,-2,-1};		//for which way the knight can move
	
	}
		
	
	/**
	 * This method will solve the Knight's tour problem with by moving 
	 * through the board, and visiting each spot on the board.
	 * @param startX: starting x coordinate
	 * @param startY: starting y coordinate
	 * @param movei: number of moves
	 * @param sol
	 * @param xMove
	 * @param yMove
	 * @return
	 */
	public static boolean solveTour(int startX, int startY, int movei, int sol[][], int xMove[],
        int yMove[]) {
	  int k, next_x, next_y;
	  	if (movei == startX * startY)
	  	  return true;
	  	
	  	
	  	for (k = 0; k < 8; k++) {
	  	  next_x = startX + xMove[k];
	  	  next_y = startY + yMove[k];
	  	  if (startX >= 0 && startX < size && startY >= 0 &&
              startY < size && sol[startX][startY] == -1) {
	  		sol[next_x][next_y] = movei;
	  		if (solveTour(next_x, next_y, movei + 1,
	  			sol, xMove, yMove))
	  		  return true;
	  		else
	  		  sol[next_x][next_y] = -1;// backtracking
	  	  }
	  	}

	  	return false;
	}
			
	
	
	
	
}
