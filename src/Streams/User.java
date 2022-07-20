package Streams;

import java.util.List;

public class User {

    public Long user_id;
    public String name;
    public int cars;
    public List<String> email;

    public User(Long user_id,String name,int cars, List<String> email) {
        this.user_id = user_id;
        this.name = name;
        this.cars = cars;
        this.email = email;
    }

    public Long getUserId() {
        return user_id;
    }

    public String getName(){
        return name;
    }

    public int getCars() {
        return cars;
    }

    public List<String> getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
