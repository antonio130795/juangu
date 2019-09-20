public class Profesores extends Usuarios {

    String DNI;
    String nombre;
    String apellido;
    String email;
    String telefono;
    String sexo;

    public Profesores(String DNI, String nombre, String apellido, String email, String telefono, String sexo) {
        super();
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
