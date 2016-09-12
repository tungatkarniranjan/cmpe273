package edu.sjsu.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.stacks.EvaluateExpression;
import edu.sjsu.stacks.StackLinkedList;

public class EvalExpressionTest {

	@Test
	public void testEvalExp() {
		StackLinkedList operatorStack = new StackLinkedList() ;
		StackLinkedList operandStack = new StackLinkedList();
		EvaluateExpression evlExp = new EvaluateExpression();
		String exp = "(3+4)*6^2";
		String result = evlExp.evalExp(operatorStack,operandStack,exp);
		System.out.println(result);
		assertEquals("252.0", result);
		exp = "(3+4*7)*6+2";
		result = evlExp.evalExp(operatorStack,operandStack,exp);
		System.out.println(result);
		assertEquals("188.0", result);
	}

}
