package bear.coding.datalec;

import  android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView stack = (ImageView) findViewById(R.id.Stack);
        ImageView Queue = (ImageView)findViewById(R.id.Queue);
        ImageView dev = (ImageView)findViewById(R.id.dev);

        stack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Stack = new Intent(MainActivity.this, StackActivity.class);
                startActivity(Stack);
            }
        });

        Queue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Queue = new Intent(MainActivity.this, QueueActivity.class);
                startActivity(Queue);
            }
        });

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent developer = new Intent(MainActivity.this, DevActivity.class);
                startActivity(developer);
            }
        });
    }
}
