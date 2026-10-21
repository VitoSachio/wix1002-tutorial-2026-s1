void main() {

    //Q1
    //a.
    System.out.println("Faculty of Computer Science and Technology");
    //b.
    System.out.println("Faculty");
    System.out.println("of");
    System.out.println("Computer");
    System.out.println("Science");
    System.out.println("and");
    System.out.println("Technology");

    //Q2
    System.out.println("\"SDN\" - Software-defined networking");

    //Q3
    //a
    System.out.println("Java Programming"); //there's no "out" in that statements
    //b
    System.out.println("Introduction to Java!");// it supposed to be "out" not "in" and there's no semicolon ";" at the end
    //c
    System.out.println("\\t is the horizontal tab character");//to print the literal characters \t on the screen instead of executing an actual tab space, the backslash must be escaped with another backslash (\\t)
    //d
    System.out.println("Java case is very Sensitive!");//the "system" word supposed to be Capital letter "System"

    //Q4
    //a.
    String matricNumber;
    //b.
    double pi;
    //c.
    boolean M=false;
    //d.
    long P = 8800000000L;
    //e.
    char letter = 'U';
    //f.
    final String PRO = "Java";

    //Q5
    //a
    double amount = 32.5; //"32,5" is a String (text), but amount is declared as a double (number)
    amount +=10;
    System.out.println("The amount is " + amount); //The final keyword makes amount a constant, so it cannot be changed later by amount += 10;
    //b
    String chapter = "Summary"; //string supposed to be capital S and String used Quotation mark
    System.out.println("Chapter");//it should have quotation marks
    //c
    int num = 0; //initialized num
    num++;       //used a valid increment
    int num1 = num; //declared and initialized num1
    //d
    int NUM = 3000;
    System.out.printf("%4d\n", NUM);//it supposed to be printf if we want to use format specifiers, num is an integer (int) and you must use %d. The %4.2f (for decimals) %4d (for integers).
    //f
    String contact;
    Scanner keyboard = new Scanner(System.in);//supposed to be System.in not System.out
    contact = keyboard.nextLine();
}