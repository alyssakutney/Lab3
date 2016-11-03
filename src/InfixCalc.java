
/**
 * 
 * @author kutneya1
 *
 */
public class InfixCalc { 
  private String expression;
  private LinkedListStack opStack = new LinkedListStack<>();
  private LinkedListStack valStack = new LinkedListStack<>();
  private String output = "";
  
  
  public InfixCalc(String expression){
	this.expression = expression;
  }
  
  public String evaluate(String expression){
	double result;
	
	for(char ch: expression.toCharArray()){
	  if(ch >= 0 && ch <= 9){
		valStack.push(ch);
	  }else if(ch == '('){
		opStack.push(ch);
	  }else if(ch == '+' || ch == '-' || ch == '/' || ch == '*'){
		if(opStack.isEmpty()){
		  opStack.push(ch);
		}else if(operatorOrder(ch) > operatorOrder((char) opStack.first())){
		  opStack.push(ch);
	  }
	}
	 }
		while(!opStack.isEmpty()){
		  output = output  + opStack.pop();	
	}
	return output;
  }
  
 
  
  private int operatorOrder(char op){
	switch(op){
		case '(': 
		  return 0;
		case ')': 
		  return 0;
		case '+':
		  return 1;
		case '-':
		  return 1;
		case '*': 
		  return 2;
		case '/': 
		  return 2;
		
	}
	return -1;
  }
  
  
/*public static String calculate()
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

  */
  
  
  public static void main(String[] args){
	String expression = "1+(2*3)-1";
	InfixCalc calc = new InfixCalc(expression);
	//PostfixCalc pc = new PostfixCalc(expression);

	
  }
  
  
}
