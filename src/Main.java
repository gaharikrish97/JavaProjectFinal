import java.util.*;
import java.lang.*;

interface utility{
    public void get_details();
    public void set_details();
}


public class Main {

    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employee[] = new Employees[5];
        Cars car[] = new Cars[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;
        int choice = 100;
        boolean hasValidRights = false;
        while(choice!=0){

            main_menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                        hasValidRights = checkValidAuth();
                        if (hasValidRights) {
                            System.out.println("Authentication successful!");
                            showroom[showroom_counter] = new Showroom();
                            showroom[showroom_counter].set_details();
                            showroom_counter++;
                            System.out.println();
                            System.out.println("1].ADD NEW SHOWROOM");
                            System.out.println("9].GO BACK TO MAIN MENU");
                            choice = sc.nextInt();
                            break;
                        } else {
                            System.out.println("Invalid Access.You do not have access to Add Informations.");
                            System.out.println("Enter 1 to display the menu again");
                            Scanner scn = new Scanner(System.in);
                            String menuShow = scn.nextLine();
                            if(menuShow == Integer.toString(1)) {
                                main_menu();
                            }
                            break;
                        }

                    case 2:
                        hasValidRights = checkValidAuth();
                        if (hasValidRights) {
                        employee[employees_counter] = new Employees();
                        employee[employees_counter].set_details();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                        } else {
                            System.out.println("Invalid Access.You do not have access to Add Informations.");
                            System.out.println("Enter 1 to display the menu again");
                            Scanner scn = new Scanner(System.in);
                            String menuShow = scn.nextLine();
                            if(menuShow == Integer.toString(1)) {
                                main_menu();
                            }
                            break;
                        }
                    case 3:
                        hasValidRights = checkValidAuth();
                        if (hasValidRights) {
                        car[car_counter] = new Cars();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                } else {
                    System.out.println("Invalid Access.You do not have access to Add Informations.");
                    System.out.println("Enter 1 to display the menu again");
                    Scanner scn = new Scanner(System.in);
                    String menuShow = scn.nextLine();
                    if(menuShow == Integer.toString(1)) {
                        main_menu();
                    }
                    break;
                }
                    case 4:
                        for (int i = 0; i < showroom_counter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employees_counter; i++) {
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < car_counter; i++) {
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }

        sc.close();
    }

    public static boolean authenticateUser(String username, String password) {

        String validUsername = "admin";
        String validPassword = "password123";
        if (username.equals(validUsername) && password.equals(validPassword)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkValidAuth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String inputUsername = sc.nextLine();
        System.out.print("Enter password:");
        String inputPassword = sc.nextLine();

        boolean isAuthenticated = authenticateUser(inputUsername, inputPassword);
        return isAuthenticated;
    }
}