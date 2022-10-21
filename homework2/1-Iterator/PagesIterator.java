
public class PagesIterator implements Iterator{
	private Pages pages;
	private int index;
	
	public PagesIterator(Pages pages) {
		// TODO Auto-generated constructor stub
		this.pages=pages;
		this.index=0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return this.index<this.pages.getLength();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Page page = pages.getPage(index);
		index++;
		return page;
	}
	
}
