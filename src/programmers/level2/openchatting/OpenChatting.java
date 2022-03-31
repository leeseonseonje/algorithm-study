package programmers.level2.openchatting;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class OpenChatting {

    public static final String[] record = {"Enter uid1234 Muzi",
            "Enter uid4567 Prodo",
            "Leave uid1234",
            "Enter uid1234 Prodo",
            "Change uid4567 Ryan"};

    public static void main(String[] args) {

        List<Record> records = Arrays.stream(record)
                .map(r -> new Record(Command.from(stringSplit(r, 0)), stringSplit(r, 1), stringSplit(r, 2)))
                .collect(toList());

        Map<String, String> map = new HashMap<>();
        for (Record r : records) {
            if (r.getCommand() != Command.LEAVE) {
                map.put(r.getId(), r.getName());
            }
        }

        for (Record r : records) {
                r.setName(map.get(r.getId()));
        }

        List<String> result = new LinkedList<>();

        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getCommand() != Command.CHANGE) {
                result.add(records.get(i).getCommand().getCommandMessage().message(records.get(i).getName()));
            }
        }
        String[] z = result.toArray(new String[0]);
        Arrays.stream(z).forEach(System.out::println);
    }

    public static String stringSplit(String userRecord, int index) {
        if (userRecord.split(" ")[0].equals("Leave") && index == 2) {
            return "";
        }
        return userRecord.split(" ")[index];
    }
}

class Record {

    private Command command;
    private String id;
    private String name;

    public Record(Command command, String id, String name) {
        this.command = command;
        this.id = id;
        this.name = name;
    }

    public Command getCommand() {
        return command;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Record{" +
                "command=" + command +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

enum Command {
    ENTER("Enter", name -> name + "님이 들어왔습니다."),
    LEAVE("Leave", name -> name + "님이 나갔습니다."),
    CHANGE("Change", name -> "");

    private final String command;
    private final CommandMessage commandMessage;

    Command(String command, CommandMessage commandMessage) {
        this.command = command;
        this.commandMessage = commandMessage;
    }

    public CommandMessage getCommandMessage() {
        return commandMessage;
    }

    private static final Map<String, Command> map = Arrays.stream(values()).collect(toMap(e -> e.command, Function.identity()));

    public static Command from(String command) {
        String key = map.keySet().stream().filter(m -> m.contains(command)).findFirst().orElseThrow();

        return map.get(key);
    }
}

interface CommandMessage {
    String message(String name);
}
