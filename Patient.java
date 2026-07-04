/*
 * Class: CMSC203
 * Instructor: [Farnaz Elvazi]
 * Description: This class stores patient information including name, address, phone number,
 * and emergency contact information.
 * Due: [06/29/26]
 * Platform/compiler: Eclipse IDE / Java 21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Edwin During
 */
package application;

public class Patient {

    // Patient information
    private String firstName;
    private String middleName;
    private String lastName;

    private String address;
    private String city;
    private String state;
    private String zip;

    private String phoneNumber;

    private String emergencyName;
    private String emergencyPhone;
    
    // No-argument constructor
    public Patient() {

    }

    // Constructor with patient's name
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Constructor with all patient information
    public Patient(String firstName, String middleName, String lastName,
            String address, String city, String state, String zip,
            String phoneNumber, String emergencyName, String emergencyPhone) {

		 this.firstName = firstName;
		 this.middleName = middleName;
		 this.lastName = lastName;
		 this.address = address;
		 this.city = city;
		 this.state = state;
		 this.zip = zip;
		 this.phoneNumber = phoneNumber;
		 this.emergencyName = emergencyName;
		 this.emergencyPhone = emergencyPhone;
	}
    
    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }
    
    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }
    
    // Builds the patient's full name
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }
    
    // Builds the patient's address
    public String buildAddress() {
        return address + " " + city + " " + state + " " + zip;
    }
    
    // Builds the emergency contact information
    public String buildEmergencyContact() {
        return emergencyName + " " + emergencyPhone;
    }
    
    @Override
    public String toString() {
        return "Patient Information\n" +
               "Name: " + buildFullName() + "\n" +
               "Address: " + buildAddress() + "\n" +
               "Phone Number: " + phoneNumber + "\n" +
               "Emergency Contact: " + buildEmergencyContact();
    }

}