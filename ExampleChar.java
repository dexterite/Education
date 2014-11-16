
public class ExampleChar {
	private char c = 0;
	
	public ExampleChar(char c) {
		this.set(c);
	}
	
	public void set(char c) {
		this.c = c;
	}
	
	public char get() {
		return this.c;
	}
	
	public boolean equals(ExampleChar ec) {
		if(ec.get() == this.c) {
			return true;
		} 
		return false;
	}
	
	public int hashCode() {
		return 31 * c;
	}
}
