package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade = "F";

        switch(grade){

            case ("A"):
                System.out.println("grade: " +  '"'+ grade + '"' +  "\n 탁월한 성과입니다!");
                break;
            case ("B"):
                System.out.println("grade: " +  '"'+ grade + '"' +  "\n 좋은 성과입니다!");
                break;
            case ("C"):
                System.out.println("grade: " +  '"'+ grade + '"' +  "\n 준수한 성과입니다!");
                break;
            case ("D"):
                System.out.println("grade: " +  '"'+ grade + '"' +  "\n 향상이 필요합니다.");
                break;
            case ("F"):
                System.out.println("grade: " +  '"'+ grade + '"' +  "\n 불합격입니다.");
                break;
            default:
                System.out.println("grade: " +  '"'+ grade + '"' +  "\n 잘못된 학점입니다.");

        }

    }
}
