import java.io.IOException;


public class Test {
	public static void main(String[] args) throws IOException {
		Dictionary d = new Dictionary();
		d.add("changes");
		d.add("change");
		System.out.println(d.contains("antiquity"));
		System.out.println(d);
		d.add("antiquities");
		d.add("longitude");
		System.out.println(d.contains("antiquity"));
		System.out.println(d.contains("long"));
		System.out.println(d.contains("kind"));
		System.out.println(d.contains("change"));
		System.out.println(d);
		System.out.println(d.size());
		d.write("TestFile.txt");
	}
}
