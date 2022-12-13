import java.util.Scanner;

public class MenuClient {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""

                 █████╗ ██╗     ██╗ ███████═╗███╗  ██╗████████╗
                ██╔══██╗██║     ██║ ██╔═════╝████╗ ██║╚══██╔══╝
                ██║  ╚═╝██║     ██║ █████╗   ██╔██╗██║   ██║
                ██║  ██╗██║     ██║ ██╔══╝   ██║╚████║   ██║
                ╚█████╔╝███████╗██║ ███████═╗██║ ╚███║   ██║
                 ╚════╝ ╚══════╝╚═╝╚══════╝ ╚═╝  ╚══╝   ╚═╝""");
        String choice = "";
        while (!choice.equals("3")) {
            System.out.println("Menu");
            System.out.println("1- Add balance");
            System.out.println("2- Products ");
            System.out.println("3- Logout");
            choice = scanner.next();

            switch (choice) {
                case "1":

                    break;
                case "2":
                    System.out.println();

                    break;
                case "3":
                    System.out.println("");

                    break;
            }


        }
    }

}
