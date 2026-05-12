package componets.MusicPlayer;

import java.util.Arrays;

/**
 * Utility class for managing music player song data.
 */
public final class ProofOfConcept {
    /**
     * Adds a song to the array with name, author, and album.
     *
     * @param array the song array
     * @param name the song name
     * @param author the song author
     * @param album the song album
     * @return the updated array
     */
    public static String[] setSong(String[] array, String name, String author,
            String album) {
        int l = array.length;
        array[l] = name;
        array[l + 1] = author;
        array[l + 2] = album;
        return array;
    }
    /**
     * Removes a song from the array by song number.
     *
     * @param arr the song array
     * @param songNum the song number to remove
     * @return the updated array
     */
    public static String[] removeSong(String[] arr, int songNum) {
        String[] nArray = Arrays.copyOf(arr, arr.length - 3);
        for (int i = 0; i < nArray.length; i++){
            nArray[i] = arr[i];
        }
        for (int i = songNum * 3; i < arr.length - 3; i++) {
            nArray[i] = arr[i + 3];
        }
        return nArray;
    }

    /**
     * Gets the song number by song name.
     *
     * @param array the song array
     * @param thing the song name to search for
     * @return the song number or -1 if not found
     */
    public static int getSongNumFromName(String[] array, String thing) {
        int num=-1;
        for (int i = 0; i < array.length / 3; i++){
            String name = array[i * 3];
            if (name.equals(thing)) {
                num = i * 3;
            }
        }
        return num;
    }
    /**
     * Gets the last song number by author name.
     *
     * @param array the song array
     * @param thing the author name to search for
     * @return the song number or -1 if not found
     */
    public static int getLastSongNumFromAuthor(String[] array, String thing) {
        int num = -1;
        for (int i = 0; i < array.length / 3; i++){
            String name=array[i * 3 + 1];
            if (name.equals(thing)) {
                num = i * 3 + 1;
            }
        }
        return num;
    }
    /**
     * Gets the full song data.
     *
     * @param array the song array
     * @param songNum the song number
     * @return the song data as a string
     */
    public static String getSong(String[] array, int songNum) {
        songNum = songNum - 1;
        String songdata = "Song name: " + array[songNum*3] + " Song author: " +
        array[songNum*3+1] + " Song album: "+array[songNum*3+2];
        return songdata;
    }
    /**
     * Gets the song name.
     *
     * @param array the song array
     * @param songNum the song number
     * @return the song name
     */
    public static String getSongName(String[] array, int songNum) {
        songNum=songNum-1;
        String songname = array[songNum*3];
        return songname;
    }
    /**
     * Gets the song author.
     *
     * @param array the song array
     * @param songNum the song number
     * @return the song author
     */
    public static String getSongAuthor(String[] array, int songNum) {
        songNum=songNum-1;
        String songname = array[songNum*3+1];
        return songname;
    }
    /**
     * runs main.
     */
    public static void main(String[] args){
        String[] array = new String[0];
        array = setSong(array, "name", "someone", "somealbum");
        array = setSong(array, "name2", "someone2", "somealbum2");
        array = setSong(array, "name3", "someone3", "somealbum3");
        int sNumfName = getSongNumFromName(array, "name2");
        int sNumfAuthor = getLastSongNumFromAuthor(array, "someone3");
        String data = getSong(array, 1);
        String name = getSongName(array, 3);
        String author = getSongAuthor(array, 2);
        //I'm just using System.out.println I'm not using simplewriter
        System.out.println(sNumfName);
        System.out.println(sNumfAuthor);
        System.out.println(data);
        System.out.println(name);
        System.out.println(author);
    }
}
