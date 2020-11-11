package project1;

import java.util.ArrayList;
import java.util.List;

// letter combination of a phone number
/**
 * Given a string containing numbers 2-10 inclusive return all possible combination that the number could represent.
 * note that 1 and 0 does not match with any letters
 * input : "23"
 * output : ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 *  Return the answer in any order.
A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 * @author adity
 *
 */
public class PhNumLetterCombination {
	public static List<String> letterCombinations(String digits){
		List<String> result = new ArrayList<>();
		if(digits==null || digits.length()==0)
			return result;
		String[] mapping = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		letterCombinationRecursive(result,digits,"",0,mapping);
        return result;
	}
 
	private static void letterCombinationRecursive(List<String> result, String digits, String current, int index,
			String[] mapping) {
      		if(index==digits.length()) {
      			result.add(current);
      			return;
      		}
      		String letters = mapping[digits.charAt(index)-'0'];
      		for(int i=0;i<letters.length();i++) {
      			letterCombinationRecursive(result,digits,current+letters.charAt(i),index+1,mapping);
      		}
	}

	public static void main(String[] args) {
		String digits = "23";
		System.out.println(letterCombinations(digits));
		
	}
}
