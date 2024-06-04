package builder.Approach1;

import java.security.InvalidParameterException;

public class UserExam {

    private int englishMarks;
    private int mathMarks;
    private int scienceMarks;
    private String name;

    public UserExam(UserExamParameters userExamParameters)
    {
        if(userExamParameters.mathMarks > 100 || userExamParameters.englishMarks > 100 ||
            userExamParameters.scienceMarks > 100)
        {
            throw new InvalidParameterException("Marks can't be greater than 100");
        }

        if(userExamParameters.mathMarks + userExamParameters.scienceMarks > 150)
        {
            throw new InvalidParameterException("Maths + Science cant be > 150");
        }

        if(userExamParameters.name.startsWith("0"))
        {
            throw new InvalidParameterException("Name can't start with 0");
        }

        this.englishMarks = userExamParameters.englishMarks;
        this.mathMarks = userExamParameters.mathMarks;
        this.scienceMarks = userExamParameters.scienceMarks;
        this.name = userExamParameters.name;
    }
}
