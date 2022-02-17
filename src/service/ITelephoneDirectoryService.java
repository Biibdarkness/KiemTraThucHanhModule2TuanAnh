package service;

import model.TelephoneDirectory;

import java.util.List;

public interface ITelephoneDirectoryService {

    List<TelephoneDirectory> getTelephoneDirectory();

    void add(TelephoneDirectory newTelephoneDirectory);

    void remove(TelephoneDirectory telephoneDirectory);

    void update();

    TelephoneDirectory getPhone(String phone);
}
