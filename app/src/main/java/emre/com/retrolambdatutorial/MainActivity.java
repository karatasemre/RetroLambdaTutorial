package emre.com.retrolambdatutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.Toast;

import com.annimon.stream.Collectors;
import com.annimon.stream.Stream;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import emre.com.retrolambdatutorial.adapter.UsersAdapter;
import emre.com.retrolambdatutorial.data.UserService;
import emre.com.retrolambdatutorial.model.User;

import static emre.com.retrolambdatutorial.utils.ConverterManager.logString;

public class MainActivity extends AppCompatActivity {

    //Butter Knife
    @BindView(R.id.button_filter)
    Button filter;
    @BindView(R.id.button_filter_one_name)
    Button filterOneName;
    @BindView(R.id.button_filter_one_surname)
    Button filterOneSurname;
    @BindView(R.id.button_sort_by_name)
    Button sortByName;
    @BindView(R.id.button_sort_by_surname)
    Button sortBySurname;
    @BindView(R.id.button_map_by_name)
    Button mapByName;

    @BindView(R.id.main_recycler_view)
    RecyclerView recyclerView;

    private UsersAdapter usersAdapter;

    List<User> userList = new ArrayList<>();

    List<User> newList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        usersAdapter = new UsersAdapter();
        recyclerView.setAdapter(usersAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        userList = UserService.getUsers();
        showUsers(userList);

        // RetroLambda expressions
        filter.setOnClickListener(v -> {
            userList = UserService.getUsers();
            newList = Stream.of(userList).filter(p -> p.getId() > 11).collect(Collectors.toList());
            showUsers(newList);
        });

        filterOneName.setOnClickListener(v -> {
            userList = UserService.getUsers();
            newList = Stream.of(userList).filter(p -> p.getName().contains("Ayşe")).collect(Collectors.toList());
            showUsers(newList);
        });

        filterOneSurname.setOnClickListener(v -> {
            userList = UserService.getUsers();
            newList = Stream.of(userList).filter(p -> p.getSurname().contains("Çelik")).collect(Collectors.toList());
            showUsers(newList);
        });

        sortByName.setOnClickListener(v -> {
            userList = UserService.getUsers();
            newList = Stream.of(userList).sortBy(User::getName).collect(Collectors.toList());
            showUsers(newList);
        });

        sortBySurname.setOnClickListener(v -> {
            userList = UserService.getUsers();
            newList = Stream.of(userList).sortBy(User::getSurname).collect(Collectors.toList());
            showUsers(newList);
        });

    }

    public void showUsers(List<User> items) {
        usersAdapter.setUsers(items);
        usersAdapter.notifyDataSetChanged();
    }


    //ButterKnife OnClick Method
    @OnClick(R.id.button_map_by_name)
    public void buttonMapByName() {
        userList = UserService.getUsers();
        List<String> onlyNameArray = Stream.of(userList).map(e -> e.getName()).collect(Collectors.toList());
        Toast.makeText(MainActivity.this, logString(onlyNameArray), Toast.LENGTH_LONG).show();
    }
}
