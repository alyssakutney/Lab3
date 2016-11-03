/**
 * 
 * @author kutneya1
 *
 */
public class OperatorStack {

  private char[] opStack = new char[10];
  private int topOfStack;
  private int stackSize;
  
  
   public void push(char input){
   	if(topOfStack + 1 < stackSize){
   	  topOfStack++;
   	  opStack[topOfStack] = input;
    	}
     }
     
     public int pop(){
   	if(topOfStack >= 0 ){
   	  displayStack();
   	  System.out.println();
   	  return opStack[topOfStack--];
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
