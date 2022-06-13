

public class Person {

    public boolean checkUser(String username) {

            String naoPermitidos = "[,.@$^?~=+\\\\-_\\\\]";

            return !username.matches(naoPermitidos) || username.length() >= 8;
    }



    public boolean checkPassword(String password){

        return !password.matches("/[^l-sB-Z\\h]*/o") || password.length() >= 8;

   }
}
