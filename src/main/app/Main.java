package app;

import iterator.IteratorPlaylist;
import model.Playlist;
import service.PlaylistService;

public class Main {

    public static void main(String[] args) {

        PlaylistService service =
                new PlaylistService();

        service.adicionarMusica(
                "Blinding Lights",
                "The Weeknd"
        );

        service.adicionarMusica(
                "Levitating",
                "Dua Lipa"
        );

        service.adicionarMusica(
                "As It Was",
                "Harry Styles"
        );

        Playlist playlist =
                service.getPlaylist();

        IteratorPlaylist iterator =
                playlist.criarIterator();

        while (iterator.temProximo()) {

            System.out.println(
                    iterator.proximo()
            );
        }
    }
}