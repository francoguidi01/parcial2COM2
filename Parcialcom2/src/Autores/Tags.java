package Autores;

public enum Tags {
    LABORE("labore"), IPSUM("ipsum"), MINIM("minim"), CILLUM("cillum"), MAGNA("magna"), NON("non");
    private String tags;

    Tags(String tags) {
        this.tags = tags;
    }

    public String getTags() {
        return tags;
    }
}
