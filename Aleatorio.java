public class Aleatorio {

    static String[] hombres = {"Antonio","Juan","Jose","Martin","Ismael","Pedro"};
    static String[] mujeres = {"Rosa","Alejandra","Maria","Rocio","Marta"};
    static String[] apellidos = {"Jimenez","Arias","Gomez","Cano","Lopez"};
    static String[] funcion = {"Alumno","Admin","Profesor"};
    static String sexo;

    public static String queFuncionTiene(){

        return funcion[(int)Math.floor(Math.random()*(0-3)+3)];
    }

    public static String nombreAleatorio(String sexo){

        if(sexo.equals("H"))
            return hombres[(int)Math.floor(Math.random()*(0-6)+6)];
        else
            return mujeres[(int)Math.floor(Math.random()*(0-5)+5)];
    }

    public static String primerApellidoAleatorio(){
        return apellidos[(int)Math.floor(Math.random()*(0-5)+5)];
    }

    public static String segundoApellidoAleaoria(){
        return apellidos[(int)Math.floor(Math.random()*(0-5)+5)];
    }

    public static String sexoAleatorio(){
       int sexo2 = (int)Math.floor(Math.random()*(0-2)+2);
       if (sexo2 == 0) {

           return "H";
       }else{

            return "M";
        }
    }
}
