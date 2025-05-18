package maratonajava.javacore.ZZAclassesinternas.test;

public class ClassesExternasTest01 {

    private String nome = "Lucas";

    class Interna {
        public void imprimeAtributoClasseExterna() {
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        Interna interna2 = new ClassesExternasTest01().new Interna();
        interna2.imprimeAtributoClasseExterna();

        ClassesExternasTest01 externa = new ClassesExternasTest01();
        Interna interna = externa.new Interna();
        interna.imprimeAtributoClasseExterna();
    }

}
