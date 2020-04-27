import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        brain();

        System.out.println("Have a nice day");

    }

    public static void brain() {

        Scanner keyboard;

        keyboard = new Scanner(System.in);

        int output = 0;

        int input1 = 0;

        int input2 = 0;

//################################################# Start of the Program ###############################################

//      They are first greeted with this screen
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                                                                +");
        System.out.println("+       1) change sentence                                       +");
        System.out.println("+       2) Play sentence                                         +");
        System.out.println("+       3) exit                                                  +");
        System.out.println("+                                                                +");
        System.out.println("+                                                                +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(">");
        output = keyboard.nextInt();

//################################################## Start of Section 1 ################################################

        if (output == 1) {
//          When 1 is selected this screen appears to edit or remove the sentences
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("+                                                                +");
            System.out.println("+       1) edit sentence                                         +");
            System.out.println("+       2) remove sentence                                       +");
            System.out.println("+       3) back                                                  +");
            System.out.println("+                                                                +");
            System.out.println("+                                                                +");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(">");
            output = keyboard.nextInt();

            System.out.println("This is output 1");
            if (output == 1) {
//              When 1 is selected it will prompt you to edit input 1 or 2
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("+                                                                +");
                System.out.println("+       1) Edit 1                                                +");
                System.out.println("+       2) Edit 2                                                +");
                System.out.println("+       3) back                                                  +");
                System.out.println("+                                                                +");
                System.out.println("+                                                                +");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println(">");
                output = keyboard.nextInt();
//              
                if (output == 1) {

                    System.out.println("Edit the text below");
                    input1 = keyboard.nextInt();

                }

                if (output == 2) {

                    System.out.println("Edit the text below");
                    input2 = keyboard.nextInt();

                }

                if (output == 3) {



                }
            }

            if (output == 2) {
//              When 2 is pressed it will prompt you to remove the recorded sentence in input 1 or 2
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("+                                                                +");
                System.out.println("+       1) remove 1                                              +");
                System.out.println("+       2) remove 2                                              +");
                System.out.println("+       3) back                                                  +");
                System.out.println("+                                                                +");
                System.out.println("+                                                                +");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println(">");
                output = keyboard.nextInt();

            }

//################################################### end of Section 1 #################################################

//################################################## Start of Section 2 ################################################

        } if (output == 2) {
//          When 2 is selected if will prompt you to play the 2 sentences but first you will have
//          to create them or no there would be no output
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("+                                                                +");
            System.out.println("+       1) play 1                                                +");
            System.out.println("+       2) play 2                                                +");
            System.out.println("+       3) back                                                  +");
            System.out.println("+                                                                +");
            System.out.println("+                                                                +");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(">");
            output = keyboard.nextInt();

            System.out.println("This is output 2");
//          When 1 is selected it will play the input that was recorded for input 1
            if (output == 1) {

                System.out.println(input1);

            }
//          When 2 is selected it will play the input that was recorded for input 2
            if (output == 2) {

                System.out.println(input2);

            }
//          When 3 is selected it will return back to the last message
            if (output == 3) {



            }
//################################################## end of Section 2 ##################################################

//################################################## Start of Section 3 ################################################

//      This will just end the program when they select exit
        } if (output == 3) {

            exit(1);

        }

//################################################## end of Section 3 ##################################################

        }

//################################################# End of the Program #################################################

    }


