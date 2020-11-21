package project2;
/**
 * A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left 
of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of
 matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched.
 For example, {[(])} is not balanced because the contents in between { and } are not balanced.
  The pair of square brackets encloses a single, unbalanced opening bracket, (, and the 
  pair of parentheses encloses a single, unbalanced closing square bracket, ].


 
By this logic, we say a sequence of brackets is balanced if the following conditions are met:
It contains no unmatched brackets.
The subset of brackets enclosed within the confines of a matched pair of brackets
 is also a matched pair of brackets.
Given n strings of brackets, determine whether each sequence of brackets is balanced.
 If a string is balanced, return YES. Otherwise, return NO.

Sample Input:
?
1
2
3
4
3
{[()]}
{[(])}
{{[[(())]]}}
Sample Output:
?
1
2
3
YES
NO
YES
Our Approach

1) Declare a stack.

2) Now traverse the expression string character by character.

If the current character is a opening bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop character from stack and if the popped character is the matching opening bracket then fine else parenthesis are not balanced.
3) After complete traversal, if there the stack is not empty, then the expression is not balanced.
 */
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
