////////////////////////////////////////////////////////////////////
// [MATTEO ALBERTO] [ROCCO] [2042354]
// [ION] [BOUROSU] [2010006]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;


public class RomanPrinter {
    public static String print(int number) throws ZeroException, NegativeNumberException, BiggerThan1000Exception {
        return printAsciiArt(IntegerToRoman.convert(number));
    }

    private static String printAsciiArt(String romanNumber) {
        String[] I = {
                "  _____  ",
                " |_   _| ",
                "   | |   ",
                "   | |   ",
                "  _| |_  ",
                " |_____| "};


        String[] V = {
                " __      __ ",
                " \\ \\    / / ",
                "  \\ \\  / /  ",
                "   \\ \\/ /   ",
                "    \\  /    ",
                "     \\/     "};


        String[] X = {" __   __  ",
                " \\ \\ / /  ",
                "  \\ V /   ",
                "   > <    ",
                "  / . \\   ",
                " /_/ \\_\\  "
        };


        String[] L = {
                "  _       ",
                " | |      ",
                " | |      ",
                " | |      ",
                " | |____  ",
                " |______| "
        };


        String[] C = {
                "   _____   ",
                "  / ____|  ",
                " | |       ",
                " | |       ",
                " | |____   ",
                "  \\_____|  "
        };


        String[] D = {
                "  ____    ",
                " |  __ \\  ",
                " | |  | | ",
                " | |  | | ",
                " | |__| | ",
                " |_____/  "
        };


        String[] M = {
                "  __  __   ",
                " |  \\/  |  ",
                " | \\  / |  ",
                " | |\\/| |  ",
                " | |  | |  ",
                " |_|  |_|  "};


        String result = "";


        for (int j = 0; j < 6; j++) {

            for (char c : romanNumber.toCharArray()) {
                if (c == 'I') {
                    result += I[j];
                }
                if (c == 'V') {
                    result += V[j];
                }
                if (c == 'X') {
                    result += X[j];
                }
                if (c == 'L') {
                    result += L[j];
                }
                if (c == 'C') {
                    result += C[j];
                }
                if (c == 'D') {
                    result += D[j];
                }
                if (c == 'M') {
                    result += M[j];
                }

            }

            result += "\n";
        }

        return result;
    }
}