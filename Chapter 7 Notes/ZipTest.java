import java.util.Scanner;
/**
 * Write a description of class ZipTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ZipTest
{
    // instance variables - replace the example below with your own

    public static void main( String[] args )
    { 
        PersonWithZip[] people = new PersonWithZip[3];

        Scanner s = new Scanner(System.in);
        for(int i = 0; i<people.length; i++)
        {
            System.out.println("Enter first name, last name, and zip code"+
                " \nwith fields separated by a space: ");
            String firstName = s.next();
            String lastName = s.next();
            int zipCode = s.nextInt();
            people[i] = new PersonWithZip(firstName, lastName, zipCode);
        }
        for(PersonWithZip i: people)
        {
            System.out.println(i);
        }
    }
}