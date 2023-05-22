package Collections.Question1;

class Contact {
    long PhoneNumber;
    String Name, Email;
    Gender gender;

    Contact(long p, String n, String e, Gender g) {
        PhoneNumber = p;
        Name = n;
        Email = e;
        gender = g;
    }

    public void setName(String name) {
        Name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }


    public String getName() {
        return Name;
    }

    public String toString() {
        return ("Name = " + Name + ", Email = " + Email + ", Gender = " + gender);
    }
}
