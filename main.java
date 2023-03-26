// importa la libreria scanner
import java.util.Scanner;
// aca arranca el codigo
public class main {
    private parqueadero raiz;

    public static void main(String[] args) {

        Lista obj = new Lista();
        Lista obj2 = new Lista();

        // agregar elementos a la lista 1
        obj.carroentra(1, "Toyota");
        obj.carroentra(2, "Chevrolet");
        obj.carroentra(3, "Lamborghini");
        obj.carroentra(4, "Ferrari");

        // agregar elementos a la lista 2
        obj2.carroentra(1, "Toyo");
        obj2.carroentra(2, "Chevr");
        obj2.carroentra(3, "Lamrg");
        obj2.carroentra(4, "Ferr");

        obj.concatenar(obj2);

        /*Listanegra jhb = new Listanegra();

        jhb.marca2(1, "Audi");*/


//        // aca se pide que se ingrese la marca que desea buscar
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la marca que quiere buscar");
        String busca = sc.next();
        // si la marca se encuentra imprima el siguiente mensaje
        if (obj.buscar_marca(busca)) {
            System.out.println("La marca se encuentra");
        } else {
            // de lo contrario  imprime el mensaje el dato no se encuentra
            System.out.println("El dato no se encuentra");
        }


        obj.Borra_marquita("");

            //imprime el numero de vehiculos
        System.out.println("El numero de vehiculos es: " + obj.va());
        // imprime en que posición esta el vehiculo
        System.out.println("El vehiculo en esa posicion es: " + obj.vercarro(0));
        // nos dice que marcas hay en el parqueadero
        System.out.println("Las marcas que hay en el parqueadero son: ");
        //muestra la lista
        obj.mostrar_lista();
        //remplaza el vehiculo en la poscion cero por la marca mazda
        obj.reemplazar(0,"Mazda");
        // mustra la lsita una ves se haya sustituido el dato
        System.out.println("Las marcas que hay en el parqueadero despues de sustituirla son: ");
        //por ultimo muestra la lista con los cambios realizados
        obj.mostrar_lista();

    }






}
