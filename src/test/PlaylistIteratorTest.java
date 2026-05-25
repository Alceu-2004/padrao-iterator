import iterator.IteratorPlaylist;
import model.Musica;
import model.Playlist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlaylistIteratorTest {

    @Test
    public void devePercorrerPlaylist() {

        Playlist playlist =
                new Playlist();

        playlist.adicionarMusica(
                new Musica(
                        "Music 1",
                        "Artist 1"
                )
        );

        playlist.adicionarMusica(
                new Musica(
                        "Music 2",
                        "Artist 2"
                )
        );

        IteratorPlaylist iterator =
                playlist.criarIterator();

        Assertions.assertTrue(
                iterator.temProximo()
        );

        iterator.proximo();

        Assertions.assertTrue(
                iterator.temProximo()
        );
    }
}