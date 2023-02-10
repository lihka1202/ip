import java.util.Scanner;

public class DukeException extends Duke{
    public String exceptionHandlerMark(Scanner in) {
        boolean needException = true;
        String input = in.nextLine();
        while (needException) {
            input = in.nextLine();
            try {
                isInRange(input, currentIndex);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("OOPS!! I'm sorry I don't know what it means!");
                System.out.println("Please enter a valid index to continue");
                continue;
            }
            needException = false;
        }
        return input;
    }


}
