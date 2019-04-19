
import java.util.ArrayList;
import java.util.List;
import people.Person;
import people.Student;
import people.Teacher;




public class Main {

    public static void main(String[] args) {  
        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

        printDepartment(people);
         Person olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
               // NOT WORKING!
   System.out.println( olli );   // olli.toString() IT WORKS!
   
    }
    public static void printDepartment(List<Person> people) {
       for(Person person: people) {
       
           System.out.println(person);
       }
           
           
    }
}
