## Q1
```java
// a.
    float[] numbers = new float [12];
// b.
    char[] letters = new char {'A', 'B', 'C', 'D', 'E'};
// c.
    String[] studentname = new String [100];
// d.
    int [][] table = new int [6][2];
// e. 
    int[][] numbers = {
      {6,9},
      {2,5},
      {4,6},
      };
// f. 
    for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
// g.
    String[] contact = {"Vito", "Bima", "Faiz"};
    for (int i = 0; i < contact.length; i++) {
    System.out.println(contact[i]);
    
}
}
```
## Q2
```java
// a. 
    String [] code = {"AAA", "AAB", "AAC", "AAD"}
// b.
    int [] num = new int [10]
    for(int k=0; k < num.length; k++)
    sum += num[k];
// c. 
    int[][] t = new int[3][];
    t[1] = new int[3];
    t[1][2] = 5;
// d.
    int i = 4;
    int[] score = new int[5];
    score[1] = 78;
    score[i] = 100;
```
## Q3
```java
    int[] marks = new int[5];
    int i = 0, j = 1;
    marks[i] = 12;
    marks[j] = marks[i] + 19; // 31
    marks[j-1] = marks[j] * marks [j]; // 961
    marks[j*3] = marks[i+1]; // 3 = 0
    marks[++j] = marks[i]%5; //961%5 = 2
    marks[2*j] = marks[j-1];
    
    marks[0] = 961;
    marks[1] = 31;
    marks[2] = 1;
    marks[3] = 31;
    marks[4] = 31;
```
## Q4
```java
    int count = 0;
    for (int i = 0; i < sentence.length; i++) {
    if (sentence[i].equals("the")) {
        count++;
    }
}
System.out.println("The word the appears " + count + " times");
```
## Q5
```java
    for (int i = sentence.length - 1; i >= 0; i--) {
    for (int j = sentence[i].length() - 1; j >= 0; j--) {
        System.out.print(sentence[i].charAt(j));
    }
    System.out.println();
}
```
## Q6
```java
    int number = (int)(Math.random() * 256);
    int[] binary = new int[8];
    for (int i = 7; i >= 0; i--) {
    binary[i] = number % 2;
    number = number / 2;
}
    for (int i = 0; i < binary.length; i++) {
    System.out.print(binary[i]);
}
System.out.println();
```
