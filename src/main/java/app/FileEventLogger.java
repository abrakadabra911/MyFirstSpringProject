package app;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileEventLogger implements EventLogger {

    String filename;
    File file;

    public FileEventLogger(){}

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    public void init() throws IOException {
        this.file = new File(filename);
        if(!file.canWrite()) {
            file.createNewFile();
            System.out.println("******** new log file is created! *********");
            throw new IOException();
        }
    }

    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file, event.toString() + "\n", true);
            System.out.println("FileEvent logger just logged to file");
        }
        catch (IOException e) {}
    }

    public void destroy() {
        System.out.println(" object FileEventLogger is destroyed.");
    }
}
