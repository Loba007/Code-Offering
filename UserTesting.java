import java.util.Scanner;
public class UserTesting{
public static void main(String[] args){
 Scanner input = new Scanner(System.in);
String name = "Paul";
int passcode = 3310;

System.out.print("Login")

System.out.print("Enter User Name: ");
String username = input.nextLine();

System.out.print("Enter password to Log In: ");
 int userPasscode = input.nextInt();

if (userPasscode == passcode && userName.equals(name)){
System.outprintln("Login Successful ");
}else{
System.out.println("Login failed");
 }
}

}
