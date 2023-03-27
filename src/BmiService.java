public class BmiService {
    public int calculate(int weightKg, double heightMetre) {
        double index = weightKg / (Math.pow(heightMetre, 2)); //метод считает индекс
        int bmi = (int) index; // приведение типов
        return bmi;

    }
}
