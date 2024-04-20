package componets.MusicPlayer;

import components.standard;

public class MusicPlayerKernal extends Standard<MusicPlayer>{//idk what exactly to put up here

    private final class Song {
        /**
         * name of song.
         */
        private String name;
        /**
         * name of author.
         */
        private String author;
        /**
         * name of album.
         */
        private String album;
        /**
         * Next Song in singly linked list, or null.
         */
        private Song next;
    }
    /**
     * newest created Song.
     */
    private Song nSong;
    /**
     * oldest created Song.
     */
    private Song back;

    /**
     * Number of Songs in the music list, i.e., length = |this|.
     */
    private int length;


    private void createNewRep() {
		this.nSong = new Song();
        this.nSong.next = null;
        this.back = nSong;
        this.length = 0;
    }
    /*
     * Constructors -----------------------------------------------------------
     */
    // no argument constructor
    public MusicPlayer() {
        this.createNewRep();
    }
    /*
     * Kernel methods ---------------------------------------------------------
     */
    /**
     * @param name is the name of the song
     * @param author is the name of the author
     * @param album is the name of the album
     * @ensures songs in list are properly catagorized
     * @requires name, author, and album != null
     * @updates this
     *
     */
    public final void setSong(String name, String author, String album){

    }
    /**
     * @param songnum position of song in created list
     * @requires songnum<this.length
     * @updates this
     */
    public final void removeSong(int songNum){

    }
    /**
     * @param thing is the name of the song
     * @ensures song name of this Song is the same as thing
     * @requires thing != null
     * @returns song num
     */
    public final int getSongNumFromName(String thing){

    }
    /**
     * @param thing is the name of the song author
     * @ensures author name of this Song is the same as thing
     * @requires thing != null
     * @returns song num of the last song entered from the author
     */
    public final int getLastSongNumFromAuthor(String thing){

    }
    /**
     * @param thing is the name of the song's album
     * @ensures album name of this Song is the same as thing
     * @requires thing != null
     * @returns song num of the last song entered from the album
     */
    public final int getLastSongNumFromalbum(String thing){

    }
    /**
     * @param songNum is the # order where the song data is stored
     * @requires songnum<this.length
     * @returns song name author and album all at once
     */
    public final String getSong(int songNum){

    }
    /**
     * @param songNum is the # order where the song data is stored
     * @requires songnum<this.length
     * @returns song name at songnum
     */
    public final String getSongName(int songNum){

    }
    /**
     * @param songNum is the # order where the song data is stored
     * @requires songnum<this.length
     * @returns song author at songnum
     */
    public final String getSongAuthor(int songNum){

    }
    /**
     * @param songNum is the # order where the song data is stored
     * @requires songnum<this.length
     * @returns song album at songnum
     */
    public final String getSongAlbum(int songNum){

    }
}