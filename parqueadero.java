
// nodos conexion de los datos
// son todos los nodos y punteros
public class parqueadero {

    public String marca;

    public parqueadero ant;

    public parqueadero sig;


    public parqueadero() {
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public parqueadero getAnt() {
        return ant;
    }

    public void setAnt(parqueadero ant) {
        this.ant = ant;
    }

    public parqueadero getSig() {
        return sig;
    }

    public void setSig(parqueadero sig) {
        this.sig = sig;
    }



}


