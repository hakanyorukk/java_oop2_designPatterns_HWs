package HW3_Practice;

public class Instructor {

    private String name;
    private String phone;

    public Instructor(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void addProgram(TrainingProgram program) {
        FitnessCenter.getInstance().addProgram(program);
    }

    public void removeProgram(TrainingProgram program) {
        FitnessCenter.getInstance().removeProgram(program);
    }
    public void showAllPrograms() {
        System.out.println(FitnessCenter.getInstance().displayPrograms());
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
