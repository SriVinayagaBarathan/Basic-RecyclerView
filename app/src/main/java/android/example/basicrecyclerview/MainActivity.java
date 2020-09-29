package android.example.basicrecyclerview;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView googleView;
    String[] descriptions;


    int[] images={R.drawable.classroom,R.drawable.docs,R.drawable.gmail,R.drawable.gpay,R.drawable.photos,R.drawable.slides,R.drawable.youtube};
    MyAdapter adapter;




    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        googleView=findViewById(R.id.recycleid);
        descriptions=getResources().getStringArray(R.array.desc);

        adapter=new MyAdapter(this,descriptions,images);

        googleView.setAdapter(adapter);
        googleView.setLayoutManager(new LinearLayoutManager(this));





        googleView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View view, int i, int i1, int i2, int i3)
            {

                Toast.makeText(MainActivity.this, "These are the official Applications of Google", Toast.LENGTH_SHORT).show();
            }
        });





    }


}