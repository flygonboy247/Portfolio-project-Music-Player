package componets.MusicPlayer;
/**
*    @convention no such thing as a empty MusicPlayer, if empty reamake it.
*    ensure that all data in are strings and that they are not null.
*
*    @corespondence you look at each node holding the data for 1 song. length is
*    how many song are in the musicplayer, back is the start of the music player,
*    also the first song inputted(at least before shuffle). nSong is the last song
*    played as well as the last song inserted(before shuffle). in each Song node,
*    the name is the name of the song, the author is the authors name, and the
*    album is the album's name with next being the next song played until it reaches
*    the end where it will be null because there are no more songs.
*/

public class MusicPlayer1 extends MusicPlayerSecondary{
    /**
     * Song Node.
     */
    private final class Song {
        /**
         * The name of the song.
         */
        private String name;
        /**
         * The author of the song.
         */
        private String author;
        /**
         * The album the song belongs to.
         */
        private String album;
        /**
         * Reference to the next song in the list.
         */
        private Song next;
    }

    /**
     * Front of list.
     */
    private Song back;

    /**
     * End of list.
     */
    private Song nSong;

    /**
     * Size.
     */
    private int length;

    /**
     * Constructor.
     */
    public MusicPlayer1() {

        this.back = null;
        this.nSong = null;
        this.length = 0;
    }

    /*
    * Standard methods -------------------------------------------------------
    */

    @Override
    public int size() {
        return this.length;
    }

    @Override
    public void setSong(String name, String author, String album) {

        Song newSong = new Song();

        newSong.name = name;
        newSong.author = author;
        newSong.album = album;
        newSong.next = null;

        if (this.back == null) {

            this.back = newSong;
            this.nSong = newSong;

        } else {

            this.nSong.next = newSong;
            this.nSong = newSong;
        }

        this.length++;
    }

    @Override
    public void removeSong(int songNum) {

        if (songNum < 0 || songNum >= this.length) {
            throw new IndexOutOfBoundsException();
        }

        if (songNum == 0) {

            this.back = this.back.next;

            if (this.back == null) {
                this.nSong = null;
            }

        } else {

            Song current = this.back;

            for (int i = 0; i < songNum - 1; i++) {
                current = current.next;
            }

            Song removed = current.next;

            current.next = removed.next;

            if (removed == this.nSong) {
                this.nSong = current;
            }
        }

        this.length--;
    }

    @Override
    public int getSongNumFromName(String thing) {

        Song current = this.back;

        int index = 0;

        while (current != null) {

            if (current.name.equals(thing)) {
                return index;
            }

            current = current.next;
            index++;
        }

        return -1;
    }

    @Override
    public int getLastSongNumFromAuthor(String thing) {

        Song current = this.back;

        int index = 0;
        int found = -1;

        while (current != null) {

            if (current.author.equals(thing)) {
                found = index;
            }

            current = current.next;
            index++;
        }

        return found;
    }

    @Override
    public int getLastSongNumFromAlbum(String thing) {

        Song current = this.back;

        int index = 0;
        int found = -1;

        while (current != null) {

            if (current.album.equals(thing)) {
                found = index;
            }

            current = current.next;
            index++;
        }

        return found;
    }

    /**
     * Returns node at position.
     */
    private Song nodeAt(int index) {

        Song current = this.back;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    @Override
    public String getSong(int songNum) {

        Song s = this.nodeAt(songNum);

        return "Song: " + s.name
                + " | Author: " + s.author
                + " | Album: " + s.album;
    }

    @Override
    public String getSongName(int songNum) {
        return this.nodeAt(songNum).name;
    }

    @Override
    public String getSongAuthor(int songNum) {
        return this.nodeAt(songNum).author;
    }

    @Override
    public String getSongAlbum(int songNum) {
        return this.nodeAt(songNum).album;
    }


}