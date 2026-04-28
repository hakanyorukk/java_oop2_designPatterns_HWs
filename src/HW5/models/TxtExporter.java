package HW5.models;

import HW5.contracts.FileExporter;

public class TxtExporter implements FileExporter {
    @Override
    public String export(String fileName) {
        return "Txt file exported: " + fileName + ".txt";
    }
}
