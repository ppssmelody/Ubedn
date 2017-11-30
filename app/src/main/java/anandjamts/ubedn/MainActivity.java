package anandjamts.ubedn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button seeInfo;
    Button editInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setSeeInfo(View view){
        Intent intent = new Intent(this, SeeInfo.class);
        startActivity(intent);
    }
    public void setEditInfo(View view){
        Intent intent = new Intent(this, EditInfo.class);
        startActivity(intent);
    }
}
