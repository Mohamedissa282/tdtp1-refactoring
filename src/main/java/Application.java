public class Application {
    public static void main(String[] args) {
        Car maVoiture = new Car("Sedan", "Bleu");
        Driver moi = new Driver("John", 20);

        moi.startCar(maVoiture);
        maVoiture.accelerate();
        moi.changeSpeed(maVoiture, 80);
        maVoiture.slowDown();
        moi.changeSpeed(maVoiture,30);
        moi.reachSpeed(maVoiture);
        System.out.println("fini");
    }
}
