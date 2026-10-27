```java
// a. 
System.out.println(3 * 8 == 27);   // false

// b.
int n = in.nextInt();
if (n % 2 == 0)
    System.out.println("Even");
else
    System.out.println("Odd");
    
// c. 
char ch = in.next().charAt(0);
if (ch >= 'A' && ch <= 'Z')
    System.out.println("Capital letter");
else
    System.out.println("Not a capital letter")

// d.
String s1 = in.next(), s2 = in.next();
if (s1.compareToIgnoreCase(s2) <= 0)
    System.out.println(s1 + " " + s2);
else
    System.out.println(s2 + " " + s1);

// e.
int day = in.nextInt();
switch (day) {
    case 0: System.out.println("Sunday"); break;
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    case 4: System.out.println("Thursday"); break;
    case 5: System.out.println("Friday"); break;
    case 6: System.out.println("Saturday"); break;
    default: System.out.println("Invalid input");
```
## Q2
```java
// a. if
    (num1 == num2)
    System.out.println("Number 1 is equal to number 2.");

// b.
    if (x > y && y > z)
    System.out.println("x is the largest number");

// c.
String s1 = "abc", s2 = "abc";   
if (s1.equals(s2))
    System.out.println("They are equal strings.");
else
    System.out.println("They are not equal strings.");

// d. 
if (x > 0 || y > 0)
    System.out.println("Either x or y is positive");
```
## Q3
```java
// a.
      if (x < 10)
      if (y > 10)
      System.out.println("*****");
      else
      System.out.println("#####");
      System.out.println("$$$$$");

Output #####
       $$$$$
// b.
      if (x < 10) {
      if (y < 10)
      System.out.println("*****");
      else{
      System.out.println("#####");
      System.out.println("$$$$$");
      }}

Output #####
       $$$$$

// c.
      if (x < 10) {
      if (y < 10)
      System.out.println("*****");
      System.out.println("#####");
      }
      else {
      System.out.println("$$$$$");
      }

Output #####

// d.
      if (x > 10) {
      if (y > 10) {
      System.out.println("*****");
      System.out.println("#####"); }
      else
      System.out.println("$$$$$");
      }

Output "No Output"
```
## Q4
```java
    int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
    
    if (a >= b && a >= c)
        System.out.println(a);
    else if (b >= a && b >= c)
        System.out.println(b);
    else
        System.out.println(c);
```

## Q5
```java
    int year = in.nextInt();
    
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        System.out.println(year + " is a leap year");
    else
        System.out.println(year + " is not a leap year");
```
