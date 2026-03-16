package HW3_Practice;
// builder
public class TrainingProgram {
    private TrainingType trainingType;
    private int duration;
    private String difficultyLevel;
    private int numOfExercises;
    private boolean isGroup;
    private boolean isIndividual;

    private TrainingProgram(Builder builder) {
        this.trainingType = builder.trainingType;
        this.duration = builder.duration;
        this.difficultyLevel = builder.difficultyLevel;
        this.numOfExercises = builder.numOfExercises;
        this.isGroup = builder.isGroup;
        this.isIndividual = builder.isIndividual;
    }

    // toString()
    @Override
    public String toString() {
        return "TrainingProgram{" +
                "trainingType=" + trainingType +
                ", duration=" + duration +
                ", difficultyLevel='" + difficultyLevel + '\'' +
                ", numOfExercises=" + numOfExercises +
                ", isGroup=" + isGroup +
                ", isIndividual=" + isIndividual +
                '}';
    }

    public static class Builder {
        private TrainingType trainingType;
        private int duration;
        private String difficultyLevel;
        private int numOfExercises;
        private boolean isGroup;
        private boolean isIndividual;

        public Builder(TrainingType trainingType, int duration, String difficultyLevel) {
            this.trainingType = trainingType;
            this.duration = duration;
            this.difficultyLevel = difficultyLevel;
        }

        public Builder numOfExercises(int numOfExercises) {
            this.numOfExercises = numOfExercises;
            return this;
        }

        public Builder isGroup(boolean isGroup) {
            this.isGroup = isGroup;
            return this;
        }

        public Builder isIndividual(boolean isIndividual) {
            this.isIndividual = isIndividual;
            return this;
        }

        public TrainingProgram build() { return new TrainingProgram(this);}
    }


}
