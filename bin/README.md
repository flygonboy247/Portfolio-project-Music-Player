# SRC Folder

This README exists, so the folder shows up in source control like git. This
file is not needed and can be safely deleted.

However, for completeness, this folder exists for the purpose of storing your
source code. As a reminder, by discipline, this folder must contain at least
four Java files:

1. The Kernel Interface (e.g., `NaturalNumberKernel`)
2. The Enhance Interface (e.g., `NaturalNumber`)
3. The Secondary Abstract Class (e.g., `NaturalNumberSecondary`)
4. A Kernel Implementation (e.g., `NaturalNumber1L`)

Ideally, you will want to package your component appropriately as well.
That means not just dumping your source code in the `src` folder but actually
creating nested folders for grouping similar components. For example, the
`NaturalNumber` API can be found in the `src/components/naturalnumber` package.
In other words, you would need to nest a `components` folder in the `src`
folder. Then, nest the `naturalnumber` folder in the `components` folder.
The result would be the following directory structure:

```
src
└───components
    └───naturalnumber
            NaturalNumber.java
            NaturalNumber1L.java
            NaturalNumberKernel.java
            NaturalNumberSecondary.java
```

If done correctly, your portfolio can be bundled as its own `.jar`.

 String[] array;
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
        public static String[] setSong(String[] array, String name, String author, String album){
        int l = array.length;
        array[l] = name;
        array[l + 1] = author;
        array[l + 2] = album;
        return array;
    }
    public static String[] removeSong(String[] arr, int songNum){
        String[] narray = [];
        narray[0] = arr[songNum - 1];
        narray[1] = arr[songNum];
        narray[2] = arr[songNum + 1];
        return narray;
    }
    public static int getSongNumFromName(String[] array, String thing){
        int num=-1;
        for (int i = 0; i < array.length / 3; i++){
            String name = array[i * 3];
            if (name.equals(thing)){
                num = i * 3;
            }
        }
        return num;
    }
    public static int getLastSongNumFromAuthor(String[] array, String thing){
        int num = -1;
        for (int i = 0; i < array.length / 3; i++){
            String name=array[i * 3 + 1];
            if (name.equals(thing)){
                num = i * 3 + 1;
            }
        }
        return num;
    }
    public static String getSong(String[] array, int songNum){
        songNum = songNum - 1;
        String songdata = "Song name: " + array[songNum*3] + " Song author: " +
        array[songNum*3+1] + " Song album: "+array[songNum*3+2];
        return songdata;
    }
    public static String getSongName(String[] array, int songNum){
        songNum=songNum-1;
        String songname = array[songNum*3];
        return songname;
    }
    public static String getSongAuthor(String[] array, int songNum){
        songNum=songNum-1;
        String songname = array[songNum*3+1];
        return songname;
    }