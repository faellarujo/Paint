package pt.com.paint.exceptions;

public class PedidoJaExistenteException extends RuntimeException {
    public PedidoJaExistenteException(String message) {
        super(message);
    }
}
