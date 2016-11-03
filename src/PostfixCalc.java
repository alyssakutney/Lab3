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
      expression = "23+";
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
             double temp =  (double) myLLStack.pop() * (double) myLLStack.pop();
             myLLStack.push(temp);
         }
         else if(character == '/')
         {
             double temp = (double)myLLStack.pop() / (double)myLLStack.pop();
             myLLStack.push(temp);
         }
         else if(character == '+')
         {
             double temp = (double) myLLStack.pop() + (double) myLLStack.pop();
             myLLStack.push(temp);
         }
         else if(character == '-')
         {
             double temp = (double) myLLStack.pop() - (double) myLLStack.pop();
             myLLStack.push(temp);
         }
     	}
     }

     	while(!myLLStack.isEmpty())
     	{
     	  output = output + myLLStack.pop();
     	}

     	return output;
 	}
        
}
