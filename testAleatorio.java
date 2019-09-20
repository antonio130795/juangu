public class testAleatorio {

    public static void main(String[] args) {

        Aleatorio aleatorio = new Aleatorio();
        String sexo = aleatorio.sexoAleatorio();
        System.out.println(aleatorio.queFuncionTiene());
        System.out.println(sexo);
        System.out.println(aleatorio.nombreAleatorio(sexo));
        System.out.println(aleatorio.primerApellidoAleatorio());
        System.out.println(aleatorio.segundoApellidoAleaoria());

    }
}
