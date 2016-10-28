
/**
 * The PostfixCalc class will provide the user with a Postfix Calculator that will
 * turn their input expression of an infix expression and change it to a postfix expression.
 * @author kutneya1
 *
 */
public class PostfixCalc{
  private int[] intStack;
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
	
   public void push(String input){
  	if(topOfStack + 1 < stackSize){
  	  topOfStack++;
  	  intStack[topOfStack] = input;
   	}
    }
    
    public String pop(){
  	if(topOfStack >= 0 ){
  	  displayStack();
  	  System.out.println();
  	  return intStack[topOfStack--];
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
						double b = intStack.pop();
						double a = intStack.pop();
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
					case '^':
						b = intStack.pop();
						a = intStack.pop();
						intStack.push(Math.pow(a,b));
						break;
					}
	}
	
	
}
