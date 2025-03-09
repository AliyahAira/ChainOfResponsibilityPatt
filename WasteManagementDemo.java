import java.util.*;

public class WasteManagementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WasteManagementSystem wasteSystem = new WasteManagementSystem();

        WasteContainer organicContainer = new WasteContainer("organic");
        WasteContainer recyclableContainer = new WasteContainer("recyclable");
        WasteContainer hazardousContainer = new WasteContainer("hazardous");

        while (true) {
            System.out.println("\n Waste Management System");
            System.out.println("1️ Organic Waste");
            System.out.println("2️ Recyclable Waste");
            System.out.println("3️ Hazardous Waste");
            System.out.println("4️ Exit");
            System.out.print(" Choose a waste type (1-3) or 4 to exit: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            WasteContainer selectedContainer = null;
            switch (choice) {
                case 1:
                    selectedContainer = organicContainer;
                    break;
                case 2:
                    selectedContainer = recyclableContainer;
                    break;
                case 3:
                    selectedContainer = hazardousContainer;
                    break;
                case 4:
                    System.out.println("👋 Exiting Waste Management System...");
                    scanner.close();
                    return;
                default:
                    System.out.println("❌ Invalid choice! Try again.");
                    continue;
            }

            System.out.print("Enter 'full' if the container is full or press Enter to skip: ");
            String status = scanner.nextLine().trim();
            if (status.equalsIgnoreCase("full")) {
                selectedContainer.setFull(true);
                wasteSystem.processWaste(selectedContainer);
            } else {
                System.out.println("✅ No action needed for this container.\n");
            }
        }
    }
}