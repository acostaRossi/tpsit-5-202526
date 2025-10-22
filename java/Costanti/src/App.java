public class App {

    class Costante {

        public int c;

        public Costante(int c) {
            this.c = c;
        }
    }

    // classe di costanti
    class Config {
        public static final String APP_NAME = "MyApp";
        public static final int VERSION = 3;
    }

    public void run() {

        final int costante = 10;

        final Costante costanteObj = new Costante(10);

        //costante = 20;

        //costanteObj = new Costante(20);
    }
}
