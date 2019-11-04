package template;

/**
 * 抽象豆浆类
 */
abstract class SoyaBeanMilk {
    void make(){
        select();
        if (this.isAdd())
            add();
        soak();
        grind();
    }

    private void select(){
        System.out.println("选择大豆食材");
    }

    abstract void add();

    private void soak(){
        System.out.println("浸泡大豆");
    }

    private void grind(){
        System.out.println("研磨豆浆");
    }

    //钩子方法
    boolean isAdd(){
        return true;
    }
}
