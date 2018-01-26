package com.example.milad.contactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.milad.contactlist.CustomAdapter.CustomAdapter;
import com.example.milad.contactlist.Model.ContactModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    CustomAdapter adapter;
    ArrayList<ContactModel> contactModels = new ArrayList<ContactModel>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListData();
        list = (ListView) findViewById(R.id.LV);
        adapter = new CustomAdapter(this , contactModels);

        list.setAdapter(adapter);
    }

    void setListData(){

        contactModels.add(new ContactModel("img1","MrBahonar","0914....") );
        contactModels.add(new ContactModel("img2","MrBahgonar","0914....") );
        contactModels.add(new ContactModel("img3","MdfgrBahonar","0914....") );
        contactModels.add(new ContactModel("img4","MrBasdffghonar","0914....") );
        contactModels.add(new ContactModel("img7","MrBafgdhonar","0914....") );
        contactModels.add(new ContactModel("img6","MrBadfgfhonar","0914....") );


    }
}
