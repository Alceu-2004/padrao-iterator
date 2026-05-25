package iterator;

import model.Musica;

import java.util.List;

public class PlaylistIterator
        implements IteratorPlaylist {

    private List<Musica> musicas;

    private int posicao;

    public PlaylistIterator(
            List<Musica> musicas
    ) {

        this.musicas = musicas;

        this.posicao = 0;
    }

    @Override
    public boolean temProximo() {

        return posicao < musicas.size();
    }

    @Override
    public Musica proximo() {

        return musicas.get(
                posicao++
        );
    }
}