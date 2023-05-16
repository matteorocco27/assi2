////////////////////////////////////////////////////////////////////
// [MATTEO ALBERTO] [ROCCO] [2042354]
// [ION] [BOUROSU] [2010006]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
public class RomanPrinter {
public static String print(int number) {
return printAsciiArt(IntegerToRoman.convert(number));
}
private static String printAsciiArt(String romanNumber) {
String any = romanNumber;
String[] sArray = any.split("");
String str1 = "";
String str2 = "";
String str3 = "";
String str4 = "";
String str5 = "";
String str6 = "";
for (int i = 0; i < sArray.length; i++) {
if (sArray[i].equals("I")) {
str1 += "  _____ ";
str2 += " |_   _|";
str3 += "   | |  ";
str4 += "   | |  ";
str5 += "  _| |_ ";
str6 += " |_____|";
}
if (sArray[i].equals("V")) {
str1 += " __      __";
str2 += " \\ \\    / /";
str3 += "  \\ \\  / / ";
str4 += "   \\ \\/ /  ";
str5 += "    \\  /   ";
str6 += "     \\/    ";
}
if (sArray[i].equals("X")) {
str1 += " __   __";
str2 += " \\ \\ / /";
str3 += "  \\ V / ";
str4 += "   > <  ";
str5 += "  / . \\ ";
str6 += " /_/ \\_\\";
}
if (sArray[i].equals("L")) {
str1 += "  _      ";
str2 += " | |     ";
str3 += " | |     ";
str4 += " | |     ";
str5 += " | |____ ";
str6 += " |______|";
}
if (sArray[i].equals("C")) {
str1 += "   _____ ";
str2 += "  / ____|";
str3 += " | |     ";
str4 += " | |     ";
str5 += " | |____ ";
str6 += " |______|";
}
if (sArray[i].equals("D")) {
str1 += "  _____   ";
str2 += " |  __ \\  ";
str3 += " | |  | | ";
str4 += " | |  | | ";
str5 += " | |__| | ";
str6 += " |_____/  ";
}
if (sArray[i].equals("M")) {
str1 += "  __  __  ";
str2 += " |  \\/  | ";
str3 += " | \\  / | ";
str4 += " | |\\/| | ";
str5 += " | |  | | ";
str6 += " |_|  |_| ";
}
}
System.out.println(str1);
System.out.println(str2);
System.out.println(str3);
System.out.println(str4);
System.out.println(str5);
System.out.println(str6);
return null;
}
}
