package creational.builder.Approach1;

public class Main
{
    public static void main(String[] args) {

        UserExamParameters parameters = new UserExamParameters();

        parameters.englishMarks = 20;
        //parameters.englishMarks = 120;
        parameters.name = "Harshita";

        UserExam userExam;

        try{
            userExam = new UserExam(parameters);
        }catch (Exception exception){
            System.out.println("Some Parameters are Wrong");
        }
    }
}
