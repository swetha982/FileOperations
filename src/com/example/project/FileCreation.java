package com.example.project;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
public class FileCreation {

    private String fileName;
    public FileCreation(String fileName){
        this.fileName = fileName;
    }
    public FileCreation(){

    }
    public String getFileName(){
        return fileName;
    }
    public void addFile(){
        File obj = new File(getFileName());
        try{
            if(obj.createNewFile()){
                System.out.println("File created: "
                        + obj.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        }catch(IOException e){
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
    public void deleteFile(){
        File obj = new File(getFileName());

        if(obj.delete()){
            System.out.println("File deleted: "
                    + obj.getName());
        }
        else{
            System.out.println("File Not exists");
        }


    }
    public void searchFile(String fileName){

        String files[] = sortedArray();
        if (files.length>0){
            int index=Arrays.binarySearch(files, fileName);
            System.out.println("Index:"+index);
            if(index>=0){
                System.out.println("File Found:"+files[index]);
            }
            else
                System.out.println("File Not Found");

        }
    }

    private String[] sortedArray(){
        String currentDirectory = System.getProperty("user.dir");
        //System.out.println("PWD:"+currentDirectory);
        File obj = new File(currentDirectory);
        String files[] = obj.list();

        if(files.length<=0)
            System.out.println("Empty Directory");

        else
            Arrays.sort(files);
        return files;

    }

    public void fileList(){
        String files[] = sortedArray();
        if (files.length>0){
            System.out.println("Files are:");
            for(int i=0;i<files.length;i++){
                System.out.println(files[i]);

            }
        }


    }

}
