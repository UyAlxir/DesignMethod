
public class newSql2 extends service2{
	private sql mysql;
	
	public newSql2(sql cursql) {
		// TODO Auto-generated constructor stub
		mysql = cursql;
	}
	
	@Override
	public void save(int id, String info) {
		// TODO Auto-generated method stub
		encryption encrypt = new encryption();
		encrypt.encrypt(info);
		mysql.saveInfo(id, info);
	}

	@Override
	public String get(int id) {
		// TODO Auto-generated method stub
		String info = mysql.getInfo(id);
		encryption encrypt = new encryption();
		info = encrypt.decrypt(info);
		return info;
	}

}
