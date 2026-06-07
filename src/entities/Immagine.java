package entities;

public class Immagine extends Media {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo, Tipo.Immagine);
        this.luminosita = luminosita;
    }

    @Override
    public void mostra() {
        String luce = "*".repeat(luminosita);
        System.out.println(getTitle() + " visualizzata  |  luminosità: " + luce);
    }

}
