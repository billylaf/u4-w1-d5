package entities;

public abstract class Media {
    private final Tipo tipo;
    private String title;

    public Media(String title, Tipo tipo) {
        this.title = title;
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void mostra();

    public enum Tipo {Audio, Video, Immagine}
}
