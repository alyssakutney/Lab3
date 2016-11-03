/**
 * The PostfixCalc class will provide the user with a Postfix Calculator that will
 * turn their input expression of an infix expression and change it to a postfix expression.
 * @author kutneya1
 *
 */

<<<<<<< HEAD

public class PostfixCalc {
  	private static String expression;
    private static final String add = "+"; 
    private static final String sub = "-";
    private static final String mult = "*";
    private static final String div = "/";
    static LinkedListStack myLLStack = new LinkedListStack<>();
    
    public PostfixCalc(String postFixExp){
      expression = postFixExp;
 }

    
    public static void main(String[] args){
      expression = "324+-";
      PostfixCalc calc = new PostfixCalc(expression);
     String finalCalc =  calc.calculate();
      System.out.println(finalCalc);
    }
    
    
    
    
 public static String calculate()
 {
     String output = "";
     char character = ' ';
     double digit = 0;

     for(int x = 0; x < expression.length(); x++)
     {
         if(Character.isDigit(expression.charAt(x))) {
                 digit = expression.charAt(x);
         }
         character = expression.charAt(x);
         if(expression.charAt(x) == digit)
         {
             myLLStack.push(digit);
         }
         else if(character == '*')
         {
             double tmp = (double) myLLStack.pop() * (double) myLLStack.pop();
             myLLStack.push(tmp);
         }
         else if(character == '/')
         {
             double tmp = (double) myLLStack.pop() / (double) myLLStack.pop();
             myLLStack.push(tmp);
         }
         else if(character == '+')
         {
             double tmp = (double) myLLStack.pop() + (double) myLLStack.pop();
             myLLStack.push(tmp);
         }
         else if(character == '-')
         {
             double tmp = (double) myLLStack.pop() - (double) myLLStack.pop();
             myLLStack.push(tmp);
         }
     }

     while(!myLLStack.isEmpty())
     {
         output = output + myLLStack.pop();
     }

     return output;
 }
        
    }
=======
  	private static IntStack intStack = new IntStack();
  	
 	private static int stackSize;
 	private int topOfStack;
  	static String expression;
  	private int a;
  	private int b;
 	
	private static void PostfixCalc(String exp){
  	  expression = exp;
  	}
	
	public static void main(String[] args){
	  calculate("4+3-1", 3);
	  displayExpression();
	  displayStack();
	}
	  
    /**
     * With this method it should allow the array integer stack to parse through the operators and
     * operands, and 
     * @param postfix
     * @param x
     * @return
     */
	public static int calculate(String postExpression, int x){
		
		for(int n = 0; n < postExpression.length(); n++){
			char ch = postExpression.charAt(n);
			if('0'<=ch && ch<='9')
				intStack.push(ch='0');
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
		return intStack.pop();
	}
	 
	
	
		public static void displayExpression(){
		  System.out.println(""+ expression);
		}
			
			
		public static void displayStack(){
		  for(int i = 0; i < stackSize; i++){
		  	 System.out.println(i);
		  }
		}
	
}
>>>>>>> origin/master
