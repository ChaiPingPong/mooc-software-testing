
public class CaitlynnChang {
    String firstName = "Caitlynn";
    String lastName = "Chang";
    String uciNetID = "caitlypc";
    int studentNumber = 35366988;

    public String getFullName() { return firstName + " " + lastName; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getUCInetID() { return uciNetID; }

    public int getStudentNumber() { return studentNumber; }

    public String getRotatedFullName(int shift)
    {
        // returns your name rotated
        // positive number rotate to the left, negative rotate to the right
        String full_name = "Caitlynn Chang";
        if (shift == 0)
        {
            return full_name;
        }
        else if (shift > 0)
        {
            return full_name.substring(shift) + full_name.substring(0, shift);
        }
        else
        {
            return full_name.substring(full_name.length()+shift) + full_name.substring(0, full_name.length()+shift);
        }
    }
}