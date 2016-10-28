
/**
 * The PostfixCalc class will provide the user with a Postfix Calculator that will
 * turn their input expression of an infix expression and change it to a postfix expression.
 * @author kutneya1
 *
 */
public class PostfixCalc extends ArrayStack{
  	String expression;
  	
  	PostfixCalc(String expression){
  	  this.expression = expression;
  	}
  	
  	
  	
	ArrayStack stackArray = new ArrayStack(10);
	
	public static void main(String[] args){
	  displayStack();
	  
	}

	public void calculate(){
	  
	}

	
	
}
