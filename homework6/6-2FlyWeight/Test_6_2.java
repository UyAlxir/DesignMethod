public class Test_6_2 {
    public static void main(String[] args) {
        PermissioonFactory permissioonFactory = new PermissioonFactory();
        permissioonFactory.UsersPermission("0000");
        permissioonFactory.UsersPermission("1111");
        permissioonFactory.UsersPermission("1010");
        permissioonFactory.UsersPermission("0111");
        permissioonFactory.UsersPermission("1001");
    }
}
