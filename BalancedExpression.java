package project2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class BalancedExpression {
	static Map<Character,Character> map = new HashMap<>();
	static {
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
	}
	static String validateExpression(String expression) {
		if(expression.length()%2 == 1) {
			return "NO";
		}
		Stack<Character> stack = new Stack<Character>();
		for(char c:expression.toCharArray()) {
			if(map.containsKey(c)) {
				stack.push(c);
			}else if(stack.isEmpty() || map.get(stack.pop())!=c) {
				return "NO";
			}
		}
		return stack.isEmpty()?"YES":"NO";
	}

	public static void main(String[] args) {
		System.out.println(BalancedExpression.validateExpression("{()}[]"));
		// TODO Auto-generated method stub

	}

}
