package project1;
/**
 * Problem Statement
Suppose you are at a party with n people (labeled from 0 to n - 1) and among them, there may exist one celebrity.
 The definition of a celebrity is that all the other n - 1 people know him/her but he/she does not know any of them.
Now you want to find out who the celebrity is or verify that there is not one. The only thing you are allowed to do is to ask questions
 like: "Hi, A. Do you know B?" to get information of whether A knows B.
 You need to find out the celebrity (or verify there is not one) by asking as few questions as possible (in the asymptotic sense).
You are given a helper function bool knows(a, b) which tells you whether A knows B. Implement a function int findCelebrity(n),
 your function should minimize the number of calls to knows.
Note: There will be exactly one celebrity if he/she is in the party. Return the celebrity's label if there is a celebrity in the party. 
If there is no celebrity, return -1.

Solution Explanation
If we break down the given information, few things stand out,

There's only one celebrity and every other person in the party knows this person.
The celebrity doesn't know anyone in the party.
Other people may or may not know each other. Like a person i can know person j where 0<i<j<n.
Based on the above information, we can start by finding out a person who is known by most people and then confirm if this person fits all the points noted above.

Below is the java implementation of find the celebrity problem,
 * @author adity
 *
 */
public class FindingCelebrity extends Relation {
	public int findingCelebrity(int n) {
		int candidate = 0;
		for (int i = 1; i < n; i++) {
			if (knows(candidate, i)) {
				candidate = i;
			}
		}
		System.out.println(candidate);
		for (int i = 0; i < n; i++) {
			if (i != candidate && knows(candidate, i) || !knows(i, candidate)) {
				return -1;
			}
		}
		return candidate;
	}

	public static void main(String[] args) {
		int n = 3;
		FindingCelebrity fc = new FindingCelebrity();
		System.out.println(fc.findingCelebrity(n));
	}

}

OUTPUT:
0
-1

