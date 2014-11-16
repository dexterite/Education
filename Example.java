import java.util.HashSet;
import java.util.Set;


public class Example {
	
	public static void main(String[] args) {
		Set<ExampleChar> s = new HashSet<ExampleChar>();
		for(int i=0; i<10; i++) {
			for(char c='a'; c<='z'; c++) {
				s.add(new ExampleChar(c));
			}
		}
		System.out.println("Set Size: " + s.size());
	}
}
