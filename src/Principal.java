public class Principal {
    public static void main(String[] args) {

        MiHebra h1 = new MiHebra('A', 100);
        MiHebra h2 = new MiHebra('B', 100);
        MiHebra h3 = new MiHebra('C', 100);

        h1.start();
        h2.start();
        h3.start();
    }
}

