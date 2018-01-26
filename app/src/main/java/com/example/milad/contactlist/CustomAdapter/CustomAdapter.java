package com.example.milad.contactlist.CustomAdapter;


import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.milad.contactlist.MainActivity;
import com.example.milad.contactlist.Model.ContactModel;
import com.example.milad.contactlist.R;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter{

    private Context context;
    private ArrayList<ContactModel> data;
    private LayoutInflater inflater;


    public CustomAdapter(Context context, ArrayList<ContactModel> data) {
        this.context = context ;
        this.data = data;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override

    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public static class viewHolder{

        public TextView txtName;
        public TextView txtNum;
        public ImageView imgContact;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vi = convertView;
        viewHolder holder = new viewHolder();
        if(vi == null) {
            vi = inflater.inflate(R.layout.contactmodel, null);
            holder.imgContact= (ImageView) vi.findViewById(R.id.imgContact);
            holder.txtName = (TextView) vi.findViewById(R.id.txtName);
            holder.txtNum = (TextView) vi.findViewById(R.id.txtNum);

        }else
            holder = (viewHolder) vi.getTag();

        if(data.size()>0)
        {
            ContactModel tempValue = data.get(position);
            holder.txtName.setText(tempValue.getName());
            holder.txtNum.setText(tempValue.getNumber());


            String uri = "@/drawable/"+ tempValue.getImag();
            int imageResource = context.getResources().getIdentifier(uri,null,context.getPackageName());
            holder.imgContact.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),imageResource,null));

        }
        return vi;
    }
}
