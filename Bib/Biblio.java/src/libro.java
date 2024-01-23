
public class libro {
 private String  titulos;
 private String  autores;
 private String  isbns;
 private int  numPaginas;
 private String  generosLit;  
     
 
 
   public libro(String titulos,String  autores , String  isbns, int  numPaginas, String generosLit ){
         this.titulos = titulos;
         this.autores= autores;
         this.isbns = isbns;
         this.numPaginas = numPaginas;
         this.generosLit = generosLit;


 }

public String toString(){
    return titulos+autores;
}

public String getTitulos() {
    return titulos;
}



public void setTitulos(String titulos) {
    this.titulos = titulos;
}



public String getAutores() {
    return autores;
}



public void setAutores(String autores) {
    this.autores = autores;
}



public String getIsbns() {
    return isbns;
}



public void setIsbns(String isbns) {
    this.isbns = isbns;
}



public int getNumPaginas() {
    return numPaginas;
}



public void setNumPaginas(int numPaginas) {
    this.numPaginas = numPaginas;
}



public String getGenerosLit() {
    return generosLit;
}



public void setGenerosLit(String generosLit) {
    this.generosLit = generosLit;
}


 
}
