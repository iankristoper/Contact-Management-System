package com.ian.contact_management_system;

/**
 *
 * @author Ian Tagano
 */



/*

And also this class is for manipulating the contact information or this is where the contact information stored 
this is where the functionality is hidden



*/



public class AddressBook 
{
    private Contact[] contacts;     //array of contacts
    private int size;               //size to keep track of contact size
    
    
    //constructor for address book
    public AddressBook(int capacity)
    {
        contacts = new Contact[capacity];
        int size = 0;
        
    }
    
    
    //method to add contacts
    public void addContact(Contact contact)
    {
        if(size < contacts.length)
        {
            contacts[size++] = contact;
            System.out.println("Contact added successfully.");
        } 
        else 
        {
            System.out.println("Address book is full. Cannot add more contacts.");
        }
    }
    
    
    //method to delete contact 
    public void deleteContact(String name)
    {
        for(int i = 0; i < size; i++)
        {
            if (contacts[i].getName().equals(name))
            {
                for(int j = i; j < size - 1; j++)
                {
                    contacts[j] = contacts[j + 1];
                }
                
                contacts[size - 1] = null;
                size--;
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
        
        System.out.println("Contact not found.");
    }
    
    
    //method to view all contacts
    public void displayAllContacts()
    {
        System.out.println("All contacts...");
        for(int i = 0; i < size; i++ )
        {
            contacts[i].displayContactDetails();
            System.out.println();
        }
    }
    
}
