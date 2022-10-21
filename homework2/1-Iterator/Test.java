
public class Test {
	public static void main(String[] args) {
		Pages pages = new Pages();
		pages.add(new Page("page 1"));
		pages.add(new Page("page 2"));
		pages.add(new Page("page 3"));
		pages.add(new Page("page 4"));
		Iterator it = pages.iterator();
		while(it.hasNext()){
			Page page= (Page)it.next();
			System.out.println(page.getContent());
		}
	}
}
