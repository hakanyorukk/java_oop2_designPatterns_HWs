package HW3;

public class App {
    public static void main(String[] args) {
        Instructor firstInstructor = new Instructor("Hakan", "123456789");
        Instructor secondInstructor = new Instructor("Yoruk", "123456789");

        TrainingProgram bodyBuilding = new TrainingProgram.Builder("GYM", TrainingType.RESISTANCE, 120)
                .groupProgram(ProgramFormat.INDIVIDUAL)
                .difficultyLevel("Hard")
                .numOfExercises(12)
                .build();

        TrainingProgram cardio = new TrainingProgram.Builder("Cardio", TrainingType.AEROBIC, 45)
                .numOfSeries(3)
                .groupProgram(ProgramFormat.INDIVIDUAL)
                .build();

        firstInstructor.addProgram(bodyBuilding);
        secondInstructor.addProgram(cardio);
        System.out.println(FitnessCenter.getInstance().showPrograms());

        //firstInstructor.showPrograms();
        //secondInstructor.showPrograms();

       // secondInstructor.removeProgram(cardio);
    }
}
