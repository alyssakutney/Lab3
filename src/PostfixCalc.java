
/**
 * The PostfixCalc class will provide the user with a Postfix Calculator that will
 * turn their input expression of an infix expression and change it to a postfix expression.
 * @author kutneya1
 *
 */
public class PostfixCalc{
}
  	private IntStack intStack = new IntStack();
 	private static int stackSize;
 	private int topOfStack;
  	String expression;
  	private int a;
  	private int b;
 	
	private void PostfixCalc(String expression){
  	  this.expression = expression;
  	}
	
	public static void main(String[] args){
	//  PostfixCalc("432+");
	  displayStack();
	}
	  
    /**
     * STILL WORKING ON THIS AT THE MOMENT !!!!!!!!!!!!!!
     * @param postfix
     * @param x
     * @return
     */
	public int calculate(String postfix, int x){
		int i = 0;
		
		for(int n=0;n<postfix.length();n++){
			char ch = postfix.charAt(n);
			if('0'<=ch && ch<='9')
				intStack.push(ch-'0');
			else {
				switch(ch) {
					case 'x':
						intStack.push(x);
						break;
					case '+':
						int b = intStack.pop();
						int a = intStack.pop();
						intStack.push(a+b);
						break;
					case '$':
						intStack.push(-intStack.pop());
						break;
					case '-':
						b = intStack.pop();
						a = intStack.pop();
						intStack.push(a-b);
						break;
					case '*':
						b = intStack.pop();
						a = intStack.pop();
						intStack.push(a*b);
						break;
					case '/':
						b = intStack.pop();
						a = intStack.pop();
						intStack.push(a/b);
						break;
					}
	}
	
	
}
