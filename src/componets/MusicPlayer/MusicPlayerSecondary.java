package componets.MusicPlayer;

public interface MusicPlayerSecondary extends MusicPlayer {

   /**
     * idk why param is blue
     * @param author is th name of the author
     * @param album is th name of the album
     * @ensures songs in list are properly catagorized
     * @requires name, author, and album != null
     * @updates this
     */
    public void shuffle(){
        int size=this.getSize;
        for(i=1;i<size*40;i++){
            int k=i%size;
            if(i%(size/6)==0){
                setsong(getSongName(k),getSongAuthor(k),getSongAlbum(k));
                removeSong(k);
            }
        }
    }
    /**
     * Reports size/legth of music list.
     *
     * @return the length of {@code this}
     * @ensures length = |this|
     */
    @Override
    public int size(){
        return this.getSize();
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
		Boolean equal =true;
	    if(getSize()==check.getSize()){
            for(int i=0;i<getSize();i++){
                if(this.getsong(i).hashcode()!=check.getsong(i).hashcode()){
                    equal=false;
                }
            }
        }else{
            equal = false;
        }
	    return equal;
    }
    /**
     * prints out a string for this.
     *
     * @return string of data in this
     * @ensures str = data in this
     */
    @Override
    public String toString() {
		String str="";
	    for(int i=0;i<getSize();i++){
            str=str+this.getsong(i)+"\n"
        }
	    return str;
    }
}