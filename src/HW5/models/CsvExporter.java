package HW5.models;

import HW5.contracts.FileExporter;

public class CsvExporter implements FileExporter {
    @Override
    public String export(String fileName) {
        return "Csv file exported: " + fileName + ".csv";
    }
}
