import entities.Audio;
import entities.Immagine;
import entities.Media;
import entities.Video;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Crea la tua compilation:");
    System.out.println("  1 → Audio   2 → Video   3 → Immagine   0 → stop");
    System.out.println("Hai 3 spazi disponibili.\n");

    Media[] lista = new Media[3];

    for (int i = 0; i < lista.length; i++) {
        System.out.print("Slot " + (i + 1) + "/3 (0 per fermarsi): ");
        int scelta = scanner.nextInt();
        scanner.nextLine();

        if (scelta == 0) {
            System.out.println("Inserimento interrotto.");
            break;
        } else if (scelta == 1) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Durata (min): ");
            int durata = scanner.nextInt();
            System.out.print("Volume(1-10): ");
            int volume = scanner.nextInt();
            lista[i] = new Audio(nome, durata, volume);

        } else if (scelta == 2) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Durata (min): ");
            int durata = scanner.nextInt();
            System.out.print("Volume(1-10): ");
            int volume = scanner.nextInt();
            System.out.print("Luminosità(1-10): ");
            int luce = scanner.nextInt();
            lista[i] = new Video(nome, durata, volume, luce);

        } else if (scelta == 3) {
            System.out.print("Nome(1-10): ");
            String nome = scanner.nextLine();
            System.out.print("Luminosità(1-10): ");
            int luce = scanner.nextInt();
            lista[i] = new Immagine(nome, luce);

        }
    }

    boolean attivo = true;
    while (attivo) {
        System.out.println("\n//// LA TUA COMPILATION ////");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                System.out.println((i + 1) + ". [" + lista[i].getTipo() + "] " + lista[i].getTitle());
            } else {
                System.out.println((i + 1) + ". [vuoto]");
            }
        }
        System.out.print("Quale vuoi aprire? (1-3 o permere 0 per uscire): ");
        int scelta = scanner.nextInt();

        if (scelta == 0) {
            attivo = false;
        } else if (scelta >= 1 && scelta <= 5) {
            Media selezionato = lista[scelta - 1];
            if (selezionato != null) {
                selezionato.mostra();
            } else {
                System.out.println("Slot vuoto.");
            }
            System.out.println("//////////////////////////////////////////////");
        } else {
            System.out.println("INserire un numero tra 0 e 5.");
        }
    }

}