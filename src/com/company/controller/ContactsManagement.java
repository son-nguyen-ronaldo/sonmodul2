package com.company.controller;

import com.company.model.Contact;

import java.util.ArrayList;
import java.util.List;

import static com.company.view.MenuContact.scanner;


public class ContactsManagement {
    private final List<Contact> contactList = new ArrayList<>();

    public List<Contact> getContactList() {
        return contactList;
    }

    public List<Contact> getProductList() {
        return contactList;
    }

    public void showAll() {
        if (contactList.isEmpty()) {
            System.out.println("Không có thông tin nào hết");
        }
        int count = 0;
        for (Contact contact : contactList) {
            System.out.println(contact);
            count++;
            if (count == 5) {
                count = 0;
                System.out.println("Nhấn phím Enter để tiếp tục");
                scanner.nextLine();
            }
        }
    }

    public void addNew(Contact contact) {
        contactList.add(contact);
    }

    public void updateByNumberPhone(String numberPhone, Contact contact) {
        int index = findByNumberPhone(numberPhone);
        contactList.set(index, contact);
    }


    public void removeByNumberPhone(String numberPhone) {
        int index = findByNumberPhone(numberPhone);
        contactList.remove(index);
    }

    public int findByName(String name) {
        int index = -1;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int findByNumberPhone(String phoneNumber) {
        int index = -1;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getNumberPhone().equals(phoneNumber)) {
                index = i;
                break;
            }
        }
        return index;
    }
}