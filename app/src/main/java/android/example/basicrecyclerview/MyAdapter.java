package android.example.basicrecyclerview;

import android.content.Context;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.OwnAdapter>
{
String[] Desc;
int[] images;
Context context;



  public   MyAdapter(Context ct,String[] d,int[] i)
  {
         Desc=d;
         images=i;
         context=ct;

  }


    @NonNull
    @Override
    public MyAdapter.OwnAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


      LayoutInflater inflater=LayoutInflater.from(context);
      View MyGroup = inflater.inflate(R.layout.row, viewGroup, false);
      return new OwnAdapter(MyGroup);


    }

    @Override
    public void onBindViewHolder(@NonNull final MyAdapter.OwnAdapter ownAdapter, int i)
    {
       ownAdapter.textDesc.setText(Desc[i]);
       ownAdapter.image.setImageResource(images[i]);


    }

    @Override
    public int getItemCount() {
        return Desc.length;
    }

    public  class OwnAdapter extends RecyclerView.ViewHolder
    {
      ImageView image;
        TextView textDesc;
        public OwnAdapter(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.imageView);
            textDesc=itemView.findViewById(R.id.textView);


        }











    }
}


