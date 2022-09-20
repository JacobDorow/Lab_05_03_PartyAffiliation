public class Main
{
    public static void main(String[] args) {
        String partyChoice = "D";

        System.out.println("(Simulated Input) Please enter your party affiliation");
        System.out.println("Your choices are (D)emocrat (R)epublican (I)ndependent >>" + partyChoice);

        if (partyChoice == "D") {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (partyChoice == "R") {
            System.out.println("You get a Republican Elephant.");
        }
        else if (partyChoice == "I") {
            System.out.println("You get a Independent Person.");
        }
        else {
            System.out.println("You get nothing/other");
        }
    }
}