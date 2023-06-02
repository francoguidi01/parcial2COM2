package Autores;

public class Book {
    private  Integer iSBN=0;
    private Autor autor;
    public Book(Integer iSBN, Autor autor) {
        this.iSBN = iSBN;
        this.autor = autor;
        iSBN++;
    }

    public Book() {
    }

    public Integer getiSBN() {
        return iSBN;
    }

    public void setiSBN(Integer iSBN) {
        this.iSBN = iSBN;
    }
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "cantLibros=" +
                ", autor=" + autor +
                '}';
    }
}
