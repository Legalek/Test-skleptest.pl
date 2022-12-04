package tests.pl.skleptest.models;

public class Contact {
    private String yourName = "Patryk";
    private String yourEmail = "testowy@testowy.pl";
    private String yourSubject = "Testowanie.testowanie!@#$%^&*()ĄŚĆÓŁŹŻ";
    private String yourMSG = "Miłej kawusi i wiadomo co i wiadomo kogo";

    public String getYourName() {
        return yourName;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

    public String getYourEmail() {
        return yourEmail;
    }

    public void setYourEmail(String yourEmail) {
        this.yourEmail = yourEmail;
    }

    public String getYourSubject() {
        return yourSubject;
    }

    public void setYourSubject(String yourSubject) {
        this.yourSubject = yourSubject;
    }

    public String getYourMSG() {
        return yourMSG;
    }

    public void setYourMSG(String yourMSG) {
        this.yourMSG = yourMSG;
    }
}
