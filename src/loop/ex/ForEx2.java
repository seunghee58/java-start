package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        //반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요. 이때, num 이라는 변수를 사용하여 수를 표현해야 합니다. - for문 사용

        for (int num = 2, count = 1; count <= 10; num += 2,count++) {
            System.out.println(num);
        }
    }
}
