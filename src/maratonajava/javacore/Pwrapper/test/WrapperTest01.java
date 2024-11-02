package src.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        // Tipos primitivos no JAVA
        byte byteP = 1;
        short shortP = 2;
        int intP = 3;
        long longP = 4L;
        float floatP = 5F;
        double doubleP = 6D;
        char charP = 7;
        boolean booleanP = true;

        // Wrappers
        Byte byteW = 127;
        Short shortW = 2;
        Integer intW = 3;
        Long longW = 4L;
        Float floatW = 5F;
        Double doubleW = 6D;
        Character charW = 7;
        Boolean booleanW = true;

        // Long longW = 4 -> Aqui entra a regra do polimorfismo (Objetos), nesse caso apresenta um erro ao tentar
        // adicionar um int em um Wrapper Long

    }
}
