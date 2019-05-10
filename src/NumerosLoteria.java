public class NumerosLoteria {

    private String significado;
    private int numero;



    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void imprimirNumeros(){
        System.out.println(numero + " - " + significado);
    }
}
