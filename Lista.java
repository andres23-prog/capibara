public class Lista {
    private parqueadero raiz;

    public Lista() {

        this.raiz = null;

    }




    public int va() {

        int con = 0;
        parqueadero aux = this.raiz;
        while (aux != null) {
            aux = aux.getSig();
            con++;
        }

        return con;

    }

    public void carroentra(int pos, String p) {

        if (pos <= va() + 1) {

            parqueadero nuevo = new parqueadero();
            nuevo.setmarca(p);

            if (pos == 1) {

                nuevo.setSig(raiz);

                if (raiz != null) {

                    raiz.setAnt(nuevo);

                }
                raiz = nuevo;

            } else {

                if (pos == va() + 1) {

                    parqueadero aux = raiz;
                    while (aux.getSig() != null) {
                        aux = aux.getSig();
                    }
                    aux.setSig(nuevo);
                    nuevo.setAnt(aux);
                    nuevo.setSig(null);
                } else {

                    parqueadero aux1 = raiz;
                    for (int i = 0; i <= pos - 1; i++) {
                        aux1 = aux1.getSig();


                        parqueadero proximo = aux1.getSig();
                        aux1.setSig(nuevo);
                        nuevo.setAnt(aux1);
                        nuevo.setSig(proximo);
                        proximo.setAnt(nuevo);
                    }

                }
            }

        }

    }

    public void marca2(int pos, String p) {

        if (pos <= va() + 1) {

            parqueadero nuevo = new parqueadero();
            nuevo.setmarca(p);

            if (pos == 1) {

                nuevo.setSig(raiz);

                if (raiz != null) {

                    raiz.setAnt(nuevo);

                }
                raiz = nuevo;

            } else {

                if (pos == va() + 1) {

                    parqueadero aux = raiz;
                    while (aux.getSig() != null) {
                        aux = aux.getSig();
                    }
                    aux.setSig(nuevo);
                    nuevo.setAnt(aux);
                    nuevo.setSig(null);
                } else {

                    parqueadero aux1 = raiz;
                    for (int i = 0; i <= pos - 1; i++) {
                        aux1 = aux1.getSig();


                        parqueadero proximo = aux1.getSig();
                        aux1.setSig(nuevo);
                        nuevo.setAnt(aux1);
                        nuevo.setSig(proximo);
                        proximo.setAnt(nuevo);
                    }

                }
            }

        }

    }
    // nos permite ver el que dato esta mediante una posicion
    public String vercarro(int pos) {
        int con = 0;

        parqueadero aux = this.raiz;
        while (aux != null) {
            aux = aux.getSig();
            con++;
            if (pos == con) {

                return aux.getmarca();
            }
        }
        if (pos == 0) {
            return this.raiz.getmarca();
        }
        return null;
    }


    public void mostrar_lista() {
        parqueadero ea = this.raiz;

        while (ea != null) {
            System.out.println(ea.getmarca());
            ea = ea.sig;
        }
    }

    public boolean buscar_marca(String b) {
        boolean encontrar = false;

        parqueadero haux = this.raiz;

        while (encontrar != true && haux != null) {

            if (b.equals(haux.marca)) {
                encontrar = true;
            } else {
                haux = haux.sig;
            }
            if (encontrar == true) break;
        }
        return encontrar;
    }


    public void Borra_marquita(String Borrita) {

        parqueadero ParTemporal = this.raiz;
        parqueadero prev = null;
        boolean found = false;

        while (ParTemporal != null && found == false) {

            if (ParTemporal.getmarca().equals(Borrita)) {
                if (prev == null) {
                    this.raiz = ParTemporal.getSig();
                    ParTemporal.setSig(null);
                } else {
                    prev.setSig(ParTemporal.getSig());
                    ParTemporal.setSig(null);
                }
                found = true;
            }

            prev = ParTemporal;
            ParTemporal = ParTemporal.getSig();

        }
    }

    public void reemplazar(int posicion, String nuevamarca) {
        parqueadero actual = raiz;
        int posicionactual = 0;
        while (actual != null && posicionactual != posicion) {
            actual = actual.getSig();
            posicionactual++;
        }
        if (actual != null) {
            actual.setmarca(nuevamarca);
        }
    }


    public void concatenar(Lista lista2) {

        if (this.raiz == null) {
            this.raiz = lista2.raiz;
        } else {
            parqueadero aux = this.raiz;
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(lista2.raiz);
            lista2.raiz.setAnt(aux);
        }
    }



}



