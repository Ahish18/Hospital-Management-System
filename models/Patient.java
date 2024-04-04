package models;

public class Patient {

    String Pid;
    String name;
    int age;
    Long phoneNumber;
    String email;
    String gender;
    String disease;
    Doctor doctor;
    Room room;
    public Patient(String pid, String name, int age, Long phoneNumber, String email, String gender, String disease, Doctor doctor,Room room) {
        Pid = pid;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.disease = disease;
        this.doctor=doctor;
        this.room=room;
        

    }

    
    
}
