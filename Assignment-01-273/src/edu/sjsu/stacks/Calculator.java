package edu.sjsu.stacks;

import java.util.*;

public class Calculator {

		
		/*
		 * Main method
		 */
		public static void main(String[] args) {
		
		StackLinkedList operatorStack = new StackLinkedList();
		StackLinkedList operandStack = new StackLinkedList();
		EvaluateExpression evlExp = new EvaluateExpression();
		
		Scanner readExp = new Scanner(System.in);
		String expression = "";
		String result = "";
		
		System.out.println("Simple Calculator\n");
		
		System.out.println("Enter the mathematical expression you want to evaluate : ");
		expression = readExp.nextLine();
		result = evlExp.evalExp(operatorStack, operandStack, expression);
		
		System.out.println("Calculated Value : " + result );
		readExp.close();
	}
		
}
