package com.eomcs.mylist.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.support.TransactionTemplate;
import com.eomcs.mylist.dao.ContactDao;
import com.eomcs.mylist.domain.Contact;
import com.eomcs.mylist.domain.ContactTel;

//@Service
public class TransactionTemplateContactService {

  @Autowired
  ContactDao contactDao;

  @Autowired
  TransactionTemplate transactionTemplate;

  public int add(Contact contact) {
    return transactionTemplate.execute(status -> {
      contactDao.insert(contact);
      for (ContactTel tel : contact.getTels()) {
        tel.setContactNo(contact.getNo());
        contactDao.insertTel(tel);
      }
      return 1;
    });
  }

  public List<Contact> list() {
    List<Contact> contactList = contactDao.findAll();
    for (Contact contact : contactList) {
      contact.setTels(contactDao.findTelByContactNo(contact.getNo()));
    }
    return contactList;
  }

  public Contact get(int no) {
    Contact contact = contactDao.findByNo(no);
    if (contact != null) {
      contact.setTels(contactDao.findTelByContactNo(no));
    }
    return contact;
  }

  public int update(Contact contact) {

    return transactionTemplate.execute(status -> {
      int count = contactDao.update(contact);
      if (count > 0 ) {
        contactDao.deleteTelByContactNo(contact.getNo());
        for (ContactTel tel : contact.getTels()) {
          contactDao.insertTel(tel);
        }
      }
      return count;
    });
  }

  public int delete(int no) {
    return transactionTemplate.execute(status -> {
      contactDao.deleteTelByContactNo(no);
      return contactDao.delete(no);
    });
  }
}
