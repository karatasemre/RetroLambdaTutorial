package emre.com.retrolambdatutorial.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import emre.com.retrolambdatutorial.R;
import emre.com.retrolambdatutorial.model.User;

/**
 * Created by Emre.Karatas on 10.10.2018.
 */

public class UsersViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.user_id)
    TextView userId;
    @BindView(R.id.user_name)
    TextView userName;
    @BindView(R.id.user_surname)
    TextView userSurname;

    public UsersViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(User item) {
        userId.setText(item.getId()+"");
        userName.setText(item.getName());
        userSurname.setText(item.getSurname());
    }
}
