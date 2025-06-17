import java.io.IOException;

public interface SearchMailInterface {
    public void findMailInFile(String mail) throws IOException;
    public void findMailInFile(String filename, String mail) throws IOException;
}
