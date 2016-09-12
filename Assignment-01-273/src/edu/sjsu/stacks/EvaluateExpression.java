package edu.sjsu.stacks;

import java.util.StringTokenizer;


public class EvaluateExpression {

	/*Method : applyOperation
	 * carries out the operation specified in first argument operator
	 */
	public double applyOperation(String operator, double operand2, double operand1)
	{
		double result = 0;
		switch(operator)
		{
		case "+" :
			result = operand2 + operand1;
			break;
		case "-" :
			result = operand2 - operand1;
			break;
		case "*" :
			result = operand2 * operand1;
			break;
		case "/" :
			result = operand2 / operand1;
			break;
		case "^" :
			result = Math.pow(operand2, operand1);
		default :
			break;
		}
		
		return result;
	}
	
	public boolean checkPrecendence(String operator1, String operator2)
	{
		if(operator2.equals("(")||operator2.equals(")"))
			return false;
		if((operator1.equals("*")||operator1.equals("/")) && (operator2.equals("+")||operator2.equals("-")))
			return false;
		else if((operator1.equals("^")) && (operator2.equals("+")||operator2.equals("-")))
			return false;
		else if((operator1.equals("^")) && (operator2.equals("*")||operator2.equals("/")))
			return false;
		else
			return true;
		
	}
	
	public String evalExp(StackLinkedList operatorStack, StackLinkedList operandStack, String expression)
	{
		//Initialize variable
		
		String chkChar;
		double operand1 = 0;
		double operand2 = 0;
		String operator = "";
		double tempResult = 0;
		String result = "";
		
	
				
		StringTokenizer exp = new StringTokenizer(expression,"(){}*/+-^",true);
		
		while(exp.hasMoreTokens())
		{
			chkChar = exp.nextToken();
		
			//check if it is number
			if(chkChar.matches("[0-9]+"))
			{
				operandStack.push(chkChar);
		
			}
			//check if it is an opening paranthesis
			else if(chkChar.equals("("))
			{
				operatorStack.push(chkChar);
			}
			//check if it is a closing paranthesis
			else if(chkChar.equals(")"))
			{
				while(!operatorStack.getFirst().equals("("))
				{
					operand1=Double.parseDouble(operandStack.pop());
					operand2=Double.parseDouble(operandStack.pop());
					operator=operatorStack.pop();
					tempResult = applyOperation(operator,operand2, operand1);
					operandStack.push(String.valueOf(tempResult));
				}
				operatorStack.pop();
			}
			else if(chkChar.equals("+")||chkChar.equals("-")||chkChar.equals("/")||chkChar.equals("*")||chkChar.equals("^"))
			{
				while( (!operatorStack.CheckIfEmpty()) && (checkPrecendence(chkChar,operatorStack.getFirst())) )
				{
					
					operand1 = Double.parseDouble(operandStack.pop());
					operand2 = Double.parseDouble(operandStack.pop());
					operator = operatorStack.pop();
					tempResult = applyOperation(operator,operand2, operand1);
					operandStack.push(String.valueOf(tempResult));
				}
				operatorStack.push(chkChar);
			}
			operand1=0;
			operand2=0;
			operator="";
			tempResult=0;
		}
		
		while(!operatorStack.CheckIfEmpty())
		{
			operand1=Double.parseDouble(operandStack.pop());
			operand2=Double.parseDouble(operandStack.pop());
			operator=operatorStack.pop();
			tempResult = applyOperation(operator,operand2, operand1);
			operandStack.push(String.valueOf(tempResult));
		}
		result=operandStack.pop();
		return result;
	}
	
}
