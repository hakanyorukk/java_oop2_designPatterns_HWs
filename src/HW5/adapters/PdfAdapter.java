package HW5.adapters;

import HW5.contracts.FileExporter;
import HW5.library.PdfLibrary;

public class PdfAdapter  implements FileExporter {

    PdfLibrary library = new PdfLibrary();

    @Override
    public String export(String fileName) {
        return library.generatePdf(fileName);
    }
}
