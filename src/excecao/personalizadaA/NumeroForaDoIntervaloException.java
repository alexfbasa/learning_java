package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends RuntimeException {

    private String nomeDoAtributo;

    public NumeroForaDoIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;

    }

    public String getMessage() {
        return String.format("O numero '%s' esta fora do intervalo ", nomeDoAtributo);
    }
}
