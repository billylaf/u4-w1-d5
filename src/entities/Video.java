package entities;

public class Video extends Media {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, Tipo.Video);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void mostra() {
        if (volume < 0) volume = 0;
        String vol = "!".repeat(volume);
        String luce = "*".repeat(luminosita);
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitle() + " in riproduzione  |  volume: " + vol + "  |  luminosità: " + luce);
        }
        System.out.println("Volume attuale: " + volume);
        System.out.println("Luminosità attuale: " + luminosita);
    }
}