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

public class Procedure {

    // Procedure information
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charge;

    // No-argument constructor
    public Procedure() {

    }

    // Constructor with procedure name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    // Constructor with all procedure information
    public Procedure(String procedureName, String procedureDate,
                     String practitionerName, double charge) {

        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charge = charge;
    }

    // Getters
    public String getProcedureName() {
        return procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public double getCharge() {
        return charge;
    }

    // Setters
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "Procedure Name: " + procedureName + "\n" +
               "Procedure Date: " + procedureDate + "\n" +
               "Practitioner: " + practitionerName + "\n" +
               String.format("Charge: $%.2f", charge);
    }
}