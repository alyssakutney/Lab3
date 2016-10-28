import java.util.Arrays;
/**
 * 
 * @author kutneya1
 *
 */
public class ArrayStack {
  private String[] stackArray;
	private int stackSize;
	private int topOfStack;
	
	ArrayStack(int stackSize){
	  this.stackSize = stackSize;
	}
	
	
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
 	  
 	  return stackArray[topOfStack--];
 	}else{
 	  displayStack();
 	  System.out.println("The stack is empty!");
 	  return "-1";
 	  }
   }
   
   public void displayStack(){
 	for(int i = 0; i < stackSize; i++){
 	  System.out.println(i);
 	}
   }
 	

}
