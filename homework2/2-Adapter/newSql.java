
public class newSql extends sql implements service {

	@Override
	public void save(int id, String info) {
		// TODO Auto-generated method stub
		encryption encrypt = new encryption();
		info = encrypt.encrypt(info);
		this.saveInfo(id, info);
	}

	@Override
	public String get(int id) {
		// TODO Auto-generated method stub
		String info = this.getInfo(id);
		encryption encrypt = new encryption();
		info = encrypt.decrypt(info);
		return info;
	}
	
}
