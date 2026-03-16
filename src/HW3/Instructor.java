package HW3;

public class Instructor {
    private String name;
    private String phoneNumber;
    private FitnessCenter center;

    public Instructor(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.center = FitnessCenter.getInstance();
    }

    public void addProgram(TrainingProgram program) {
        center.addProgram(program);
    }

    public void removeProgram(TrainingProgram program) {
        center.removeProgram(program);
    }

    public void showPrograms() {
        center.showPrograms();
    }
}
