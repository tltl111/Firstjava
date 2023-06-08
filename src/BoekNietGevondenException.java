public class BoekNietGevondenException extends Exception {
    public BoekNietGevondenException() {
        super("Boek niet gevonden.");
    }

    public BoekNietGevondenException(String message) {
        super(message);
    }

    public BoekNietGevondenException(String message, Throwable cause) {
        super(message, cause);
    }

    public BoekNietGevondenException(Throwable cause) {
        super(cause);
    }
}
