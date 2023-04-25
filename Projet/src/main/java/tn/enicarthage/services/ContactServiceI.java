package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.Contact;

public interface ContactServiceI {
List <Contact> getcontact();
Contact addcontact(Contact c);
Contact updatecontact(Contact c,int id);
void deletecontact(int id);
List<Contact> findAllcontact();


}