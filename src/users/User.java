package users;

public class User {
    private String name;
    private String surname;
    private String patronymic;
    private long phoneNumber;
    public User (String name,String surname,String patronymic,long phoneNumber){
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.phoneNumber = phoneNumber;

    }


    @Override
    public String toString() {
        return name + ":" + surname + ":" + patronymic + ":" + phoneNumber;

    }

}
