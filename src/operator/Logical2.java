package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        //a는 10보다 크고 20보다 작다
        //boolean result = a > 10 && a < 20;
        boolean result = 10 < a && a < 20; //조금 더 가독성이 좋도록 작성할 수 있다
        System.out.println("result = " + result);
    }
}
