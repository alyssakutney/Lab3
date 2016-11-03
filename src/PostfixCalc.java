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
     int digit = 0;

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
             int tmp =  myLLStack.pop() * myLLStack.pop();
             myLLStack.push(tmp);
         }
         else if(character == '/')
         {
             double tmp =  myLLStack.pop() / myLLStack.pop();
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
