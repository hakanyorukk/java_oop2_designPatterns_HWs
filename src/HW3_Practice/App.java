package HW3_Practice;

public class App {
    // fitnessCenter = same list singleton
    // instructor addProgram, ...
    // trainingProgram = builder
    // trainingType = enum


    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Hakan", "1234");

        instructor1.addProgram(new TrainingProgram.Builder(TrainingType.AEROBIC, 150, "Easy").build());
        instructor1.addProgram(new TrainingProgram.Builder(TrainingType.BALANCE, 120, "Medium")
                .isGroup(true)
                .numOfExercises(4)
                .build());

        System.out.println(FitnessCenter.getInstance().displayPrograms());
    }
}
