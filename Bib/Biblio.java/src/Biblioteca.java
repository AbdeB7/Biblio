/*
 Biblioteca: Guarda los libros en 4 arrays.
 Como maximo tendrá 100 libros.
 Cada posición de los arrays corresponde a los datos de un libro.
 Por ejemplo:
 la posición 0 del array de títulos contiene: "El Quijote"
 la posición 0 del array de autores contiene: "Cervantes"
 la posición 0 del array de isbns contiene: "978-84-15474-01-1"
 la posición 0 del array de numPaginas contiene: 863
 la posición 0 del array de generosLiterarios contiene: "Novela"

 
    Encapsula los arrays de la clase Biblioteca en una clase y 
    refactoriza los metodos de la clase Biblioteca.

*/

public class Biblioteca {
    private libro [] listlibros;

    public Biblioteca() {
       listlibros = new libro[100];

    }
    public libro [] listlibros(){
        return listlibros;
    }

    // Devuelve true si añade el libro en la biblioteca o false en caso contrario
    public boolean añadirLibro(String  titulos, String autores , String  isbns , int  numPaginas , String  generosLit ) {

        for (int i = 0; i < 100; i++) {
            if (listlibros[i] == null) {
                libro lib= new libro(titulos,autores,isbns, numPaginas,generosLit);
                listlibros[i] = lib; 
                return true;
            }
        }
        return false;
    }

    // Elimina el libro con el isbn indicado
    public void eliminarLibro(String  isbn) {
        for (int i = 0; i < 100; i++) {
           
                if (listlibros[i].getIsbns().equals(isbn)) {
                    listlibros[i]=null;
                }
            
        }
    }

    // Muestra todos los libros de la biblioteca
    public void mostrarLibros() {
        System.out.println("Los libros de la biblioteca son:");
        for (int i = 0; i < 100; i++) {
            if (listlibros[i] != null) {
                System.out.print("El libro Es : " + listlibros[i]);
                
                System.out.println(" ");
            }
        }
        System.out.println();

    }

    // Muestra los libros con el genero literario Novela
    public void getGenero(String generosLit) {
        System.out.println("Los libros  de la biblioteca son:");

        for (int i = 0; i < 100; i++) {

            if (listlibros[i].getGenerosLit().equals(generosLit)) {

                System.out.print("El libro Es de : " + listlibros[i]);
                System.out.println(" ");
            }

        }
        System.out.println();

    }


    // Nos devuelve un array con los titulos de los libros de un autor
    public String[] librosDeAutor(String autor) {
        System.out.println("Los libros del autor:" + autor + " son:");
        String[] librosAutor = new String[100];
        int contador = 0;
        for (int i = 0; i < 100; i++) {

            if (listlibros[i].getAutores().equals(autor)) {
                librosAutor[contador] = listlibros[i].getAutores();
                contador++;
            }

        }
        return librosAutor;
    }

    // Nos devuelve el titulo del libro con mas paginas
    /**
     * 
     */
    public void mostrarLibroMasLargo() {
        int max = 0;
        String titulo="";
        for (int i = 0; i < 100; i++) {
            if (listlibros[i].getNumPaginas() > max) {
                max = listlibros[i].getNumPaginas();
                titulo = listlibros[i].getTitulos();
            }
        }
       System.out.println("El libro mas largo es: "+ titulo);
    }

}
