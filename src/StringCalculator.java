import java.util.Scanner;

public class StringCalculator {
    public static void main(String[] args) {
        System.out.println("계산할 값을 입력하세요. : ");
        Scanner scan = new Scanner(System.in);

        String value = scan.nextLine();
        String[] values = value.split(" "); // 받아온 문자열을 공백 기준으로 나눔

        int first = Integer.parseInt(values[0]); // 문자열로 된 첫번째 숫자를 int으로 변환

        int i = 1;
        int result = first;
        while(values.length > i){
            String symbol = values[i];
            int second = Integer.parseInt(values[i+1]); //2, 4, 6, ... 부분이 숫자

            result = Calculator.calculate(result, symbol, second);
            i += 2; // 1, 3, 5, ... 부분이 연산기호
        }
        System.out.println("총 결과 : " + result);
        scan.close();
    }
}
