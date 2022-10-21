
public class Test2_1 {
	public static void main(String[] args) {
		service s = new newSql();
		s.save(1, "abc");
		System.out.print(s.get(1));
	}
}
