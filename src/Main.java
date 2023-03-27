public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService(); // создание объекта
        int bodyMassIndex = service.calculate(98, 1.87); //вызов метода calculate
        System.out.println("Индекс массы тела равен: " + bodyMassIndex); // должно получиться 28
        System.out.println();
        System.out.println("Индекс массы тела равен: " + service.calculate(100, 1.82));// должно получиться 30
        System.out.println();
        System.out.println("Индекс массы тела равен: " + service.calculate(87, 1.71)); // должно получиться 29

    }
}