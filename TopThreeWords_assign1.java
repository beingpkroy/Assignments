package test.GoodWorkLabs;

import java.util.ArrayList;
import java.util.List;

public class TopThreeWords_assign1 {

	public static void main(String[] args) {

		String str = "Why You Will Probably Pay More for Your Christmas Tree This Year";
		String str2 = "How the Avocado Became the Fruit of the Global Trade";
		String str3 = "Hey Parents, Surprise, Fruit Juice Is Not Fruit";
		String str4 = "Visualizing Science";
		topThreeWords(str);
		System.out.println();
		topThreeWords(str2);
		System.out.println();
		topThreeWords(str3);
		System.out.println();
		topThreeWords(str4);
		System.out.println();

	}

	public static void topThreeWords(String str) {

		String[] strArr = str.split(" ");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < strArr.length; i++) {
			list.add(strArr[i]);
		}

		List<String> list2 = new ArrayList<String>();
		int flag = 0;

		for (int i = 0; i < list.size() - 1; i++) {

			if (list.get(i).length() > list.get(i + 1).length() && flag < 3) {

				list.get(i + 1).compareTo(list.get(i));
				list2.add(list.get(i));

				flag++;
			}

		}

		list2.forEach(li -> System.out.print("#" + li + ","));

	}

}
