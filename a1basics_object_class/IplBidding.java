class IplBidding
{
int runs;
int catches;
int wkts;
String name;
int matches;
void auction()
{
System.out.println("Several Players have given their names for the auction");
}
void playerInfo()
{
System.out.println("The name of the player is :");
System.out.println(name);
System.out.println("Total runs of the player are :");
System.out.println(runs);
System.out.println("Total wkts of the player");
System.out.println(wkts);
System.out.println("Total Catches of the player:");
System.out.println(catches);
System.out.println("Total matches of the player");
System.out.println(matches);
}
public static void main(String args[])
{
IplBidding s1 =new IplBidding();
s1.auction();
System.out.println("Details of the first Player:");

s1.name="Virender Sehwag";
s1.runs=554;
s1.wkts=2;
s1.matches=9;
s1.catches=1;

s1.playerInfo();

IplBidding s2 =new IplBidding();
System.out.println("Details of the second Player:");

s2.name="Adam Gilchrist";
s2.runs=600;
s2.wkts=0;
s2.matches=9;
s2.catches=8;
s2.playerInfo();

}

}
