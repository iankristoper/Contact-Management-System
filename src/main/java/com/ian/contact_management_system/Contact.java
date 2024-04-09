package com.ian.contact_management_system;

/**
 *
 * @author Ian Tagano
 */




/*

This class is for the contact information, note that when making a system it is much better to seperate the information
to the main class to make it more private and promote encapsulation

*/




public class Contact 
{
    //private instanace variable for the contact
    private String name;
    private String email;
    private String phoneNumber;
    
    
    //constructor for contact 
    public Contact(String name, String email, String phoneNumber)
    {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    
    //getters for accessing the data from the contact
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    
    //display the contact information
    public void displayContactDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
