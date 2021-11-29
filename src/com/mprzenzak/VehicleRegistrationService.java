package com.mprzenzak;

import java.util.*;

public class VehicleRegistrationService {
    private static final String MENU =
            "    M E N U   G Ł Ó W N E  \n" +
                    "1 - Zarejestuj nowy pojazd\n" +
                    "2 - Wyrejestruj pojazd\n" +
                    "3 - Modyfikuj dane pojazadu\n" +
                    "4 - Wyświetl bazę danych o pojazdach (HashSet)\n" +
                    "5 - Wyświetl bazę danych o pojazdach (TreeSet)\n" +
                    "6 - Wyświetl bazę danych o pojazdach (ArrayList)\n" +
                    "7 - Wyświetl bazę danych o pojazdach (LinkedList)\n" +
                    "8 - Wyświetl bazę danych o pojazdach (HashMap)\n" +
                    "9 - Wyświetl bazę danych o pojazdach (TreeMap)\n" +
                    "10 - Zabawa w porównywanie (tylko samochód)\n" +
                    "11 - Zabawa w porównywanie (tylko traktor)\n" +
                    "0 - Zakończ program\n";

    private static final String CHANGE_MENU =
            "   Co zmienić?     \n" +
                    "1 - Imię właściciela\n" +
                    "2 - Nazwisko właściciela\n" +
                    "3 - Moc silnika\n" +
                    "4 - Przebieg\n" +
                    "0 - Powrót do menu głównego\n";

    private static final Service UI = new Service();

    public static void main(String[] args) {
        VehicleRegistrationService application = new VehicleRegistrationService();
        application.runMainLoop();
    }

    private Car currentCar = null;
    private Tractor currentTractor = null;

    public void runMainLoop() {
        while (true) {
            UI.clearConsole();
            showcurrentCar();
            showcurrentTractor();
            switch (UI.enterInt(MENU + "==>> ")) {
                case 1:
                    String vehicleType = vehicleTypeSetter();
                    if (vehicleType.equals("car")) {
                        currentCar = createNewCar();
                    } else if (vehicleType.equals("tractor"))
                        currentTractor = createNewTractor();
                    break;
                case 2:
                    String vehicleType2 = vehicleTypeSetter();
                    if (vehicleType2.equals("car")) {
                        currentCar = null;
                        UI.printInfoMessage("Samochód został wyrejestrowany");
                    } else if (vehicleType2.equals("tractor")) {
                        currentTractor = null;
                        UI.printInfoMessage("Traktor został wyrejestrowany");
                    }
                    break;
                case 3:
                    String vehicleType3 = vehicleTypeSetter();
                    if (vehicleType3.equals("car")) {
                        changePersonData(currentCar);
                    } else if (vehicleType3.equals("tractor"))
                        changePersonDataTractor(currentTractor);
                    break;
                case 4:
                    String vehicleType4 = vehicleTypeSetter();
                    if (vehicleType4.equals("car")) {
                        try {
                            HashSet cars = currentCar.getHashSet();
                            for (Object car : cars) {
                                showCar((Car) car);
                                System.out.println("HashCode wyświetlanego pojazdu:");
                                System.out.println(car.hashCode());
                                System.out.println("\n");
                            }
                            System.out.println("Koniec bazy");
                        } catch (NullPointerException e) {
                            System.err.println("Brak pojazdów w bazie");
                        }
                    } else if (vehicleType4.equals("tractor")) {
                        try {
                            HashSet tractors = currentTractor.getHashSet();
                            for (Object tractor : tractors) {
                                showTractor((Tractor) tractor);
                                System.out.println("HashCode wyświetlanego pojazdu:");
                                System.out.println(tractor.hashCode());
                                System.out.println("\n");
                            }
                            System.out.println("Koniec bazy");
                        } catch (NullPointerException e) {
                            System.err.println("Brak pojazdów w bazie");
                        }
                    }
                    break;
                case 5:
                    String vehicleType5 = vehicleTypeSetter();
                    if (vehicleType5.equals("car")) {
                        try {
                            TreeSet cars = currentCar.getTreeSet();
                            for (Object car : cars) {
                                showCar((Car) car);
                                System.out.println("HashCode wyświetlanego pojazdu:");
                                System.out.println(car.hashCode());
                                System.out.println("\n");
                            }
                            System.out.println("Koniec bazy");
                        } catch (NullPointerException e) {
                            System.err.println("Brak pojazdów w bazie");
                        }
                    } else if (vehicleType5.equals("tractor")) {
                        try {
                            TreeSet tractors = currentTractor.getTreeSet();
                            for (Object tractor : tractors) {
                                showTractor((Tractor) tractor);
                                System.out.println("HashCode wyświetlanego pojazdu:");
                                System.out.println(tractor.hashCode());
                                System.out.println("\n");
                            }
                            System.out.println("Koniec bazy");
                        } catch (NullPointerException e) {
                            System.err.println("Brak pojazdów w bazie");
                        }
                    }
                    break;
                case 6:
                    String vehicleType6 = vehicleTypeSetter();
                    if (vehicleType6.equals("car")) {
                        try {
                            ArrayList cars = currentCar.getArrayList();
                            for (Object car : cars) {
                                showCar((Car) car);
                                System.out.println("HashCode wyświetlanego pojazdu:");
                                System.out.println(car.hashCode());
                                System.out.println("\n");
                            }
                            System.out.println("Koniec bazy");
                        } catch (NullPointerException e) {
                            System.err.println("Brak pojazdów w bazie");
                        }
                    } else if (vehicleType6.equals("tractor")) {
                        try {
                            ArrayList tractors = currentTractor.getArrayList();
                            for (Object tractor : tractors) {
                                showTractor((Tractor) tractor);
                                System.out.println("HashCode wyświetlanego pojazdu:");
                                System.out.println(tractor.hashCode());
                                System.out.println("\n");
                            }
                            System.out.println("Koniec bazy");
                        } catch (NullPointerException e) {
                            System.err.println("Brak pojazdów w bazie");
                        }
                    }
                    break;
                case 7:
                    String vehicleType7 = vehicleTypeSetter();
                    if (vehicleType7.equals("car")) {
                        try {
                            LinkedList cars = currentCar.getLinkedList();
                            for (Object car : cars) {
                                showCar((Car) car);
                                System.out.println("HashCode wyświetlanego pojazdu:");
                                System.out.println(car.hashCode());
                                System.out.println("\n");
                            }
                            System.out.println("Koniec bazy");
                        } catch (NullPointerException e) {
                            System.err.println("Brak pojazdów w bazie");
                        }
                    } else if (vehicleType7.equals("tractor")) {
                        try {
                            LinkedList tractors = currentTractor.getLinkedList();
                            for (Object tractor : tractors) {
                                showTractor((Tractor) tractor);
                                System.out.println("HashCode wyświetlanego pojazdu:");
                                System.out.println(tractor.hashCode());
                                System.out.println("\n");
                            }
                            System.out.println("Koniec bazy");
                        } catch (NullPointerException e) {
                            System.err.println("Brak pojazdów w bazie");
                        }
                    }
                    break;
                case 8:
                    String vehicleType8 = vehicleTypeSetter();
                    if (vehicleType8.equals("car")) {
                        try {
                            HashMap cars = currentCar.getHashMap();
                            cars.forEach((car, owner) -> {
                                System.out.println(car + ", którego właścicielem jest: " + owner);
                            });
                        } catch (NullPointerException e) {
                            System.err.println("Brak pojazdów w bazie");
                        }
                    } else if (vehicleType8.equals("tractor")) {
                        try {
                            HashMap tractors = currentTractor.getHashMap();
                            tractors.forEach((tractor, owner) -> {
                                System.out.println(tractor + ", którego właścicielem jest: " + owner);
                            });
                            System.out.println("Koniec bazy");
                        } catch (NullPointerException e) {
                            System.err.println("Brak pojazdów w bazie");
                        }
                    }
                    break;
                case 9:
                    String vehicleType9 = vehicleTypeSetter();
                    if (vehicleType9.equals("car")) {
                        try {
                            TreeMap cars = currentCar.getTreeMap();
                            cars.forEach((car, owner) -> {
                                System.out.println(car + ", którego właścicielem jest: " + owner);
                            });
                        } catch (NullPointerException e) {
                            System.err.println("Brak pojazdów w bazie");
                        }
                    } else if (vehicleType9.equals("tractor")) {
                        try {
                            TreeMap tractors = currentTractor.getTreeMap();
                            tractors.forEach((tractor, owner) -> {
                                System.out.println(tractor + ", którego właścicielem jest: " + owner);
                            });
                        } catch (NullPointerException e) {
                            System.err.println("Brak pojazdów w bazie");
                        }
                    }
                    break;
                case 10:
                    System.out.println("Utwórz nowy samochód");
                    currentCar = createNewCar();
                    if (currentCar.compareTo((Car) currentCar.getArrayList().get(0)) == 0) {
                        System.out.println("Ma taki sam przebieg jak pierwszy dodany samochód");
                    } else if (currentCar.compareTo((Car) currentCar.getArrayList().get(0)) != 0) {
                        System.out.println("Samochód ma inny przebieg niż pierwszy dodany samochód");
                    }
                    break;
                case 11:
                    System.out.println("Utwórz nowy traktor");
                    currentTractor = createNewTractor();
                    int powerDifference = currentTractor.compare(currentTractor, (Tractor) currentTractor.getArrayList().get(0));
                    System.out.println("Różnica pomiędzy mocą podanego traktora, a mocą pierwszego taktora w bazie: " + powerDifference);
                    break;
                case 0:
                    UI.printInfoMessage("\nProgram zakończył działanie!");
                    System.exit(0);
            }
        }
    }

    public static String vehicleTypeSetter() {
        System.out.println("Wybierz typ pojazdu(tractor albo car):");
        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.nextLine();
        return vehicleType;
    }

    void showcurrentCar() {
        showCar(currentCar);
    }

    public static Car createNewCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię właściciela: ");
        String first_name = scanner.nextLine();
        System.out.println("Podaj nazwisko właściciela: : ");
        String last_name = scanner.nextLine();
        Integer engine_power = UI.enterInt("Podaj moc silnika: ");
        Integer current_mileage = UI.enterInt("Podaj stan licznika: ");
        Car car;
        car = new Car(first_name, last_name, engine_power, current_mileage);
        HashSet hashSet = car.getHashSet();
        hashSet.add(car);
        TreeSet treeSet = car.getTreeSet();
        treeSet.add(car);
        ArrayList arrayList = car.getArrayList();
        arrayList.add(car);
        HashMap hashMap = car.getHashMap();
        hashMap.put(car, last_name);
        //TreeMap treeMap = car.getTreeMap();
        //treeMap.put(car, last_name);
        System.out.println("Czy chcesz dodać ten sam samochód drugi raz? Odpowiedz tak/nie");
        String response = scanner.nextLine();
        if (Objects.equals(response, "tak")) {
            hashSet.add(car);
        }
        return car;
    }

    static void changePersonData(Car car) {
        while (true) {
            UI.clearConsole();
            showCar(car);

            switch (UI.enterInt(CHANGE_MENU + "==>> ")) {
                case 1:
                    car.setOwnerFirstName(UI.enterString("Podaj imię właściciela: "));
                    break;
                case 2:
                    car.setOwnerLastName(UI.enterString("Podaj nazwisko właściciela: "));
                    break;
                case 3:
                    car.setEnginePower(UI.enterInt("Podaj moc silnika: "));
                    break;
                case 4:
                    car.setMileage(UI.enterInt("Podaj stan licznika: "));
                    break;
                case 0:
                    return;
            }
        }
    }

    private static void showTractor(Tractor tractor) {
        StringBuilder sb = new StringBuilder();

        if (tractor != null) {
            sb.append("Aktualny traktor: \n")
                    .append("Imię właściciela: ").append(tractor.getOwnerFirstName()).append("\n")
                    .append("Nazwisko właściciela: ").append(tractor.getOwnerLastName()).append("\n")
                    .append("Moc silnika: ").append(tractor.getEnginePower()).append("\n")
                    .append("Przebieg: ").append(tractor.getMileage()).append("\n");
        } else
            sb.append("Brak takiego pojazdu w bazie\n");
        UI.printMessage(sb.toString());
    }

    void showcurrentTractor() {
        showTractor(currentTractor);
    }

    public Tractor createNewTractor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię właściciela: ");
        String first_name = scanner.nextLine();
        System.out.println("Podaj nazwisko właściciela: : ");
        String last_name = scanner.nextLine();
        Integer engine_power = UI.enterInt("Podaj moc silnika: ");
        Integer current_mileage = UI.enterInt("Podaj stan licznika: ");
        Tractor tractor;
        tractor = new Tractor(first_name, last_name, engine_power, current_mileage);
        HashSet hashSet = tractor.getHashSet();
        hashSet.add(tractor);
        TreeSet treeSet = tractor.getTreeSet();
        treeSet.add(tractor);
        ArrayList arrayList = tractor.getArrayList();
        arrayList.add(tractor);
        HashMap hashMap = tractor.getHashMap();
        hashMap.put(tractor, last_name);
        TreeMap treeMap = tractor.getTreeMap();
        treeMap.put(tractor, last_name);
        System.out.println("Czy chcesz dodać ten sam traktor drugi raz? Odpowiedz tak/nie");
        String response = scanner.nextLine();
        if (Objects.equals(response, "tak")) {
            hashSet.add(tractor);
        }
        return tractor;
    }

    static void changePersonDataTractor(Tractor tractor) {
        while (true) {
            UI.clearConsole();
            showTractor(tractor);

            switch (UI.enterInt(CHANGE_MENU + "==>> ")) {
                case 1:
                    tractor.setOwnerFirstName(UI.enterString("Podaj imię właściciela: "));
                    break;
                case 2:
                    tractor.setOwnerLastName(UI.enterString("Podaj nazwisko właściciela: "));
                    break;
                case 3:
                    tractor.setEnginePower(UI.enterInt("Podaj moc silnika: "));
                    break;
                case 4:
                    tractor.setMileage(UI.enterInt("Podaj stan licznika: "));
                    break;
                case 0:
                    return;
            }
        }
    }

    private static void showCar(Car car) {
        StringBuilder sb = new StringBuilder();

        if (car != null) {
            sb.append("Aktualny samochód: \n")
                    .append("Imię właściciela: ").append(car.getOwnerFirstName()).append("\n")
                    .append("Nazwisko właściciela: ").append(car.getOwnerLastName()).append("\n")
                    .append("Moc silnika: ").append(car.getEnginePower()).append("\n")
                    .append("Przebieg: ").append(car.getMileage()).append("\n");
        } else
            sb.append("Brak takiego pojazdu w bazie\n");
        UI.printMessage(sb.toString());
    }
}