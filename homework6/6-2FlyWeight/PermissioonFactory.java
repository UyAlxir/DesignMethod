import java.util.HashMap;

public class PermissioonFactory {
    private HashMap<String,Permission> pool ;
    private static String[] permissions = {"Query","Add","Modify","Delete"};
    public PermissioonFactory(){
        pool=new HashMap<>();
    }

    public String getPermission( String permission ){
        if(pool.containsKey(permission)){
            return pool.get(permission).toString();
        } else {
            pool.put(permission,new Permission(permission));
            return pool.get(permission).toString();
        }
    }

    public void UsersPermission(String persmissons){
        System.out.println("The Permissions of Current User are shown below :");
        for(int i=0;i<4;i++){
            if (persmissons.charAt(i)=='1'){
                System.out.println(this.getPermission(PermissioonFactory.permissions[i]));
            }
        }
        System.out.println("*******************************************\n");
    }
}
