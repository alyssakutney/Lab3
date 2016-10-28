import java.util.Arrays;
/**
 * 
 * @author kutneya1
 *
 */
public class IntStack {
 private int[] intStack = new int[10];
 private int topOfStack;
 private int stackSize;
 
 
  public void push(int input){
  	if(topOfStack + 1 < stackSize){
  	  topOfStack++;
  	  intStack[topOfStack] = input;
   	}
    }
    
    public int pop(){
  	if(topOfStack >= 0 ){
  	  displayStack();
  	  System.out.println();
  	  return intStack[topOfStack--];
  	}else{
  	  displayStack();
  	  System.out.println("The stack is empty!");
  	  return -1;
  	  }
    }
    
    public void displayStack(){
  	for(int i = 0; i < stackSize; i++){
  	  System.out.println(i);
  	}
    }

    
    public void clear(){
      topOfStack = -1;
    }
}
