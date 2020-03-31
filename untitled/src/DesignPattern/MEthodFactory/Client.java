package DesignPattern.MEthodFactory;

public class Client {


    public static void main(String[] args) {

      Bank bank = BankFactory.getBank(BankType.VIETCOMBANK);
        System.out.println(bank.getBankName());

    }
}

//
//Một interface khác với một class ở một số điểm sau đây:
//
//        Bạn không thể khởi tạo một interface.
//        Một interface không chứa bất cứ hàm Contructor nào.
//        Tất cả các phương thức của interface đều là abstract.
//        Một interface không thể chứa một trường nào trừ các trường vừa static và final.
//        Một interface không thể kế thừa từ lớp, nó được triển khai bởi một lớp.
//        Một interface có thể kế thừa từ nhiều interface khác.