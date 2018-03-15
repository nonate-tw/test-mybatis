import com.mkyong.helloworld.pojo.User;

import java.util.List;

public interface UserMapper {

    void addUser(User user);
    List<User> getUsers();
}