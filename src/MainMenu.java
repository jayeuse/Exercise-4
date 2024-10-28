import java.util.Scanner;

public class MainMenu {
    Scanner sc = new Scanner(System.in);

    Operations operations = new Operations();

    String filler;

    public void CreateMenu(){

        while (true) {
            System.out.println("Stack Application Conversion Menu");
            System.out.println("1. Infix to Postfix");
            System.out.println("2. Infix to Prefix");
            System.out.println("3. Postfix to Infix");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");

            try {
                int choice = sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1:
                        operations.InfixToPostfix();
                        clearScreen();
                        break;
                    case 2:
                        operations.InfixToPrefix();
                        clearScreen();
                        break;
                    case 3:
                        operations.PostfixToInfix();
                        clearScreen();
                        break;
                    case 0:
                        System.out.println("Exit");
                        return;
                    default:
                        System.out.println("Invalid choice");
                        clearScreen();
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.nextLine();
                clearScreen();  
            }
        }
    }


    public void clearScreen(){
        System.out.println("Enter to Continue");
        filler = sc.nextLine();

        try {
            if (System.getProperty("os.name").contains("Windows")) {

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
