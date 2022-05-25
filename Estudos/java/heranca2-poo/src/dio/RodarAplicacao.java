package dio;

public class RodarAplicacao {
    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[]{new ClassFilha1(), new ClassFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes) {
            classe.metodo1();
        }
        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        ClassFilha2 classFilha2 = new ClassFilha2();
        classFilha2.metodo2();
    }
}
