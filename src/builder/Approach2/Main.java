package builder.Approach2;

public class Main
{
    public static void main(String[] args) {

        UserExam userExam;

        try{
//            UserExam.UserExamBuilder userExamBuilder = UserExam.getBuilder();
//            userExamBuilder.setName("Harshita");
//            userExamBuilder.setEnglishMarks(45);
//            userExamBuilder.setMathMarks(50);



            //Method Chaining
            userExam = UserExam.getBuilder()
                    .setMathMarks(40)
                    .setEnglishMarks(20)
                    .setScienceMarks(70)
                    .build();


        }catch (Exception exception){
            System.out.println("Some Parameters are Wrong");
        }
    }
}
