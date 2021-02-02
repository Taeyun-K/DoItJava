package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("ÀÓÁ¤¼ø"));
		hashSet.add(new String("¹ÚÇö¼÷"));
		hashSet.add(new String("À±Á¤È£"));
		hashSet.add(new String("ÃÖ½Â±¸"));
		hashSet.add(new String("ÃÖ½Â±¸"));
		
		System.out.println(hashSet);
	}

}
