public class Cadena {
    private String texto;

    public Cadena(String texto) {
        this.texto = texto;
    }

    public String getCadena() {
        return texto;
    }

    public void setCadena(String texto) {
        this.texto = texto;
    }

    public String reverse() {
        String cadInv = new String();
        for (int i = texto.length() - 1; i >= 0; i--) {
            cadInv += texto.charAt(i);
        }
        return cadInv;
    }

    public int getTotalCoincidencias(String cadInv) {
        int contador = 0;
        texto = texto.toLowerCase();
        cadInv = cadInv.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == cadInv.charAt(i)) {
                contador++;
            }
        }
        return contador;
    }
}