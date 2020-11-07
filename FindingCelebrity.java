package project1;

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
