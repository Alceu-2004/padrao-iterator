import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.PlaylistService;

public class PlaylistServiceTest {

    private PlaylistService service;

    @BeforeEach
    public void configurar() {

        service = new PlaylistService();
    }

    @Test
    public void deveAdicionarMusicas() {

        service.adicionarMusica(
                "Music",
                "Artist"
        );

        Assertions.assertEquals(
                1,
                service.getPlaylist()
                        .getMusicas()
                        .size()
        );
    }
}