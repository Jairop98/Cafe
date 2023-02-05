public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double dripcoffeePrice = 2.0;
        double lattePrice = 4.0;
        double cappucinoPrice = 4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(isReadyOrder1 ? readyMessage : pendingMessage); // Check Cindhuri's order
        System.out.println(generalGreeting + customer4); // Displays "Welcome to Cafe Java, Noah"
        System.out.println(isReadyOrder4 ? readyMessage : pendingMessage); // Check Noah's order
        System.out.println(displayTotalMessage + cappucinoPrice); // Noah price
        System.out.println(generalGreeting + customer2); // Displays "Welcome to Cafe Java, Sam"
        System.out.println(displayTotalMessage + (lattePrice * 2)); // Sam's price for 2 lattes
        System.out.println(isReadyOrder2 ? readyMessage : pendingMessage); // Check Sam's order
        System.out.println(generalGreeting + customer3); // Displays "Welcome to Cafe Java, Jimmy"
        System.out.println(isReadyOrder3 ? readyMessage : pendingMessage);
        System.out.println(displayTotalMessage + (lattePrice - dripcoffeePrice)); // Jimmy payed for coffee price instead of latte



    	// ** Your customer interaction print statements will go here ** //
    }
}