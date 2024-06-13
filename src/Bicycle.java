public class Bicycle extends Transport {

    public Bicycle (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public void check(Bicycle bicycle){
    if (bicycle != null) {
        System.out.println("Обслуживаем велосипед" + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }
}
