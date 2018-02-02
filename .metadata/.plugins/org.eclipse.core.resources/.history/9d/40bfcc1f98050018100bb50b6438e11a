import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class exampleList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examplelist = new ArrayList<String>();
		examplelist.add("Test1");
		examplelist.add("Test2");
		examplelist.add("Test3");
		
		String element0 = examplelist.get(0);
		String element1 = examplelist.get(1);
		String element2 = examplelist.get(2);
		
		System.out.println(element0 + ", " + element1 + ", " + element2);
		
		System.out.println("access via Iterator");
		Iterator<String> iterator = examplelist.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
				System.out.println(element);
		}
		System.out.println("access via new for-loop");
		for(String example: examplelist) {
			System.out.println(example);
		}
		
		List<String> test = new ArrayList<String>();
		String s = "hi";
		test.add("string");
		test.add(s);
		test.add(s+s);
		System.out.println(test.size());
		System.out.println(test.contains(42));
		System.out.println(test.contains("hihi"));
		test.remove("hi");
		System.out.println(test.size());
	}

}
