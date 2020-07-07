package Company;

public class Modìy extends BaseActivationProcessor {

    public void test (){

        this.buildItemMasters();

    }

    @Override
    protected void buildWarehouseItem(){
    String b = "fds";

    }
}

class Run {
    public static void main(String[] args) {
        Modìy modify = new Modìy();

        modify.test();

    }
}

