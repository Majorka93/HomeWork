package users;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserApp {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\Professional\\Desktop\\dede");
        List<File> files = Arrays.asList(dir.listFiles());
        List<UserDao> daoList = new ArrayList<>();

        for (File file : files) {
            daoList.add(new UserDao(file));
        }
        User alex = new User("Алеша", "Демин", "Александрович", 893766655500L);
        User innok = new User("Иннокентий", "Демин", "Александрович", 893766655510L);
        List<User> userList = new ArrayList<>();
        userList.add(alex);
        userList.add(innok);

        for (var user : userList) {
            try {
                for (var dao : daoList) {
                    dao.save(user);
                }
            } catch (FileNotFoundException e) {
                for (var file : files) {
                    file.createNewFile();
                }
                for (var dao : daoList) {
                    dao.save(user);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
