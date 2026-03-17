package HW3;

public class TrainingProgram {
    private String name;
    private TrainingType type;
    private double duration;
    private String difficultyLevel;
    private int numOfSeries;
    private int numOfExercises;
    private ProgramFormat format;

    private TrainingProgram(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.duration = builder.duration;
        this.difficultyLevel = builder.difficultyLevel;
        this.numOfSeries = builder.numOfSeries;
        this.numOfExercises = builder.numOfExercises;
        this.format = builder.format;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", duration=" + duration +
                ", difficultyLevel='" + difficultyLevel + '\'' +
                ", numOfSeries=" + numOfSeries +
                ", numOfExercises=" + numOfExercises +
                ", format=" + format +
                '}';
    }

    public static class Builder {
        private String name;
        private TrainingType type;
        private double duration;
        private String difficultyLevel;
        private int numOfSeries;
        private int numOfExercises;
        private ProgramFormat format;

        public Builder(String name, TrainingType type, double duration) {
            this.name = name;
            this.type = type;
            this.duration = duration;
        }

        public Builder difficultyLevel(String difficultyLevel) {
            this.difficultyLevel = difficultyLevel;
            return this;
        }

        public Builder numOfSeries(int numOfSeries) {
            this.numOfSeries = numOfSeries;
            return this;
        }

        public Builder numOfExercises(int numOfExercises) {
            this.numOfExercises = numOfExercises;
            return this;
        }

        public Builder groupProgram(ProgramFormat format) {
            this.format = format;
            return this;
        }

        public TrainingProgram build() {
            return new TrainingProgram(this);
        }
    }

}
