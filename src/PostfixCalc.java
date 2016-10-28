
/**
 * The PostfixCalc class will provide the user with a Postfix Calculator that will
 * turn their input expression of an infix expression and change it to a postfix expression.
 * @author kutneya1
 *
 */
public class PostfixCalc extends ArrayStack{
  private String[] stackArray;
 	private static int stackSize;
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
  	  return stackArray[topOfStack--];
  	}else{
  	  displayStack();
  	  System.out.println("The stack is empty!");
  	  return "-1";
  	  }
    }
    
    public static void displayStack(){
  	for(int i = 0; i < stackSize; i++){
  	  System.out.println(i);
  	}
    }
  	String expression;
  	
  	PostfixCalc(String expression){
  	  this.expression = expression;
  	}
	
	public static void main(String[] args){
	  displayStack();
	  
	}

	public void calculate(){
	  
	}

	
	
}
