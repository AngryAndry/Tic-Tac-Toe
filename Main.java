
import java.util.Scanner;

public class Main {


    String code = "_________";
    int b = code.length();
    char[] result = code.toCharArray();
    String[] x_o = new String[b];
    static int a;


    public void table() {    // сетка крестики нолики

        System.out.println("---------");
        System.out.println("| " + x_o[0] + " " + x_o[1] + " " + x_o[2] + " |");
        System.out.println("| " + x_o[3] + " " + x_o[4] + " " + x_o[5] + " |");
        System.out.println("| " + x_o[6] + " " + x_o[7] + " " + x_o[8] + " |");

        System.out.println("---------");
    }

    public void check() {  // проверка победы или ничей
        int combo1 = x_o[0].charAt(0) + x_o[1].charAt(0) + x_o[2].charAt(0);
        int combo2 = x_o[0].charAt(0) + x_o[3].charAt(0) + x_o[6].charAt(0);
        int combo3 = x_o[6].charAt(0) + x_o[7].charAt(0) + x_o[8].charAt(0);
        int combo4 = x_o[2].charAt(0) + x_o[5].charAt(0) + x_o[8].charAt(0);
        int combo5 = x_o[2].charAt(0) + x_o[4].charAt(0) + x_o[6].charAt(0);
        int combo6 = x_o[1].charAt(0) + x_o[4].charAt(0) + x_o[7].charAt(0);
        int combo7 = x_o[3].charAt(0) + x_o[4].charAt(0) + x_o[5].charAt(0);
        int combo8 = x_o[0].charAt(0) + x_o[4].charAt(0) + x_o[8].charAt(0);


        boolean x1 = ((combo1 == 264) ||
                (combo2 == 264) ||
                (combo8 == 264) ||
                (combo3 == 264) ||
                (combo4 == 264) ||
                (combo5 == 264) ||
                (combo6 == 264) ||
                (combo7 == 264));
        boolean o1 = ((combo1 == 237) ||
                (combo2 == 237) ||
                (combo8 == 237) ||
                (combo3 == 237) ||
                (combo4 == 237) ||
                (combo5 == 237) ||
                (combo6 == 237) ||
                (combo7 == 237));


        if (x1) {
            System.out.println("X wins");
            a = 10;
        } else if (o1) {
            System.out.println("O wins");
            a = 10;

        } else if (a == 9) {
            System.out.println("Draw");
        }


    }


    public static void main(String[] args) {
        Main obj = new Main();
        Scanner scanner = new Scanner(System.in);

        for (int a = 0; a < obj.code.length(); a++) {
            obj.x_o[a] = String.valueOf(obj.result[a]);
        }

        obj.table();


        while (a < 9) {

            System.out.print("Enter the coordinates: ");
            String number = scanner.nextLine();


            int numberChar = number.charAt(0);
            int number1 = numberChar - '0';

            int numberChar2 = number.charAt(2);
            int number2 = numberChar2 - '0';
            boolean admittance = (number1 + number2 > 1) && (number1 + number2 <= 6);
            boolean position1 = number1 == 1;
            boolean position2 = number1 == 2;
            boolean position3 = number1 == 3;
            boolean position4 = number2 == 1;
            boolean position5 = number2 == 2;
            boolean position6 = number2 == 3;

            if (admittance) {
                if (position1 && position4) {
                    if (obj.x_o[6].equals("X") || obj.x_o[6].equals("O")) {
                        System.out.println("This cell is occupied! Choose another one!");

                    } else {
                        if (a % 2 == 1) {
                            obj.x_o[6] = "X";
                        } else {
                            obj.x_o[6] = "O";
                        }
                        a++;
                        obj.table();
                        obj.check();
                    }
                }
                if (position1 && position5) {
                    if (obj.x_o[3].equals("X") || obj.x_o[3].equals("O")) {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        if (a % 2 == 1) {
                            obj.x_o[3] = "X";
                        } else {
                            obj.x_o[3] = "O";
                        }
                        a++;
                        obj.table();
                        obj.check();
                    }
                }
                if (position1 && position6) {
                    if (obj.x_o[0].equals("X") || obj.x_o[0].equals("O")) {
                        System.out.println("This cell is occupied! Choose another one!");

                    } else {
                        if (a % 2 == 1) {
                            obj.x_o[0] = "X";
                        } else {
                            obj.x_o[0] = "O";
                        }
                        a++;
                        obj.table();
                        obj.check();
                    }
                }
                if (position2 && position4) {
                    if (obj.x_o[7].equals("X") || obj.x_o[7].equals("O")) {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        if (a % 2 == 1) {
                            obj.x_o[7] = "X";
                        } else {
                            obj.x_o[7] = "O";
                        }
                        a++;
                        obj.table();
                        obj.check();
                    }
                }
                if (position2 && position5) {
                    if (obj.x_o[4].equals("X") || obj.x_o[4].equals("O")) {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        if (a % 2 == 1) {
                            obj.x_o[4] = "X";
                        } else {
                            obj.x_o[4] = "O";
                        }
                        a++;
                        obj.table();
                        obj.check();
                    }
                }
                if (position2 && position6) {
                    if (obj.x_o[1].equals("X") || obj.x_o[1].equals("O")) {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        if (a % 2 == 1) {
                            obj.x_o[1] = "X";
                        } else {
                            obj.x_o[1] = "O";
                        }
                        a++;
                        obj.table();
                        obj.check();
                    }
                }
                if (position3 && position4) {
                    if (obj.x_o[8].equals("X") || obj.x_o[8].equals("O")) {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        if (a % 2 == 1) {
                            obj.x_o[8] = "X";
                        } else {
                            obj.x_o[8] = "O";
                        }
                        a++;
                        obj.table();
                        obj.check();
                    }
                }
                if (position3 && position5) {
                    if (obj.x_o[5].equals("X") || obj.x_o[5].equals("O")) {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        if (a % 2 == 1) {
                            obj.x_o[5] = "X";
                        } else {
                            obj.x_o[5] = "O";
                        }
                        a++;
                        obj.table();
                        obj.check();
                    }
                }
                if (position3 && position6) {
                    if (obj.x_o[2].equals("X") || obj.x_o[2].equals("O")) {
                        System.out.println("This cell is occupied! Choose another one!");

                    } else {
                        if (a % 2 == 1) {
                            obj.x_o[2] = "X";
                        } else {
                            obj.x_o[2] = "O";
                        }
                        a++;
                        obj.table();
                        obj.check();
                    }
                }

            } else if ((number1 > 3 && number1 < 10) || (number2 > 3 && number2 < 10)) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else {
                System.out.println("You should enter numbers!");
            }
        }
    }
}
