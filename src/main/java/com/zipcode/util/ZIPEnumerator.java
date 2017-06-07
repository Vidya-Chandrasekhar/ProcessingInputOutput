package com.zipcode.util;

/**Write a ZIPEnumerator utility that searches a directory (specified in the constructor)
 and all subdirectories for zip files.
 Provide a function that returns a list Path objects to all zip files found
 ZIPEnumerator should have a constructor flag that sets whether it also lists jar files.
 provide another function that lists only the names of all of the files found
 Add a method to the ZipEnumerator to add a file to a selected ZIP archive.
 * Created by vidyachandasekhar on 6/6/17.
 */
public class ZIPEnumerator {

    private String directory;

    public ZIPEnumerator(String directory){
        this.directory = directory;
    }


}
