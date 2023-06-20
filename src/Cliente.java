public class Cliente extends Persona {

    private int credito;

    public Cliente(String nombre, int edad, String numeroTelefono, int credito) {
        super(nombre, edad, numeroTelefono);
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }
}
