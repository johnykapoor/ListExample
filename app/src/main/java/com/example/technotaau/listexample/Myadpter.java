package com.example.technotaau.listexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by technotaau on 17/1/17.
 */                                                                               // android hive.in
                                                                                 // https://android--code.blogspot.in
public class Myadpter extends RecyclerView.Adapter<Myadpter.Myholder> {
Context context;

  String[] product = {"iphone_4", "iphone_4s", "iphone_5", "iphone_5s","iphone_6","iphone_6s","iphone_7"};
    String[] prise = {"100", "200", "300", "400","500","600","700"};

 //  int[] q ={1,0,3,0,5,6,7};
    int imageId[] ={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    int i1 ,i2,i3,i4,i5,i6,i7;
    int i;
    int[] val =new int[product.length];

    public Myadpter(Context mcontext){

        context =mcontext;


    }




    @Override
    public Myholder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater =LayoutInflater.from(context);
       View v = inflater.inflate(R.layout.list_item,parent,false);

       Myholder mh = new Myholder(v);


        return mh;
    }

    @Override
    public void onBindViewHolder(final Myholder holder, final int position) {




          holder.iv.setImageResource(imageId[position]);
            holder.tv1.setText(product[position]);

          holder.tv2.setText(prise[position]);


          holder.b1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  int pos = position;
                  if (val[pos] >= 1) {
                      val[pos] = val[pos] - 1;
                      holder.tv3.setText("" + val[pos]);
                  }
              }
          });


          holder.b2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  int pos = position;


                  switch (pos) {
                      case 0:
                          val[pos] = val[pos] + 1;


                          holder.tv3.setText("" + val[pos]);
                          break;
                      case 1:
                          val[pos] = val[pos] + 1;


                          holder.tv3.setText("" + val[pos]);
                          break;
                      case 2:
                          val[pos] = val[pos] + 1;


                          holder.tv3.setText("" + val[pos]);
                          break;
                      case 3:
                          val[pos] = val[pos] + 1;


                          holder.tv3.setText("" + val[pos]);
                          break;
                      case 4:
                          val[pos] = val[pos] + 1;


                          holder.tv3.setText("" + val[pos]);
                      case 5:
                          val[pos] = val[pos] + 1;


                          holder.tv3.setText("" + val[pos]);
                          break;
                      case 6:
                          val[pos] = val[pos] + 1;


                          holder.tv3.setText("" + val[pos]);
                          break;
                      default:
                          break;
                      //  i = i + 1;

                      //  holder.tv3.setText("");

                  }
              }
          });




    }

    @Override
    public int getItemCount() {
        return product.length;
    }


    public class  Myholder extends RecyclerView.ViewHolder{


        ImageButton b1,b2;
        TextView tv1,tv2,tv3;
        ImageView iv;

        public Myholder(View view){
            super(view);

            b1 =(ImageButton) view.findViewById(R.id.minus);
            b2 =(ImageButton) view.findViewById(R.id.pluse);
            tv1 =(TextView)view.findViewById(R.id.pname);
            tv2 =(TextView)view.findViewById(R.id.prise);
            tv3 =(TextView)view.findViewById(R.id.quantity);
            iv =(ImageView)view.findViewById(R.id.productiv);

        }


    }



}
