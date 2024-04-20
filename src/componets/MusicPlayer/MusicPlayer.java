package componets.MusicPlayer;

public interface MusicPlayer extends MusicPlayerKernal {
   /**
     * @param name is th name of the song
     * @param author is th name of the author
     * @param album is th name of the album
     * @ensures songs in list are properly catagorized
     * @requires name, author, and album != null
     * @updates this
     */
    public void shuffle(){

    }
    /**
     * Reports size/legth of music list.
     *
     * @return the length of {@code this}
     * @ensures length = |this|
     */
    @Override
    public int size(){
    }
    /**
     * Checks if 2 Songs are equal.
     *
     * @param check the Song list to check
     * @return if the 2 stutions are equal or not
     * @ensures this = check
     */
    @Override
    public Boolean equals(MusicPlayer check) {
    }
    /**
     * prints out a string for this.
     *
     * @return string of data in this
     * @ensures str = data in this
     */
    @Override
    public String toString() {

    }
}