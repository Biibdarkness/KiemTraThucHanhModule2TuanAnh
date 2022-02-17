package model;

public class TelephoneDirectory {
    private String phoneNumber;
    private String groupTD;
    private String fullName;
    private String gender;
    private String address;
    private String birthdate;
    private String email;

    public TelephoneDirectory() {
    }

    public TelephoneDirectory(String phoneNumber, String groupTD, String fullName, String gender, String address, String birthdate, String email) {
        this.phoneNumber = phoneNumber;
        this.groupTD = groupTD;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.birthdate = birthdate;
        this.email = email;
    }

    public TelephoneDirectory(String list) {
        String[] strings = list.split(";");
        this.phoneNumber = strings[0];
        this.groupTD = strings[1];
        this.fullName = strings[2];
        this.gender = strings[3];
        this.address = strings[4];
        this.birthdate = strings[5];
        this.email = strings[6];
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroupTD() {
        return groupTD;
    }

    public void setGroupTD(String groupTD) {
        this.groupTD = groupTD;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return phoneNumber + ";" + groupTD + ";" + fullName + ";" + gender + ";" + address + ";" + birthdate + ";" + email;
    }
}
