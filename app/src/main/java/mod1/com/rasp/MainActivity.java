package mod1.com.rasp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ctr= findViewById(R.id.crtlbtn),surn=findViewById(R.id.survlbtn);
        ctr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),Control.class);
                startActivity(intent);
            }
        });
        surn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(v.getContext(),surveillance.class);
                startActivity(intent1);
            }
        });
    }
}
