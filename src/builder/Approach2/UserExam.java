package builder.Approach2;

import java.security.InvalidParameterException;

public class UserExam {

    private int englishMarks;
    private int mathMarks;
    private int scienceMarks;
    private String name;

    private UserExam() {
    }

    public static UserExamBuilder getBuilder() {
        return new UserExamBuilder();
    }

    public static class UserExamBuilder {
        private int englishMarks = 10;
        private int mathMarks = 10;
        private int scienceMarks = 10;
        private String name = "EMPTY";

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public UserExamBuilder setMathMarks(int mathMarks) {
            this.mathMarks = mathMarks;
            return this;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserExam build() {
            //Step - 1 : Validates
            if (mathMarks > 100 || englishMarks > 100 || scienceMarks > 100) {
                throw new InvalidParameterException("Marks can't be greater than 100");
            }

            if (mathMarks + scienceMarks > 150) {
                throw new InvalidParameterException("Maths + Science cant be > 150");
            }

            if (name.startsWith("0")) {
                throw new InvalidParameterException("Name can't start with 0");
            }

            //Step - 2 : Create Constructor
            UserExam userExam = new UserExam();

            userExam.englishMarks = englishMarks;
            userExam.mathMarks = mathMarks;
            userExam.scienceMarks = scienceMarks;
            userExam.name = name;

            return userExam;
        }
    }

}
