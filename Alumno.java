public class Alumno extends Usuarios{

    String nombre;
    String apellido;
    String email;
    String sexo;

    public Alumno(String nombre, String apellido, String email, String sexo, String username, String password) {
        super(username, password);
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sexo = sexo;
    }

//dos metodos uno para usuario y otro para pasword



    @Override
    public String toString() {
        return super.toString();
    }
}
