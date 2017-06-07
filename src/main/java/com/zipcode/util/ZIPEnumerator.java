package com.zipcode.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

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
    private boolean listJarFilesAlso;

    public ZIPEnumerator(String directory, boolean listJarFilesAlso){
        this.directory = directory;
    }

    public  boolean filterFile(Path path){
        if (listJarFilesAlso){
           return  path.endsWith(".zip") || path.endsWith(".jar");
        }
       return  path.endsWith("zip");
    }
    public List<Path> getPath() throws IOException {
        if (listJarFilesAlso){
            return  Files.walk(Paths.get(directory))
                    .filter( (path -> ( (path.endsWith(".zip") || (path.endsWith(".jar")) ) )))
                    .collect(Collectors.toList());

        }else{
            return  Files.walk(Paths.get(directory))
                    .filter( path -> ( path.endsWith(".zip")  ))
                    .collect(Collectors.toList());
        }
    }




}
