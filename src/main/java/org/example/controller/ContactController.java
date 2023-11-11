package org.example.controller;

import org.example.entity.ContactInfo;
import org.example.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    ContactService contactService;

    @GetMapping
    public List<ContactInfo> getAllContacts() {
        return contactService.getAllContacts();
    }

    @GetMapping("/byFirstName/{firstName}")
    public List<ContactInfo> getContactByFirstName(@PathVariable String firstName) {
        return contactService.findByFirstName(firstName);
    }

    @GetMapping("/byLastName/{lastName}")
    public List<ContactInfo> getContactByLastName(@PathVariable String lastName) {
        return contactService.findByLastName(lastName);
    }
    @PostMapping("/savingContacts")
    public String addContact(@RequestBody ContactInfo contactInfo) {
        contactService.addContact(contactInfo);
        return "Save Contact Successfully";
    }
    @PutMapping("/{id}")
    public String editContact (@RequestBody ContactInfo contactInfo, @PathVariable long id) {
        contactService.updateContact(id, contactInfo);
        return "Edit saved";
    }
    @DeleteMapping("/{id}")
    public void deleteContact (@PathVariable long id) {
        contactService.deleteContactId(id);
    }
}
