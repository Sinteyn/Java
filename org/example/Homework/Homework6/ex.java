package org.example.Homework.Homework6;

import org.example.Homework.Homework6.model.Laptop;

import java.util.*;

public class ex {
    public static void main(String[] args) {
        Set<Laptop> laptopSet = new HashSet<>();
        Laptop laptop1 = new Laptop("Apple", "MacBook Air", 83699.0,
                "серый", 13.3, false, "macOS", "2560x1600",
                "IPS", "Apple M1", 8, 3.2, 8, true,
                256, "Apple M1 7-core");
        Laptop laptop2 = new Laptop("MSI", "Katana", 62999.0,
                "черный", 17.3, true, "без ОС", "1920x1080",
                "IPS", "Intel Core i5", 6, 2.7, 16, true,
                512, "GeForce GTX 1650");
        Laptop laptop3 = new Laptop("HUAWEI", "MateBook D 14 NbD-WDH9", 49999.0,
                "серебристый", 14.0, false, "Windows 11",
                "1920x1080", "IPS", "Intel Core i5", 4,
                2.4, 8, true, 512, "Intel Iris Xe Graphics");
        Laptop laptop4 = new Laptop("Echips", "Envy", 28999.0, "серебристый",
                15.6, false, "Windows 10", "1920x1080",
                "IPS", "Intel Celeron", 4, 2.0, 8, true,
                240, "Intel UHD Graphics 600");
        Laptop laptop5 = new Laptop("DEXP", "Aquilon", 18499.0, "серебристый",
                15.6, false, "Windows 11 Home", "1920x1080",
                "IPS", "Intel Celeron", 2, 1.1, 8, true,
                128, "Intel UHD Graphics 600");
        Laptop laptop6 = new Laptop("MSI", "Titan", 479999.0, "черный",
                17.3, true, "Windows 11 Home Single Language",
                "3840x2160", "IPS", "Intel Core i9", 24,
                2.2, 32, true, 2000, "GeForce RTX 4090");

        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        laptopSet.add(laptop5);
        laptopSet.add(laptop6);

        selectionLaptops(laptopSet, criterion());

    }

    public static Map<String, String> criterion() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> options = new HashMap<>(Map.of(1, "ram",
                2, "rom",
                3, "os",
                4, "color",
                5, "manufacturer",
                6, "price",
                7, "screenDiagonal",
                8, "gaming",
                9, "cpuFrequency",
                10, "cpuCores"));

        Map<String, String> result = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");

        for (Integer key : options.keySet()) {
            System.out.println(key + " - " + options.get(key));
        }

        System.out.println("Для окончания введите 0");

        int num = scanner.nextInt();

        while (num != 0) {
            System.out.println("Введите минимальное значение для " + options.get(num));
            String value = scanner.next();
            result.putIfAbsent(options.get(num), value);
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            num = scanner.nextInt();
        }

        return result;
    }

    public static void selectionLaptops(Set<Laptop> laptops, Map<String, String> criterion) {
        Set<Laptop> result = new HashSet<>(Set.copyOf(laptops));
        for (Laptop lap : laptops) {
            if (criterion.containsKey("manufacturer")) {
                if (!lap.getManufacturer().contains(criterion.get("manufacturer")))
                    result.remove(lap);
            }
            if (criterion.containsKey("ram")) {
                if (!(lap.getRam() >= (Integer.parseInt(criterion.get("ram")))))
                    result.remove(lap);
            }
            if (criterion.containsKey("rom")) {
                if (!(lap.getRom() >= (Integer.parseInt(criterion.get("rom")))))
                    result.remove(lap);
            }
            if (criterion.containsKey("os")) {
                if (!lap.getOs().contains(criterion.get("os")))
                    result.remove(lap);
            }
            if (criterion.containsKey("color")) {
                if (!lap.getColor().contains(criterion.get("color")))
                    result.remove(lap);
            }
            if (criterion.containsKey("price")) {
                if (!(lap.getPrice() >= (Double.parseDouble(criterion.get("price")))))
                    result.remove(lap);
            }
            if (criterion.containsKey("screenDiagonal")) {
                if (!(lap.getScreenDiagonal() >= (Double.parseDouble(criterion.get("screenDiagonal")))))
                    result.remove(lap);
            }
            if (criterion.containsKey("gaming")) {
                if (!(lap.getGaming().equals(Boolean.parseBoolean(criterion.get("gaming")))))
                    result.remove(lap);
            }
            if (criterion.containsKey("cpuFrequency")) {
                if (!(lap.getCpuFrequency() >= (Double.parseDouble(criterion.get("cpuFrequency")))))
                    result.remove(lap);
            }
            if (criterion.containsKey("cpuCores")) {
                if (!(lap.getCpuCores() >= (Integer.parseInt(criterion.get("cpuCores")))))
                    result.remove(lap);
            }
        }
        for (Laptop lap : result) {
            System.out.println(lap);
        }
    }
}
