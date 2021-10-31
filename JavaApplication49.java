
package javaapplication49;

/**
 *
 * @author Marco
 */
public class JavaApplication49 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Person p = new Person("Marco");
        Student s = new Student("Marco");
        Employee e = new Employee("mohamed");
        Faculty f = new Faculty("FCI");
        Staff staff = new Staff("ACM");
        String people[] = { person, student, employee, faculty, staff }；
        for (Person p : people)
        System.out.println(p);
        
    }
    
}
