public class ServiseStation {
    public static void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }

    public static void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            updateTyre();
        }
    }

    public static void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }

    public static void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}


