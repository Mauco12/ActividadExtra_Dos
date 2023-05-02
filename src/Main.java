import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        LeerArchivo lectura = new LeerArchivo();
        try {
            lectura.metodoUno("datos.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}