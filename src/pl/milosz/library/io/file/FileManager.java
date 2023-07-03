package pl.milosz.library.io.file;

import pl.milosz.library.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}