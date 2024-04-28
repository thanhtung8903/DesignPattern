
public class ConcreteHouseBuilder implements HouseBuilder {

    private House house = new House();

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete Foundation");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Concrete Walls");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete Roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Modern Interior");
    }

    @Override
    public House getResult() {
        return house;
    }

}
