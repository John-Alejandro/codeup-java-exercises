package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        //HashMap<keyDatatype, valueDatatype> nameVar = new HashMap<>();
        HashMap<String, String>students = new HashMap<>();

        students.put("John","John_Alejandro");
        students.put("Angel","Angel_Baby");
        students.put("Rock","The_Wrestler");
        students.put("Johnny","The_Cat");

        System.out.println(students);

    }
}
