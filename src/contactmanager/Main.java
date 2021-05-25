/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanager;

import java.util.Scanner;


public class Main {
        public static void main(String [] args){
      
        ContactsManager MyContactsManager = new ContactsManager();
        String name, phoneNumber,email;
      
        
        name = "Amanda";
        phoneNumber = "+6288-878-9790";
        email = "amanda@gmail.com";
        Contact contact1 = new Contact(name ,email, phoneNumber);
        MyContactsManager.addContact(contact1);

        name = "Andi";
        phoneNumber = "+6288-999-1234";
        email = "andi@gmail.com";
        Contact contact2 = new Contact(name ,email, phoneNumber);
        MyContactsManager.addContact(contact2);
        
        name = "Budi";
        phoneNumber = "0333-444-1111";
        email = "budi@gmail.com";
        Contact contact3 = new Contact(name ,email, phoneNumber);
        MyContactsManager.addContact(contact3);
        
        name = "Caca";
        phoneNumber = "0222-831-3123";
        email = "caca@gmail.com";
        Contact contact4 = new Contact(name ,email, phoneNumber);
        MyContactsManager.addContact(contact4);
        
        name = "Dedi";
        phoneNumber = "0238-128-9540";
        email = "dedi@gmail.com";
        Contact contact5 = new Contact(name ,email, phoneNumber);
        MyContactsManager.addContact(contact5);
       
        do{
        
        Scanner input = new Scanner(System.in);
        System.out.print("Cari Nama Kontak   = ");
        name = input.nextLine();
        name = name.toLowerCase();
        
        Contact result = MyContactsManager.searchContact(name);
        if(result != null){
        System.out.println("Sedang Mencari tunggu sebentar" + "\n");
        System.out.println("Nama    :" + result.getName());
        System.out.println("Nomor   :" + result.getPhoneNumber());
        System.out.println("Email   :" + result.getEmail() + "\n");
        }
        else{
            System.out.println("\n"  + "Kontak tidak ditemukan" + "\n");
        }
        
        char yn;
        System.out.print("Again?(y/n) : ");
        yn = input.next().charAt(0);
        if(yn == 'y' || yn == 'Y'){
            
        }
        else{
            System.exit(0);
        }
        }while(true);
    }
}
