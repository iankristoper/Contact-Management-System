package com.ian.contact_management_system;

import java.util.Scanner;


public class Contact_Management_System 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressbook = new AddressBook(5);
        
        boolean running = true;
        int choice;
        
        do
        {
            System.out.println("Enter your choices...");
            System.out.println("1. Add contact number");
            System.out.println("2. Delete contact number");
            System.out.println("3. View contact number");
            System.out.println("4. Exit contact number");
            
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice)
            {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    
                    addressbook.addContact(new Contact(name, email, phoneNumber));         
                    break;
                    
                case 2:
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine();
                    
                    addressbook.deleteContact(deleteName);
                    break;
                    
                case 3:
                    addressbook.displayAllContacts();
                    break;
                    
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice");
                      
            }     
            
        } while(choice != 4);
        
        
        // Close scanner
        scanner.close();
    }
}
