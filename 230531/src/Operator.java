public class Operator {
    public static void main(String[] args){

        // 논리 부정 연산자
        boolean isRaining = true;

        if(isRaining){
            System.out.println("하늘에서 비가 와요.");
        }
        if(!isRaining){
          System.out.println("김태희가 안옵니다.");
        }

        boolean isSunny = false;

        if(!isSunny){
            System.out.println("날씨가 맑아용");

        }else{
            System.out.println("집에서 쉬어야죠");
        }

        // 증감 연산자
//        int x = 5;
//        int y = 5;
//
//        System.out.println("전위 증가 연산자 "+(++x));
//        System.out.println("후위 증가 연산자 "+(y++));
//
//        System.out.println("==================");
//        System.out.println("x는 "+x);
//        System.out.println("y는 "+y);

        //단항 연산자
//        int positive = 10;
//        int negative = -10;
//        System.out.println("양의 부호 연산자" + (+positive));
//        System.out.println("음의 부호 연산자" + (-positive));
//        System.out.println("양의 부호 연산자 반전" + (+negative));
//        System.out.println("음의 부호 연산자 반전" + (-negative));
    }
}
