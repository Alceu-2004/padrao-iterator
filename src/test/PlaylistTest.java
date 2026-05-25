import model.Musica;
import model.Playlist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlaylistTest {

    @Test
    public void deveAdicionarMusica() {

        Playlist playlist =
                new Playlist();

        playlist.adicionarMusica(
                new Musica(
                        "Levitating",
                        "Dua Lipa"
                )
        );

        Assertions.assertEquals(
                1,
                playlist.getMusicas().size()
        );
    }
}