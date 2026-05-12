package componets.MusicPlayer;

import java.util.Random;

/**
 * Secondary methods.
 */
public abstract class MusicPlayerSecondary implements MusicPlayer {

    /**
     * @param author is th name of the author
     * @param album is th name of the album
     * @ensures songs in list are properly catagorized
     * @requires name, author, and album != null
     * @updates this
     */
    @Override
    public void shuffle() {

        Random rand = new Random();

        int size = this.size();

        for (int i = 0; i < size * 5; i++) {

            int k = rand.nextInt(size);

            String name = this.getSongName(k);
            String author = this.getSongAuthor(k);
            String album = this.getSongAlbum(k);

            this.removeSong(k);
            this.setSong(name, author, album);
        }
    }

    /**
     * Checks if 2 Songs are equal.
     *
     * @param check the Song list to check
     * @return if the 2 stutions are equal or not
     * @ensures this = check
     */
    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof MusicPlayer)) {
            return false;
        }

        MusicPlayer check = (MusicPlayer) obj;

        if (this.size() != check.size()) {
            return false;
        }

        for (int i = 0; i < this.size(); i++) {

            if (!this.getSong(i).equals(check.getSong(i))) {
                return false;
            }
        }

        return true;
    }

    /**
     * prints out a string for this.
     *
     * @return string of data in this
     * @ensures str = data in this
     */
    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < this.size(); i++) {
            str.append(this.getSong(i)).append("\n");
        }

        return str.toString();
    }
}
