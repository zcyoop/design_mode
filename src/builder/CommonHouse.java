package builder;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        this.house.setBase("5m");
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        this.house.setWall("10m");
        System.out.println("普通房子砌砖10m");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("普通屋顶");
        System.out.println("普通房子建造普通屋顶");
    }
}
