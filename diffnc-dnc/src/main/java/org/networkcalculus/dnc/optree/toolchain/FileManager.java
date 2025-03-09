package org.networkcalculus.dnc.optree.toolchain;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Lukas Herll
 *
 * Manages all interactions with files for DNC analyses involving binary operator trees.
 * Uses a singleton pattern to avoid two instances writing to the same file simultaneously.
 */
public class FileManager {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static FileManager instance = null;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private FileManager(){
    }

    public static FileManager getInstance(){
        if(instance == null){
            instance = new FileManager();
        }
        return instance;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Creates a new file at the given path and writes the provided content to the file.
     * Note: it is the user's responsibility to check whether a file at the given path already exists
     * @param path
     *                  the path at which the file should be created
     * @param content
     *                  the content of the file
     * @return  the created file
     */
    public File createFile(String path, String content){
        //the file name must not already be taken
        if(fileExists(path)){
            assert !fileExists(path);
            return null;
        }

        File file = new File(path);
        //create the file
        try{
            file.createNewFile();
        }
        catch (IOException e){
            System.out.println("An error occurred while creating a file at " + path);
            e.printStackTrace();
        }

        //write to the file
        try{
            FileOutputStream fos = new FileOutputStream(path, true);
            fos.write(content.getBytes());
            fos.close();
        }catch (Exception e){
            System.out.println("An error occurred while writing to a file at " + path);
            e.printStackTrace();
        }

        return file;
    }


    /**
     * Creates a new file at the given path and writes the provided content to the file. Checks for name collisions regarding
     * the provided file name and changes the file name if necessary.
     * @param path
     *                  the path at which the file should be created
     * @param content
     *                  the content of the file
     * @return  the created file
     */
    public File safeCreateFile(String path, String content){

        String originalPath = path;
        while(fileExists(path)){
            path = modifyPath(path);
        }
        if(!path.equals(originalPath)){
            System.out.println("A file with the given name already exists at the provided path. The name was changed to " +
                    path);
        }
        return createFile(path, content);
    }


    /**
     * Checks whether a given file exists.
     * @param path
     *              the file path (name inclusive)
     * @return  true iff the file exists
     */
    public boolean fileExists(String path){
        File file = new File(path);
        return file.exists();
    }


    /**
     * Appends a _1 to the end of the path before the file type.
     * @param path
     *              the provided file path (needs to end in a file extension)
     * @return  the file path, where the file name was appended by a "(1)"
     */
    public String modifyPath(String path){
        String[] separatedPath = path.split("\\.");
        separatedPath[separatedPath.length - 2] += "_1";
        return String.join(".", separatedPath);
    }


    /**
     * Appends text to an already existing file
     * @param path
     *                  the path of the existing file
     * @param content
     *                  the content to be appended to the file
     * @return  false iff the file does not exist
     */
    public boolean appendToFile(String path, String content){
        //if the file does not exist, return false
        if(!fileExists(path)){
            return false;
        }

        //write to the file
        try{
            FileOutputStream fos = new FileOutputStream(path, true);
            fos.write(content.getBytes());
            fos.close();
        }catch (Exception e){
            System.out.println("An error occurred while writing to a file");
            e.printStackTrace();
        }
        return true;
    }


    /**
     * Deletes the file at the given path.
     * @param path
     *              the path of the file to be deleted
     * @return  true iff the file was deleted successfully
     */
    public boolean deleteFile(String path){
        if(!fileExists(path)){
            return false;
        }
        File file = new File(path);
        return file.delete();
    }


}
