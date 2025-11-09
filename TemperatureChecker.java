import java.util.Scanner;
public class Temperature{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.ou.print("Enter today's Temeperature: ");
 int temp = input.nextInt();

if(temp < 15){
  System.out.print("It is cold out there.");
}
  else if (temp > 15 && temp <= 30){
System.out.println("It's warm out there!");
}
  else {System.out.println("It's so HOT right now!")
}

}
