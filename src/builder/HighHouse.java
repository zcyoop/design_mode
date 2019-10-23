package builder;

public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        this.house.setBase("10m");
        System.out.println("高层房子打地基10米");
    }

    @Override
    public void buildWalls() {
        this.house.setWall("20m");
        System.out.println("高层房子砌砖20m");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("高层屋顶");
        System.out.println("高层房子建造高层屋顶");
    }
}
