package builder;

public class HouseDirector {

    HouseBuilder houseBuilder = null;

    //构造器传入HourBuilder
    public HouseDirector(HouseBuilder hb){
        this.houseBuilder = hb;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }
}
