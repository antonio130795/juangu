public abstract class Usuarios {

     int id;
     String username;
     String password;

    public Usuarios(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Usuarios() {

    }

    public Usuarios(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
