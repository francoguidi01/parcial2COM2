package Autores;

import java.awt.print.Book;

public class Autor {


    private Boolean active;
    private Integer id = 0;
    private Integer age;
    private String eyeColor;
    private String nombre;
    private String genero;
    private String registered;
    private Double latitude;
    private Double longitude;
    private Tags tags;
    private Book book;

    public Autor(Boolean active, Integer age, String eyeColor, String nombre, String genero, String registered, Double latitude, Double longitude, Tags tags, Book book) {
        this.active = active;
        this.id = ++id;
        this.age = age;
        this.eyeColor = eyeColor;
        this.nombre = nombre;
        this.genero = genero;
        this.registered = registered;
        this.latitude = latitude;
        this.longitude = longitude;
        this.tags = tags;
        this.book = book;
    }

    public Autor() {
        id = ++id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "active=" + active +
                ", id=" + id +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", registered='" + registered + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", tags=" + tags +
                ", book=" + book +
                '}';
    }
}
