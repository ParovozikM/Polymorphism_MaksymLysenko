package add;

public class Main {
    // Інтерфейс для девайсів
    interface BasicPlatform {
        double calculateResult(double firstParam, double secondParam);
    }

    // Реалізація девайсу A
    static class DeviceTypeA implements BasicPlatform {
        @Override
        public double calculateResult(double firstParam, double secondParam) {
            return firstParam * secondParam;
        }
    }

    // Реалізація девайсу B
    static class DeviceTypeB implements BasicPlatform {
        private static final double CONSTANT = 1.5; // Константа

        @Override
        public double calculateResult(double firstParam, double secondParam) {
            double sum = firstParam + secondParam;
            return sum * CONSTANT;
        }
    }

