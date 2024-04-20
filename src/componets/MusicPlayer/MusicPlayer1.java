package componets.MusicPlayer;

import components.standard;
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
     * Representation of {@code this}.
     */
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
     * Standard methods -------------------------------------------------------
     */

     @Override
     public final NaturalNumber newInstance() {
         try {
             return this.getClass().getConstructor().newInstance();
         } catch (ReflectiveOperationException e) {
             throw new AssertionError(
                     "Cannot construct object of type " + this.getClass());
         }
     }

     @Override
     public final void clear() {
         this.createNewRep();
     }

     @Override
     public final void transferFrom(MusicPlayer source) {
         assert source != null : "Violation of: source is not null";
         assert source != this : "Violation of: source is not this";
         assert source instanceof NaturalNumber3 : ""
                 + "Violation of: source is of dynamic type NaturalNumberExample";
         /*
          * This cast cannot fail since the assert above would have stopped
          * execution in that case.
          */
         MusicPlayer1 localSource = (MusicPlayer1) source;
         this.nSong = localSource.nSong;
         this.back=localSource.back;
         this.length=localSource.length;
         this.Song=localSource.Song;
         localSource.createNewRep();
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
     * idk why param is blue
     * @param name is th name of the song
     * @param author is th name of the author
     * @param album is th name of the album
     * @ensures songs in list are properly catagorized
     * @requires name, author, and album != null
     * @updates this
     *
     */
    public final void setSong(String name, String author, String album){
        Song newSong = new Song();
        Song old = this.nSong;
        newSong.name = name;
        newSong.author = author;
        newSong.album = album;
        newSong.next = null;
        old.next = newSong;
        this.nSong = newSong;
        this.length++;
    }
    /**
     *idk why param is blue
     * @param songnum position of song in created list
     * @requires songnum<this.length
     * @updates this
     */
    public final void removeSong(int songNum){
        Song back = this.back;
        Song removed;
        Song front;
        if(songNum==1){
            this.back=null;
            this.nsong=null;
        }else{
            for(int i =1 ;i<songNum;i++){
                back = back.next;
            }
        }
        Song removed = back.next;
        if(removed.next!=null){
            Song front = removed.next;
            back.next = front;
        }else{
            back.next = null;
        }
        this.length--;
    }
    /**
     * idk why param is blue
     * @param thing is the name of the song
     * @ensures song name of this Song is the same as thing
     * @requires thing != null
     * @returns song num
     */
    public final int getSongNumFromName(String thing){
        int num=-1;
        Song check = this.back;
        for(int i =1 ;i<=this.length;i++){
            if(check.name.equals(thing)){
                num=i;
            }
            check=check.next;
        }
        return num;
    }
    /**
     * idk why param is blue
     * @param thing is the name of the song author
     * @ensures author name of this Song is the same as thing
     * @requires thing != null
     * @returns song num of the last song entered from the author
     */
    public final int getLastSongNumFromAuthor(String thing){
        int num=-1;
        Song check = this.back;
        for(int i =1 ;i<=this.length;i++){
            if(check.author.equals(thing)){
                num=i;
            }
            check=check.next;
        }
        return num;
    }
    /**
     * idk why param is blue
     * @param thing is the name of the song's album
     * @ensures album name of this Song is the same as thing
     * @requires thing != null
     * @returns song num of the last song entered from the album
     */
    public final int getLastSongNumFromalbum(String thing){
        int num=-1;
        Song check = this.back;
        for(int i =1 ;i<=this.length;i++){
            if(check.album.equals(thing)){
                num=i;
            }
            check=check.next;
        }
        return num;
    }
    /**
     * idk why param is blue
     * @param songNum is the # order where the song data is stored
     * @requires songnum<this.length
     * @returns song name author and album all at once
     */
    public final String getSong(int songNum){
        Song check = this.back;
        for(int i =1 ;i<=songNum;i++){
            check=check.next;
        }
        String songdata = "Song name: " + check.name + " Song author: " +
        check.author + " Song album: "+check.album;
        return songdata;
    }
    /**
     * idk why param is blue
     * @param songNum is the # order where the song data is stored
     * @requires songnum<this.length
     * @returns song name at songnum
     */
    public final String getSongName(int songNum){
        Song check = this.back;
        for(int i =1 ;i<=songNum;i++){
            check=check.next;
        }
        String songname = check.name;
        return songname;
    }
    /**
     * idk why param is blue
     * @param songNum is the # order where the song data is stored
     * @requires songnum<this.length
     * @returns song author at songnum
     */
    public final String getSongAuthor(int songNum){
        Song check = this.back;
        for(int i =1 ;i<=songNum;i++){
            check=check.next;
        }
        String songauthor = check.author;
        return songauthor;
    }
    /**
     * idk why param is blue
     * @param songNum is the # order where the song data is stored
     * @requires songnum<this.length
     * @returns song album at songnum
     */
    public final String getSongAlbum(int songNum){
        Song check = this.back;
        for(int i =1 ;i<=songNum;i++){
            check=check.next;
        }
        String songalbum = check.album;
        return songalbum;
    }
}