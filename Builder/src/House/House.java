package House;

class House {
  private String foundation;
  private String walls;
  private String roof;
  private String interior;

  public void setFoundation(String foundation) {
    this.foundation = foundation;
  }

  public void setWalls(String walls) {
    this.walls = walls;
  }

  public void setRoof(String roof) {
    this.roof = roof;
  }

  public void setInterior(String interior) {
    this.interior = interior;
  }

  public void showHouseDetails() {
    System.out.println("House Details:");
    System.out.println("Foundation: " + foundation);
    System.out.println("Walls: " + walls);
    System.out.println("Roof: " + roof);
    System.out.println("Interior: " + interior);
  }
}