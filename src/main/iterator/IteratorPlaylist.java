package iterator;

import model.Musica;

public interface IteratorPlaylist {

    boolean temProximo();

    Musica proximo();
}