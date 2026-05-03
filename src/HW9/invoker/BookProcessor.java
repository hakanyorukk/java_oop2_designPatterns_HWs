package HW9.invoker;

import HW9.contracts.Command;

import java.util.ArrayList;
import java.util.List;

public class BookProcessor {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public String process() {
        StringBuilder result = new StringBuilder();
        for(Command command: commands) {
            result.append(command.execute()).append("\n");
        }
        return result.toString();
    }
}
