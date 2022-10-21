import java.util.HashMap;
import java.util.Map;

public class sql{
	private Map<Integer,String> map;
	public sql() {
		// TODO Auto-generated constructor stub
		map = new HashMap<Integer,String>();
	}
	
	public void saveInfo(int id,String info) {;
		map.put(id, info);
	}
	
	public String getInfo(int id) {
		return map.get(id);
	}
}