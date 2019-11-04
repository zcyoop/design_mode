package template;

public class PureSoyaBeanMilk extends SoyaBeanMilk {
    @Override
    void add() {
        System.out.println(".......");
    }

    @Override
    boolean isAdd() {
        return false;
    }
}
