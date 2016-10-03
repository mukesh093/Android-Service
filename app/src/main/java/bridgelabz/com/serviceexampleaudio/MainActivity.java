package bridgelabz.com.serviceexampleaudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button start,stop,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.button);
        stop = (Button) findViewById(R.id.button1);
        next = (Button) findViewById(R.id.button2);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    public void onClick(View src) {
        switch (src.getId()) {
            case R.id.button:
                startService(new Intent(this, MyService.class));
                break;
            case R.id.button1:
                stopService(new Intent(this, MyService.class));
                break;
            case R.id.button2:
                Intent intent=new Intent(this,NextPage.class);
                startActivity(intent);
                break;
        }
    }
}
