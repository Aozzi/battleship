
public class main {

    public static void main(String[] args) {
        int choice = 0;
        System.out.println("*********************************");
        System.out.println("*     Welcome to BATTLESHIP     *");
        System.out.println("*    1.   Play the game         *");
        System.out.println("*    2.    Help - Rules         *");
        System.out.println("*    3.        Quit             *");
        System.out.println("*********************************");
        System.out.println("Please select one of the options (1-3): ");
        boolean choices = true;
        while (choices) {
            choice = Helpers.inputInt();
            if (choice > 3 || choice < 1) {
                System.out.println("Invalid input! Choose one of the three options.");
            } else {
                choices = false;
            }
        }
    }

}



/*
public class gameboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 */