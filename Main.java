import java.util.Scanner;

public class Main {

    static KeretManager keretManagger = new KeretManager();

    public static void main(String[] args) {

        Write(keretManagger.run(Read()));

    }

    public static void Write(String[] ansver) {
        System.out.println(ansver[0]);
        System.out.println(ansver[1]);
    }

    public static String[] Read() {
        String[] strTmp;

        Scanner s = new Scanner(System.in);

        String tmp = s.nextLine();
        strTmp = tmp.split(",");

        s.close();

        return strTmp;
    }
}