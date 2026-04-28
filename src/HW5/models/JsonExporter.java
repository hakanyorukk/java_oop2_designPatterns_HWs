package HW5.models;

import HW5.contracts.FileExporter;

public class JsonExporter implements FileExporter {

    @Override
    public String export(String fileName) {
        return "Json file exported: " + fileName + ".json";
    }
}
