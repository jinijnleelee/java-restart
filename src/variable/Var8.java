package variable;

public class Var8 {

    public static void main(String[] args) {
        //정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // - 2,147,483,648 ~ 2,147,483,647

        long l = 9223372036854775807L;
        //long은 리터럴뒤에 L을 쓴다 소문자도 되지만 숫자1처럼 보이기때문에 대문자 사용권장

        //실수
        float f = 10.0f;
        //float은 리터럴뒤에 f붙임
        double d = 10.0;

        //실무에서 자주 사용 하는 타입
        //정수 int, long
        //정수는 대부분 int 20억이 넘어갈거같으면 long
        //실수 double
        //boolean : true, flase 조건문에 주로 사용
        //문자열 : String 문자를 다룰때는 문자 하나든 문자열이든 아무튼 String 사용
        //byte는 간혹 파일전송시 사용




    }
}
