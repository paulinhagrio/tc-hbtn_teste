package email;

public class TesteEmail {

    public static boolean testar_email_com_arroba(){
        return Pessoa.emailValid("email_teste@dominio.com.br");

    }

    public static boolean testar_email_sem_arroba(){
        return Pessoa.emailValid("email_@testedominio.com.br");

    }

    public static boolean testar_email_mais_50_caracteres(){
        return Pessoa.emailValid("email_teste_valido@dominio.com.br");
    }
}