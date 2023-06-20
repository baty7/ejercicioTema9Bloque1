public class Trabajador extends Persona {
    private int salario;

    public Trabajador(String nombre, int edad, String numeroTelefono, int salario) {
        super(nombre, edad, numeroTelefono);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }
}
