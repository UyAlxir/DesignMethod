
public class Test2_2 {
	public static void main(String[] args) {
		service2 s = new newSql2(new sql());
		s.save(1, "abc");
		System.out.print(s.get(1));
	}
}
