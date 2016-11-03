
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
	double finalResult;
	
	for(char ch: expression.toCharArray()){
	  if(ch >= 0 && ch <= 9){
		valStack.push(ch);
	  }else if(ch == '('){
		opStack.push(ch);
	  }else if(ch == '+' || ch == '-' || ch == '/' || ch == '*'){
		if(opStack.isEmpty()){
		  opStack.push(ch);
		}else if(operatorOrder(ch) > operatorOrder((Character) opStack.first())){
		  opStack.push(ch);
	  }else{
		while(!opStack.isEmpty() && operatorOrder(ch) <= operatorOrder((Character) opStack.first())){
		 finalResult = calculate(valueOf((Character) valStack.pop()), valueOf((Character) valStack.pop()), (Character) opStack.pop());
		 valStack.push((char) finalResult); 
		}
		opStack.push(ch);
	  }
	}else if(ch == ')'){
	  while((char) opStack.first() != '('){
		finalResult = calculate(valueOf((Character) valStack.pop()), valueOf((Character) valStack.pop()), (Character) opStack.pop());
		valStack.push((char) finalResult);
	  }
	}
	 }
		while(!opStack.isEmpty()){
		  output = output  + opStack.pop();	
	}
	return output;
  }
  
 public static double valueOf(char var){
   switch(var){
   case '1': 
	 return 1.0;
   case '2': 
	 return 2.0;
   case '3': 
	 return 3.0;
   case '4': 
	 return 4.0;
   case '5': 
	 return 5.0;
   case '6': 
	 return 6.0;
   case '7': 
	 return 7.0;
   case '8': 
	 return 8.0;
   case '9': 
	 return 9.0;
   case '0': 
	 return 0.0;
   } 
	 return 0;
 }
  
  
  
  
  
  public int operatorOrder(char op){
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
  
  public Double calculate(Double opOne, Double opTwo, char op){
	switch(op){
	case '+':
	  return opOne + opTwo;
	case '-':
	  return opOne-opTwo;
	case '/': 
	  return opOne/opTwo;
	case '*':
	  return opOne + opTwo; 
	}
	return null;
	
  }
  

  public static void main(String[] args){
	String expression = "1+(2*3)-1";
	InfixCalc calc = new InfixCalc(expression);
	//PostfixCalc pc = new PostfixCalc(expression);
	calc.evaluate(expression);
	
  }
  
  
}
