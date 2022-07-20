package Streams;

import java.util.List;

public class User {

    public Long user_id;
    public String name;
    public List<String> email;

    public User(Long user_id,String name, List<String> email) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
    }

    public Long getUserId() {
        return user_id;
    }

    public String getName(){
        return name;
    }

    public List<String> getEmail() {
        return email;
    }
}
