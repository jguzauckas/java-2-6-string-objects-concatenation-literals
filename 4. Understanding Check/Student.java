public class Student {
    public int idNumber;
    public String firstName;
    public String lastName;
    public int gradeLevel;

    public Student(){
        idNumber = -1;
        firstName = "";
        lastName = "";
        gradeLevel = -1;
    }

    public Student(int i, String f, String l, int g){
        idNumber = i;
        firstName = f;
        lastName = l;
        gradeLevel = g;
    }

    public int getIDNumber(){
        return idNumber;
    }

    public void setIDNumber(int i){
        idNumber = i;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String f){
        firstName = f;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String l){
        lastName = l;
    }

    public int getGradeLevel(){
        return gradeLevel;
    }

    public void setGradeLevel(int g){
        gradeLevel = g;
    }

    public void passYear(){
        gradeLevel ++;
    }
}
