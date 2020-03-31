package DesignPattern.MEthodFactory;

public class BankFactory {

    private BankFactory(){}; // ko cho tao thể hiện ở singleTon design pattern

    public static final Bank getBank(BankType bankType){

        switch (bankType){
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new VietComBank();
            default:
                throw  new IllegalArgumentException("No Bank ref");
        }
    }
}
