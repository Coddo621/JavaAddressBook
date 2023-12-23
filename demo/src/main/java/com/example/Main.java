package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String name;
    static String number;
    static String mail;
    static String address;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input the name of the person: ");
        name = input.nextLine();
        System.out.println("Input the number of the person: ");
        number = input.nextLine();
        System.out.println("Input the E - Mail address of the person: ");
        mail = input.nextLine();
        System.out.println("Input the address of the person: ");
        address = input.nextLine();
        
        try{
            File addressbook = new File("addressbook.txt");
            FileWriter writer = new FileWriter(addressbook, true);
            if(addressbook.createNewFile()){
                String data = ("Name: "+name+"\nPhone Number: "+number+"\nE - Mail address: "+mail+"\nAddress: "+address+"\n\n");
                writer.write(data);
            }else{
                String data = ("Name: "+name+"\nPhone Number: "+number+"\nE - Mail address: "+mail+"\nAddress: "+address+"\n\n");
                writer.write(data);
            }

            writer.close();            
        }catch(IOException error){
            System.out.println("Exception IO Error");
            error.printStackTrace();
        }
    }
}