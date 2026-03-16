package HW3_Practice;

import java.util.ArrayList;
import java.util.List;

public class FitnessCenter {
    private static FitnessCenter instance;
    private List<TrainingProgram> trainingProgramList;

    private FitnessCenter () {
        this.trainingProgramList = new ArrayList<>();
    }

    public static FitnessCenter getInstance() {
        if(instance == null) {
            instance = new FitnessCenter();
        }
        return instance;
    }

    public void addProgram(TrainingProgram program) {
        trainingProgramList.add(program);
    }

    public void removeProgram(TrainingProgram program) {
        trainingProgramList.remove(program);
    }

    public String displayPrograms() {
        StringBuilder sb = new StringBuilder();

        for(TrainingProgram traning: trainingProgramList) {
            sb.append(traning).append("\n");
        }
        return sb.toString();
    }
}
