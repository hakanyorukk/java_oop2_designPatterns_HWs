package HW3;

import java.util.HashSet;
import java.util.Set;

public class FitnessCenter {
    private static FitnessCenter instance;

    private Set<TrainingProgram> programs;

    private FitnessCenter() {
        this.programs = new HashSet<>();
    }

    public static FitnessCenter getInstance() {
        if(instance == null) {
            instance = new FitnessCenter();
        }
        return instance;
    }

    public void addProgram(TrainingProgram program) {
        programs.add(program);
    }

    public void removeProgram(TrainingProgram program) {
        programs.remove(program);
    }

    public String showPrograms() {
        StringBuilder sb = new StringBuilder("Training Programs = {");
        for(TrainingProgram program: programs) {
            sb.append(program).append("\n");
        }
        return sb.toString();
    }
}
