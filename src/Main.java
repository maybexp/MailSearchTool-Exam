import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        SearchMail searchMail = new SearchMail();

        searchMail.findMailInFile("mailList", "data1@cphbusiness.dk");
    }

}
