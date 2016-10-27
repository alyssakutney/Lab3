/**
 * 
 * @author lyss
 *
 */
public class ArrayStack {
  private String[] stackArray;
	private int stackSize;
	private int topOfStack;
	
  public void push(String input){
 	if(topOfStack + 1 < stackSize){
 	  topOfStack++;
 	  stackArray[topOfStack] = input;
  	}
   }
   
   public String pop(){
 	if(topOfStack >= 0 ){
 	  displayStack();
 	  System.out.println();
 	}
   }
   
   public void displayStack(){
 	for(int i = 0; i < stackSize; i++){
 	  System.out.println(i);
 	}
   }
 	

}
