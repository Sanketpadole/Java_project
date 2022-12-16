package Roshan;

import java.util.ArrayList;
import java.util.List;

public class Program8 {
	public static void main(String[] args) {
		String str = "Java";
		String nstr = " ";

		char ch;

		List ch1 = new ArrayList();
		for (int i = 0; i <= str.length() - 1; i++) {
			ch = str.charAt(i);

			ch1.add(str.charAt(i));
			ch1.add("Java");

			ch = str.charAt(i + 1);
			ch1.add(str.charAt(i + 1));

			ch1.add("is");
			ch = str.charAt(i + 2);
			ch1.add(str.charAt(i + 2));

			ch1.add("good");
			ch = str.charAt(i + 3);
			ch1.add(str.charAt(i + 3));

			ch1.add("language");
			ch1.remove((","));

			break;

		}
		ch1.remove(",");
		System.out.println(ch1);

	}
}

//public static void main(String[] args) {
//	java.util.List l=new ArrayList();
//	l.add(10);
//	l.add("deepak");
//	l.add("rahul");
//	ListIterator li=l.listIterator();
//	while(li.hasNext())
//	{
//		System.out.println(li.next());
//	}
//}

// op=" java is good language"
//	j=java
//	a=is
//	v=good
//	a=language
