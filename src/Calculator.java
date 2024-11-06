import java.util.Scanner;

public class Calculator {
    double add(double num, double num2) {
        return num + num2;
    }
    double sub(double num, double num2) {
        return num - num2;
    }
    double div(double num, double num2) {
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 있다 생각하나?");
            return 0;
        }
        return num / num2;
    }
    double dot(double num, double num2) {
        return num * num2;
    }
    public static void main(String[]args){
        Calculator calc = new Calculator();

        //메인화면
        Scanner sc = new Scanner(System.in);
        System.out.println("                                                                             ");
        System.out.println("****************************************************************************");
        System.out.println("@@@@@계산기@@@@@");
        System.out.println("****************************************************************************");
        System.out.println("                                                                             ");

        //숫자입력
        System.out.println("계산할 첫번째 숫자 적으쇼");//1번
        int num = sc.nextInt();

        System.out.println("계산할 두번째 숫자 적으쇼");//2번
        int num2 = sc.nextInt();


        //메뉴
        System.out.println("                                              ");
        System.out.println("계산식 메뉴 고르쇼 ( 1~4 )");
        System.out.println("1.더하기 ");
        System.out.println("2.빼기 ");
        System.out.println("3.나누기 ");
        System.out.println("4.곱하기 ");
        int mu = sc.nextInt();
        System.out.println("                                              ");


        switch(mu){
            case 1:
                System.out.println(num+" + "+num2+ " = "+calc.add(num, num2));
                break;
            case 2:
                System.out.println(num+" - "+num2+ " = "+calc.sub(num, num2));
                break;
            case 3:
                System.out.println(num+" / "+num2+ " = "+calc.div(num, num2));
                break;
            case 4:
                System.out.println(num+" x "+num2+ " = "+calc.dot(num, num2));
                break;

            default:
                System.out.println("                                              ");
                System.out.println("1~4까지 안고를 거면 치아라");
                System.out.println("                                              ");
                break;
        }


    }
}
