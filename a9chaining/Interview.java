/* 
program to make use of this keyword in the real life 
*/
import java.util.Scanner;

class Interview 
{
String name, companyName, marks;
String aptiRound;
String gdRound;
String technicalRound;
String hrRound;Scanner sc = new Scanner(System.in);

Interview aptiRound()
{
System.out.println("Enter the marks you got in the aptiRound");
int aptimarks = sc.nextInt();

if (aptimarks >= 60)
{
System.out.println("You are selected to the next round");
return this;
}
else
{
System.out.println("You are disqualified");
//System.exit(0);
return null;

}
}
Interview gdRound() 
{
System.out.println("Enter the marks you got in the gdRound");
int gdmarks = sc.nextInt();

if (gdmarks >= 60)
{
System.out.println("You are selected for the next round");
return this;
}
else
{
System.out.println("You are disqualified");
//System.exit(0);
return null;

            
}
}
Interview technicalRound() 
{
System.out.println("Enter the marks you got in the technicalRound");
int technicalMarks = sc.nextInt();

if (technicalMarks >= 60) {
System.out.println("You are selected for the next round");
return this;
} 
else
{
System.out.println("You are disqualified");
  //System.exit(0);
  return null;   
}
}
void hrRound()
{
System.out.println("You have entered the final round");
}
public static void main(String hathi[]) {
new Interview().aptiRound().gdRound().technicalRound().hrRound();
}
}
