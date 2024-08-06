package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxDiff {

	public static void main(String[] args) {
		int a[] = { 1, 5, 2, 18, 20, 13, 13, 18 };
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++)
			s.add(a[i]);
		System.out.println("Remove Duplicates:" + s);
		List<Integer> l = new ArrayList<Integer>(s);
		Collections.sort(l);
		System.out.println("Sorted Array: " + l);
		int Max = l.get(1) - l.get(0);
		for (int i = 0; i < l.size() - 1; i++) {

			if (Max < l.get(i + 1) - l.get(i)) {
				Max = l.get(i + 1) - l.get(i);
			}

		}
		System.out.println(Max);

	}

}
