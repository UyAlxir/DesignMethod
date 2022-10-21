
public class encryption {
	public String encrypt(String info) {
		return "#"+info+"#";
	}
	
	public String decrypt(String info) {
		return info.replace("#", "");
	}
}
