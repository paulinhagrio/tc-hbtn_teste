package email;


public class Pessoa {
    public static boolean emailValid(String email){
        if (email.contains("@")){
            if(email.length() <= 50){
                return true;
            }
        }
        return false;
    }
}