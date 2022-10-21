import java.util.ArrayList;
import java.util.List;

public class Pages implements Aggregate{
    public List<Page> pages;
    
    public Pages() {
		// TODO Auto-generated constructor stub
    	pages = new ArrayList<Page>();
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new PagesIterator(this);
	} 

	public int getLength() {
		return pages.size();
	}
	
	public void add(Page page) {
		pages.add(page);
	}
	
	public Page getPage(int index) { 
		return pages.get(index);
	}
}