package emre.com.retrolambdatutorial.data;

import java.util.ArrayList;
import java.util.List;

import emre.com.retrolambdatutorial.model.User;

/**
 * Created by Emre.Karatas on 12.10.2018.
 */

public class UserService {

    //DummyData
    public static List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Emre", "Karataş"));
        userList.add(new User(2, "Mustafa", "Sar"));
        userList.add(new User(3, "Ayşegül", "Soykan"));
        userList.add(new User(4, "Nilay", "Berk"));
        userList.add(new User(5, "Ferdi", "Süleymanoğlu"));
        userList.add(new User(6, "Tuğçe", "Yılmaz"));
        userList.add(new User(7, "Emrah", "Fert"));
        userList.add(new User(8, "Mustafa", "Öztürk"));
        userList.add(new User(9, "Tuğçe", "Fert"));
        userList.add(new User(10, "Tarık", "Fert"));
        userList.add(new User(11, "Nilay", "Düzen"));
        userList.add(new User(12, "Sinan", "Özen"));
        userList.add(new User(13, "Ayşe", "Düzenli"));
        userList.add(new User(14, "Ferdi", "Rahat"));
        userList.add(new User(15, "Ayşe", "Filmci"));
        userList.add(new User(16, "Sinan", "Ayıboğan"));
        userList.add(new User(17, "Tuğçe", "Öztürk"));
        userList.add(new User(18, "Tarık", "Çelik"));
        userList.add(new User(19, "Emre", "Soykan"));
        userList.add(new User(20, "Ayşe", "Çelik"));
        userList.add(new User(21, "Emre", "Çelik"));
        userList.add(new User(22, "Ayşe", "Karataş"));
        userList.add(new User(23, "Nilay", "Filmci"));
        userList.add(new User(24, "Ferdi", "Çalık"));
        userList.add(new User(25, "Ayşe", "Rahat"));
        userList.add(new User(26, "Tuğçe", "Öztürk"));
        userList.add(new User(27, "Ayşe", "Filmci"));
        userList.add(new User(28, "Nilay", "Ayıboğan"));
        userList.add(new User(29, "Sinan", "Özen"));

        return userList;
    }
}
