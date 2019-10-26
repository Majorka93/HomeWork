package users;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class UserDao {
    private File file;

    public UserDao(String pathToFile){
        this.file = new File(pathToFile);
    }

    public UserDao(File file){
        this.file = file;
    }

    public void save(User user) throws IOException {
        if (file.exists()){
            FileWriter writer = new FileWriter(file, true);
            writer.append(user.toString());
            writer.append('\n');
            writer.flush();
        }else{
            throw new FileNotFoundException("File not found");
        }


    }
}
