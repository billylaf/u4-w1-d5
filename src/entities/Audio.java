package entities;

public class Audio extends Media {
    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo, Tipo.Audio);
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public void mostra() {
        if (volume < 0) volume = 0;
        String vol = "!".repeat(volume);
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitle() + " in riproduzione  |  volume: " + vol);
        }
        System.out.println("Volume attuale: " + volume);
    }

}