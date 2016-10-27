package lab3;
import java.util.ArrayList;
/**
 * The PostfixCalc class will provide the user with a Postfix Calculator that will
 * turn their input expression of an infix expression and change it to a postfix expression.
 * @author kutneya1
 *
 */
public class PostfixCalc {
	private String expression;
	private String[] stackArray;
	private int stackSize;
	private int topOfStack;
	
	public PostfixCalc(){
  }
	
	
	public static void main(String[] args){
		
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
	}
  }
  
  public void displayStack(){
	for(int i = 0; i < stackSize; i++){
	  System.out.println(i);
	}
  }
	
}
