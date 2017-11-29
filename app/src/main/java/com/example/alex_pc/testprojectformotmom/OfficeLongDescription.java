package com.example.alex_pc.testprojectformotmom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class OfficeLongDescription extends AppCompatActivity {

    private int porsition;
    ImageView imageView;
    TextView textName, textAddress, textDescription;
    public static List<OfficesList> officesLists;
    String addreses = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.office_long_description);

        officesLists = new ArrayList<>();
        officesLists.addAll(MainActivity.post);

        porsition = getIntent().getIntExtra("position", 100);

        imageView = (ImageView)findViewById(R.id.imageView);
        new ImageLoadTask(officesLists.get(porsition).getImageHref(),imageView).execute();

        textName = (TextView)findViewById(R.id.textName);
        textName.setText(officesLists.get(porsition).getName());

        textAddress = (TextView)findViewById(R.id.textAddress);
        for (Address address:officesLists.get(porsition).getAddresses()) addreses += address.toString();
        textAddress.setText(addreses);

        textDescription = (TextView)findViewById(R.id.textDescription);
        textDescription.setText(officesLists.get(porsition).getLongDescription());
    }
}
