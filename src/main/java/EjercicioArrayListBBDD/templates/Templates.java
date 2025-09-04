package EjercicioArrayListBBDD.templates;


import EjercicioArrayListBBDD.functionalInterfaces.pruebasAlberto.Triangulo;
import lombok.Data;

@Data
public class Templates <T> {
    private T dato;


    private void imprimirDato(){
        if (dato instanceof String) {
            System.out.println("Es un String");
        } else {
            System.out.println(dato);
        }
    }


    public static void main(String[] args) {
        Templates t = new Templates();
        t.setDato("Hola, qué tal");
        t.imprimirDato();


        Templates segundoObjeto = new Templates();
        segundoObjeto.setDato(new Triangulo(10,20));

        segundoObjeto.imprimirDato();
    }


}
