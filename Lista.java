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



//    public void concatenar(Lista lista2) {
//        if (this.raiz == null) {
//            this.raiz = lista2.raiz;
//        } else if (lista2.raiz != null) {
//            parqueadero ultimo = this.raiz;
//            while (ultimo.getSig() != null) {
//                ultimo = ultimo.getSig();
//            }
//            ultimo.setSig(lista2.raiz);
//            lista2.raiz.setAnt(ultimo);
//        }
//    }












//    public void concatenar(Lista li) {
//        if (li.raiz != null) {
//            if (raiz == null) {
//                raiz= li.raiz;
//                tail = li.tail;
//            } else {
//                tail.getSig() = li.getSig();
//                li.raiz.getAnt() = tail;
//                tail = li.tail;
//            }
//            size += li.size;
//        }
//    }


}

// le entienden al profesor ?? esta africa

//dnde esta afriaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

// CLARO
//Amazna
// quejnnfdjfdmkl;klmsdzfdmkk;dflvfdkltrgjiotgvrhfn
//perdon, le pegue al teclado con la cabeza
// se calman ?
// mk estoy que me duermo
//chupelo

//tu maldita madle
//saramambiche es hijoeperra
//y tu no mete cabra e tu no mete miedo

//Tu no mama kbra sammambiche ie estoy subiendo como espuma prediendole en la cara al que no fuma
// usd  es sarambiche creo
// e vehiculo favorito de Andres es el tterreneitor
// hombre es buen juguete y su medio de transporte sip por eso no me quedo barado
//haber les tengo una mecanica cada uno va escribiendo la letra de una canción y gana quien la adivine le entran ?
// lo ideal es no poner el nombre de la canción va dale
//llamado de emergencia
//yo comienzo
//Comnienzeme esta Atencion a todas las unidades
//hombre moribundo con aparente ataque caldiaco
//Ven y sana mi doloooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooor
//tienes la cura de este amoooooooooooooooooooooor
//Hago este llamado para que tu vuelvas
//tu no ves que estoy sufirnedo q es muy dura esta prueba
//Aaaaaaaaaaaaaaaaaaaaaaaaabrazeme y dime que me amas --- esa parte no viene ahora care verga :(
//leche?
//si



//ya la cago Andres
// ahora el diego
// aver lo ideal es que vaya una sola persona escribiendo la canci´n y los otros la adivinan
// me rindo
//turno del diego
//Ven y sana my dooooooooooooooooooloooooooooooooooooooooooooooooooor
//Fuegooooooooooooooooooo
//la propia nubecita
//Por que se llama Marco Antonio Solis si no esta solo
//Faraon Love Shady // borren esta M no mamen que siguen con esa canción
// tu tienes la receta, la formula secreta

//gente
// yo era muy fan de ben 10 especificamente de alien x
//entonces busque "alien x videos"

//Se volvio mas fan aun

//si
//Alguna pregunta?
// ajajajajjajajajajajaj

//andres di de 3


