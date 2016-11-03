/**
 * The PostfixCalc class will provide the user with a Postfix Calculator that will
 * turn their input expression of an infix expression and change it to a postfix expression.
 * @author kutneya1
 *
 */

public class PostfixCalc {
  	private static String expression;
    private static final String add = "+"; 
    private static final String sub = "-";
    private static final String mult = "*";
    private static final String div = "/";
    static LinkedListStack myLLStack = new LinkedListStack<>();
    static LinkedListStack operatorStack = new LinkedListStack<>();
    
    public PostfixCalc(String postFixExp){
      expression = postFixExp;
 }

    
    public static void main(String[] args){
      expression = "147*-2+";
      PostfixCalc calc = new PostfixCalc(expression);
     String finalCalc =  calc.calculate();
      System.out.println(finalCalc);
    }
    
    
    
    
 public static String calculate()
 {
     String output = "";
     char character = ' ';
     double digit = 0;

     if(expression.length() == 0){
       System.out.println("The stack is empty");
     }else{
     for(int x = 0; x < expression.length(); x++)
     {
         if(Character.isDigit(expression.charAt(x))) {
                 digit = Double.parseDouble("" + expression.charAt(x));
         }
         character = expression.charAt(x);
         if(Character.isDigit(character)) {
             digit = Double.parseDouble("" + character);
             myLLStack.push(digit);
         }
         if(expression.charAt(x) == digit)
         {
             myLLStack.push(digit);
         }
         else if(character == '*')
         {
           	double right = (double) myLLStack.pop();
           	double left = (double) myLLStack.pop();
           	double result = left* right;
             myLLStack.push(result);
         }
         else if(character == '/')
         {
           	double right = (double) myLLStack.pop();
         	double left = (double) myLLStack.pop();
         	double result = left / right ;
           myLLStack.push(result);
         }
         else if(character == '+')
         {
           double right = (double) myLLStack.pop();
           double left = (double) myLLStack.pop();
           double result = left + right ;
           myLLStack.push(result);
         }
         else if(character == '-')
         {
           double right = (double) myLLStack.pop();
           double left = (double) myLLStack.pop();
           double result = left - right ;
            myLLStack.push(result);
         }
     	}
     }

     	while(!myLLStack.isEmpty())
     	{
 
     	  output = output + myLLStack.pop();
     	}

     	System.out.println(expression);
     	return output;
 	}
        
}
