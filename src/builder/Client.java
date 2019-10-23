package builder;


/**
 * 建造者模式
 */
public class Client {

    public static void main(String[] args) {
        final CommonHouse houseBuilder = new CommonHouse();
        final HouseDirector houseDirector = new HouseDirector(houseBuilder);

        House house = houseDirector.constructHouse();
        System.out.println(house);

        final HighHouse highHouse = new HighHouse();
        houseDirector.setHouseBuilder(highHouse);

        house = houseDirector.constructHouse();
        System.out.println(house);
    }

}
