package homework_6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * LaptopMain
 */
public class LaptopMain {

    public static void main(String[] args) {
        Laptop laptop = new Laptop(3, 5, Color.BLACK, OperationSystem.LINUX);
        Laptop laptop1 = new Laptop(3, 5, Color.BLACK, OperationSystem.LINUX);
        Laptop laptop2 = new Laptop(3, 5, Color.BLACK, OperationSystem.LINUX);
        Laptop laptop3 = new Laptop(4, 55, Color.WHITE, OperationSystem.WINDOWS);
        Laptop laptop35 = new Laptop(74, 65, Color.RED, OperationSystem.macOS);

        HashSet<Laptop> set = new HashSet<>(Arrays.asList(laptop, laptop1, laptop2, laptop3, laptop35));
        for (Laptop laptop4 : set) {
            System.out.println(laptop4);
        }
        System.out.println();

        System.out.println("Enter the number corresponding to the required criterion: ");
        System.out.print("1 - RAM\n2 - Hard drive capacity\n3 - Color\n4 - Operating system");

        System.out.println();

        Map<Integer, Integer> criteria = getFilterCriteria(new Scanner(System.in));
        if (!criteria.isEmpty()) {
            System.out.println(criteria);
        }

        Set<Laptop> filteredLaptops = filterLaptops(set, criteria);
        for (Laptop laptopSearch : filteredLaptops) {
            System.out.println(laptopSearch);
        }

    }

    public static Map<Integer, Integer> getFilterCriteria(Scanner scanner) {
        Map<Integer, Integer> filterCriteria = new HashMap<>();

        while (true) {
            System.out.print("Enter filter criteria or 0 to complete: ");
            int criterion = scanner.nextInt();

            if (criterion == 0) {
                break;
            } else {
                int minValue = scanner.nextInt();
                filterCriteria.put(criterion, minValue);
            }
        }
        return filterCriteria;
    }

    public static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<Integer, Integer> criteria) {
        return laptops.stream()
                .filter(laptop -> {
                    if (criteria.containsKey(1)) {
                        switch ((criteria.get(1))) {
                            case 3:
                                return laptop.getRAM() >= 3;
                            case 4:
                                return laptop.getRAM() >= 4;
                            case 74:
                                return laptop.getRAM() >= 74;
                            default:
                                return true;
                        }
                    } else if (criteria.containsKey(2)) {
                        switch ((criteria.get(2))) {
                            case 5:
                                return laptop.getSDD() >= 5;
                            case 55:
                                return laptop.getSDD() >= 55;
                            case 65:
                                return laptop.getSDD() >= 65;
                            default:
                                return true;
                        }
                    } else if (criteria.containsKey(3)) {
                        switch ((criteria.get(3))) {
                            case 1:
                                return laptop.getColor() == Color.BLACK;
                            case 2:
                                return laptop.getColor() == Color.WHITE;
                            case 3:
                                return laptop.getColor() == Color.RED;
                            default:
                                return true;
                        }
                    } else {
                        switch ((criteria.get(4))) {
                            case 1:
                                return laptop.getOperationSystem() == OperationSystem.WINDOWS;
                            case 2:
                                return laptop.getOperationSystem() == OperationSystem.LINUX;
                            case 3:
                                return laptop.getOperationSystem() == OperationSystem.macOS;
                            default:
                                return true;
                        }
                    }
                })
                .collect(Collectors.toSet());
    }
}
