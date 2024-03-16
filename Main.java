public class Main {
public static void main(String[] args) {
System.out.println("Hello World\f");
System.out.println("God is Good!");
System.out.println(5*6);
System.out.println(9/3);
// Variables and concanate;
String fstName = "Kizito ";
String lstName = "Oliver";
String fullName = fstName +lstName;
System.out.println(fullName);
System.out.println("Here i am using -> concat() method \n" + fstName.concat(lstName));

System.out.println();// this creates a space.

// declaring multiple Variables
int x = 3, y = 5, z = 10;
System.out.println(x*y+z);

int w,v,r;
w = v = r = 50;
System.out.println(w);

Boolean myBul = true;
System.out.println(myBul);

// Type casting => widening casting.
int myInt = 9;
double myDob = myInt;
System.out.println(myDob);

//Narrowing casting.
double myDoub = 79.879d;
int myInteg = (int) myDoub;
System.out.println(myDoub);
System.out.println(myInteg);

//Strings & strings methods.

String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.print(txt.length() + " letters --> ");
System.out.print(txt.toLowerCase()+ ".\nLetter \'O\' is in index "); //  \n createsa new line.
System.out.println(txt.indexOf("O"));
String result = (txt.length() > 29 ) ? "Not alphabetical" : "Alphabets";
System.out.println(result);

//While loop
int i = 0;
while (i < 9) {
System.out.println(i);
i++;
};
System.out.print("\n");
//do /while loop.
int u = 0;
do {
System.out.print(u);
u++;
}
while (u < 5);
System.out.println();

// for loop.

for (int l = 0; l <= 20; l = l + 2) {
System.out.print(l);
};

//Nested for loops.
// Outer loop.
System.out.print("\n");
for (int k = 1; k <= 2; k++) {
System.out.println("Outer: " + k); // Executes 2 times

// Inner loop
for (int j = 1; j <= 2; j++) {
System.out.println(" Inner: " + j); // Executes 6 times (2 * 2)
};
};

}
}