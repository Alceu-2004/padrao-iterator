import model.Musica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MusicaTest {

    @Test
    public void deveCriarMusica() {

        Musica musica =
                new Musica(
                        "Blinding Lights",
                        "The Weeknd"
                );

        Assertions.assertEquals(
                "Blinding Lights",
                musica.getTitulo()
        );
    }
}