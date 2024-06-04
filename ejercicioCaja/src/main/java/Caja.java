
public class Caja {

    private double largo;
    private double ancho;
    private double alto;

    public Caja() {   //constructor por defecto

        largo = 0;
        ancho = 0;
        alto = 0;
    }

    public Caja(double largo, double ancho, double alto) {   //constructor parametrizado 

        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public String estado() {//estamos generando una cadena de caracteres con el estado del metodo
        String estado = "El largo es: " + this.largo + " el ancho es: " + this.ancho + " el alto es: " + this.alto;
        return estado;//siempre se debe retornar
    }

    public Caja(Caja caja) {//constructor por copia

        this.alto = caja.alto;
    }

    //Metodos get y set 
    public double getLargo() {
        return this.largo;
    }

    public void setLargo(double largo) {

        this.largo = largo;
    }

    public double calcularVolumen() {
        return this.alto * this.ancho * this.largo;
    }
}
