public class Main {

    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();

        HouseDirector director = new HouseDirector(builder);

        director.constructHouse();

        House house = builder.getResult();

        house.showHouseDetails();
    }
}
