package emre.com.retrolambdatutorial.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import emre.com.retrolambdatutorial.R;
import emre.com.retrolambdatutorial.model.User;

/**
 * Created by Emre.Karatas on 12.10.2018.
 */

public class UsersAdapter extends RecyclerView.Adapter<UsersViewHolder> {
    private List<User> users;

    public UsersAdapter() {
        users = new ArrayList<>();
    }

    @Override
    public UsersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        final UsersViewHolder itemsViewHolder = new UsersViewHolder(v);

        return itemsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UsersViewHolder holder, int position) {
        holder.bind(users.get(position));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
