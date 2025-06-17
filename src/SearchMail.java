import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SearchMail implements SearchMailInterface{
    public void findMailInFile(String mail) throws IOException  {
        File file = new File("src/mailList.txt");
        Scanner sc = new Scanner(file);

        boolean found = false;

        while (sc.hasNextLine()){
            String fileLine = sc.nextLine();
            if (fileLine.equals(mail)){
                found = true;
            }
        }

        if(found == true){
            System.out.println(mail + " found!");
        }else{
            System.out.println("Not found, but added as new line");
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append("\n" + mail);
            fileWriter.close();
        }
    }

    public void findMailInFile(String filename, String mail) {
        File file = new File("src/" + filename + ".txt");
        if(file.exists()){

            try{
                Scanner sc = new Scanner(file);

                boolean found = false;

                while (sc.hasNextLine()){
                    String fileLine = sc.nextLine();
                    if (fileLine.equals(mail)){
                        found = true;
                    }
                }

                if(found == true){
                    System.out.println(mail + " found!");
                }else{
                    System.out.println("Not found");
                }

            }catch (IOException e){
                System.out.println(e);
            }
        }else{
            System.out.println("File not found");
        }
    }
}
