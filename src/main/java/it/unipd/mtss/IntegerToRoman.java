////////////////////////////////////////////////////////////////////
// [MATTEO ALBERTO] [ROCCO] [2042354]
// [ION] [BOUROSU] [2010006]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
public class IntegerToRoman {
public static String convert(int number) {
int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    StringBuilder roman = new StringBuilder();
    if (number < 1 || number > 1000) {
    throw new IllegalArgumentException("Valori non consentiti");
    }
    for (int i = 0; i < values.length; i++) {
    while (number >= values[i]) {
    number = number - values[i];
    roman.append(romanLetters[i]);
    }
    }
return roman.toString();
}
}
