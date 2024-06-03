package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        /*
        반복문을 사용하여 1부터 max 까지의 합을 계산하고 출력하는 프로그램을 작성해 보세요. 이때, sum 이라는 변수를 사용하여 누적 합을 표현하고,
        i 라는 변수를 사용하여 카운트(1부터 max까지 증가하는 변수)를 수행해야 합니다. - while문 사용
        */
        int sum = 0;
        int i = 1;
        int max = 100;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println("max=" + i);
        System.out.println(sum);
    }
}
