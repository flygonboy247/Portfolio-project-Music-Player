package componets.MusicPlayer;

/**
 * Interface for the Music Player kernel.
 */
public interface MusicPlayerKernel {
    /**
     * Returns size.
     */
    int size();

    /**
     * Adds a song
     */
    void setSong(String name, String author, String album);

    /**
     * Removes song at position songNum
     */
    void removeSong(int songNum);

    /**
     * Returns index of song name or -1.
     */
    int getSongNumFromName(String thing);

    /**
     * Returns last song index by author or -1.
     */
    int getLastSongNumFromAuthor(String thing);

    /**
     * Returns last song index by album or -1.
     */
    int getLastSongNumFromAlbum(String thing);

    /**
     * Returns full song info.
     */
    String getSong(int songNum);

    /**
     * Returns song name.
     */
    String getSongName(int songNum);

    /**
     * Returns song author.
     */
    String getSongAuthor(int songNum);

    /**
     * Returns song album.
     */
    String getSongAlbum(int songNum);

}