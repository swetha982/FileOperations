package com.example.project;

import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args){
        System.out.println("..............Welcome..............");
        System.out.println("Company Name : Company Lockers Pvt. Ltd.");
        System.out.println("Developer : Sai Swetha Chinigepalli");

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("Options:"+"\n"+"1.Get All the files\n2.File Operations\n3.Close");
            System.out.println("Please enter an option:");
            int option = sc.nextInt();
            System.out.println("Option:"+option);

            if(option==1){
                System.out.println("Getting all the files");
                FileCreation fc = new FileCreation();
                fc.fileList();
            }
            else if(option==2){
                System.out.println("Business Operations");
                while(true){
                    System.out.println("1. Add\n2. Delete\n3. Search\n4. Go to Main Menu");
                    System.out.println("Please enter an option:");
                    int input = sc.nextInt();

                    if(input == 1)
                    {
                        System.out.println("Adding File--- Enter File name");
                        String filename = sc.next();
                        FileCreation fc = new FileCreation(filename);

                        fc.addFile();
                    }
                    else if(input==2){
                        System.out.println("Deleting file----Enter file name");
                        String filename = sc.next();
                        System.out.println("FileName:"+filename);
                        FileCreation fc = new FileCreation(filename);
                        fc.deleteFile();
                    }
                    else if(input==3){
                        System.out.println("Search--Enter file name");
                        String filename = sc.next();
                        System.out.println("FileName:"+filename);
                        FileCreation fc = new FileCreation();
                        fc.searchFile(filename);

                    }
                    else if(input == 4) {
                        System.out.println("Going back to main menu");
                        break;
                    }
                    else
                        System.out.println("Wrong Choice..Please choose again");

                }
            }
            else if(option == 3) {
                System.out.println("Exit from Main Menu");
                break;
            }
            else
                System.out.println("Wrong Choice..Please choose again");

        }


    }

}
