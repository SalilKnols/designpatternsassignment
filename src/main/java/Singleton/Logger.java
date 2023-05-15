package Singleton;

import java.io.FileWriter;
import java.io.IOException;


public class Logger {

    private static final Logger INSTANCE = new Logger();

    private FileWriter fileWriter;

    private Logger() {
        try {

            fileWriter = new FileWriter("log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Logger getInstance() {
        return INSTANCE;
    }


    public void log(String message) {
        try {
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
