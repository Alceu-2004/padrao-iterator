package service;

import model.Musica;
import model.Playlist;

public class PlaylistService {

    private Playlist playlist;

    public PlaylistService() {

        playlist = new Playlist();
    }

    public void adicionarMusica(
            String titulo,
            String artista
    ) {

        playlist.adicionarMusica(
                new Musica(
                        titulo,
                        artista
                )
        );
    }

    public Playlist getPlaylist() {
        return playlist;
    }
}