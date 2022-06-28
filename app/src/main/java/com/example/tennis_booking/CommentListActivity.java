package com.example.tennis_booking;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class CommentListActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Comment> commentArrayList;
    CommentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_list);
        listView = (ListView) findViewById(R.id.listItem);
        commentArrayList = new ArrayList<>();
        adapter = new CommentAdapter(this, R.layout.comment, commentArrayList);
        listView.setAdapter(adapter);
        for (int i = 0; i < 50; i++) {
            String name = "Hoang Lam";
            Calendar time = Calendar.getInstance();
            time.set(2000, 12, 31);
            Date date = time.getTime();
            SpannableStringBuilder comment = new SpannableStringBuilder();
            comment.append("do an ngon vcl :)))");
            comment.setSpan(
                    new ImageSpan(this, R.drawable.ic_baseline_gps_fixed_24),
                    comment.length() - 1,
                    comment.length(),
                    0
            );
            comment.append(" nen di 10d");
            int img = R.drawable.ic_launcher_background;
            int rating = 3;
            commentArrayList.add(new Comment(name,date,comment,img,rating));
        }
        adapter.notifyDataSetChanged();
    }
}
