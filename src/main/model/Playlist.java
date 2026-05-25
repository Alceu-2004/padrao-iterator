package model;

import iterator.IteratorPlaylist;
import iterator.PlaylistIterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Musica> musicas;

    public Playlist() {

        musicas = new ArrayList<>();
    }

    public void adicionarMusica(
            Musica musica
    ) {

        musicas.add(musica);
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public IteratorPlaylist criarIterator() {

        return new PlaylistIterator(
                musicas
        );
    }
}