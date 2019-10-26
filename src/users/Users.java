package users;

public class Users {
    public static void main(String[] args) {
        String text = "Алеша:Демин:Александрович:893766655500";
        String[] array = text.split(":");
        User alex =  new User(array[0], array[1], array[2], Long.parseLong(array[3]));

        System.out.println(alex.toString());
    }
}
