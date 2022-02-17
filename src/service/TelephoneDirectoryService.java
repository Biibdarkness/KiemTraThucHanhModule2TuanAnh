package service;

import model.TelephoneDirectory;
import util.CSVultis;

import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectoryService implements ITelephoneDirectoryService{
    List<TelephoneDirectory> telephoneDirectoryList = new ArrayList<>();
    public static String path = "data/contacts.csv";
    @Override
    public List<TelephoneDirectory> getTelephoneDirectory() {
        List<TelephoneDirectory> newTelephoneDirectory = new ArrayList<>();
        List<String> records = CSVultis.read(path);
        for (String record : records) {
            newTelephoneDirectory.add(new TelephoneDirectory(record));
        }
        return telephoneDirectoryList = newTelephoneDirectory;
    }

    @Override
    public void add(TelephoneDirectory newTelephoneDirectory) {
        telephoneDirectoryList.add(newTelephoneDirectory);
        CSVultis.write(path,telephoneDirectoryList);
    }

    @Override
    public void remove(TelephoneDirectory telephoneDirectoryRemove) {
        telephoneDirectoryList.remove(telephoneDirectoryRemove);
        CSVultis.write(path,telephoneDirectoryList);
    }

    @Override
    public void update() {
        CSVultis.write(path,telephoneDirectoryList);
    }

    @Override
    public TelephoneDirectory getPhone(String phone) {
        for (TelephoneDirectory check : telephoneDirectoryList) {
            if (check.getPhoneNumber().equals(phone))
                return check;
        }
        return null;
    }

    public boolean checkDuplicateName(String name) {
        for (TelephoneDirectory check : telephoneDirectoryList) {
            if (check.getFullName().equals(name))
                return true;
        }
        return false;
    }

    public boolean checkDuplicateEmail(String email) {
        for (TelephoneDirectory phonebook : telephoneDirectoryList) {
            if (phonebook.getEmail().equals(email))
                return true;
        }
        return false;
    }

    public boolean checkDuplicatePhoneNumber(String phoneNumber) {
        for (TelephoneDirectory check : telephoneDirectoryList) {
            if (check.getPhoneNumber().equals(phoneNumber))
                return true;
        }
        return false;
    }

}
