import java.util.Scanner;

/***
 * There once was a ADJECTIVE1 girl named GIRLS_NAME who was a ADJECTIVE2OCCUPATION1 in the kingdom of PLACE. She loved to wear CLOTHING and to HOBBY. She wanted to marry the ADJECTIVE3OCCUPATION2 named BOYS_NAME, but her father, king MANS_NAME, forbid her from seeing him.
 */
public class MadLibsClone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an adjective:\t");
        String adj1 = sc.nextLine();

        System.out.println("Enter a girls name:\t");
        String gname = sc.nextLine();

        System.out.println("Enter another adjective:\t");
        String adj2 = sc.nextLine();

        System.out.println("Enter an occupation:\t");
        String occup1 = sc.nextLine();

        System.out.println("Enter the name of a place:\t");
        String place = sc.nextLine();

        System.out.println("Enter the name of a piece of clothing:\t");
        String cloth = sc.nextLine();

        System.out.println("Enter the name of a hobby:\t");
        String hobby = sc.nextLine();

        System.out.println("Enter another adjective:\t");
        String adj3 = sc.nextLine();

        System.out.println("Enter another occupation:\t");
        String occup2 = sc.nextLine();

        System.out.println("Enter a boy's name:\t");
        String boy = sc.nextLine();

        System.out.println("Enter a man's name:\t");
        String man = sc.nextLine();

        System.out.println("There once was a "+ adj1 +"girl named "+ gname +" who was a "+adj2 + " "+ occup1 +" in the kingdom of "+ place +".\nShe loved to wear "+cloth +" and to "+hobby+".\nShe wanted to marry the "+adj3 + " "+ occup2 +" named "+boy+", but her father, king "+ man +", forbid her from seeing him.");

        sc.close();
    }
}
