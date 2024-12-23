package maratonajava.javacore.Oexception.exception.test;

import maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
        System.out.println("_____________________________");
    }

    private static void logar() throws LoginInvalidoException {
        Scanner entrada = new Scanner(System.in);
        String usernameDB = "Pedro";
        String passwordDB = "123456";
        System.out.println("Usuário: ");
        String usernameDigitado = entrada.nextLine();
        System.out.println("Senha: ");
        String passwordDigitado = entrada.nextLine();

        if(!usernameDB.equals(usernameDigitado) && !passwordDB.equals(passwordDigitado)){
            throw new LoginInvalidoException("Usuário ou senha inválidos!");
        }

        System.out.println("Usuário logado com sucesso!");
    }
}
