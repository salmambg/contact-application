package org.example.service;

import org.example.entity.ContactInfo;
import org.example.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public List<ContactInfo> getAllContacts() {
        return contactRepository.findAll();
    }

    public List<ContactInfo> findByFirstName(String firstName) {
        return contactRepository.findContactInfoByfirstName(firstName);
    }

    public List<ContactInfo> findByLastName(String lastName) {
        return contactRepository.findContactInfoBylastName(lastName);
    }

    public void addContact(ContactInfo contact) {
        ContactInfo contactInfo = ContactInfo.build(0, contact.getFirstName(), contact.getLastName(),contact.getPhoneNumber());
        contactRepository.save(contactInfo);
    }
    public void updateContact(@PathVariable long id , ContactInfo contact) {
        contactRepository.save(contact);
    }
    public void deleteContactId(Long contactId) {
        contactRepository.deleteById(contactId);
    }
}
