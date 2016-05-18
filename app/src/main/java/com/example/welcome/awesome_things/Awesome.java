package com.example.welcome.awesome_things;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;


public class Awesome extends Activity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awesome);
        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new sunilAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "item clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Awesome.this, Lin.class);
                intent.putExtra("id",position);
                startActivity(intent);
            }
        });
    }


    class sunilAdapter extends BaseAdapter {
        Context context;
        int images[] = new int[]{R.drawable.a,R.drawable.c,R.drawable.b,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p};

        public sunilAdapter(Context context) {
            this.context = context;
        }


        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return images[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        class ViewHolder {
            ImageView imageView;

            ViewHolder(View v) {

                imageView = (ImageView) v.findViewById(R.id.imageView);
            }

            @Override
            protected void finalize() throws Throwable {
                super.finalize();
            }
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            View row = view;
            ViewHolder holder;
            if (row == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(R.layout.fragment_main,parent,false);
                holder = new ViewHolder(row);
                row.setTag(holder);
            } else {
                holder = (ViewHolder) row.getTag();
            }
            holder.imageView.setId(images[position]);
            holder.imageView.setImageResource(images[position]);
            return row;
        }

    }


}