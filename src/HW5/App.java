package HW5;

import HW5.adapters.PdfAdapter;
import HW5.contracts.FileExporter;
import HW5.models.CsvExporter;
import HW5.models.JsonExporter;
import HW5.models.TxtExporter;

public class App {
    static void main(String[] args) {

        FileExporter file1 = new CsvExporter();
        System.out.println(file1.export("report1"));

        FileExporter file2 = new TxtExporter();
        System.out.println(file2.export("report2"));

        FileExporter file3 = new JsonExporter();
        System.out.println(file3.export("report3"));

        FileExporter file4 = new PdfAdapter();
        System.out.println(file4.export("report4"));
    }
}
