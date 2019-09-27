package id.ac.poliban.mi.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//event handler & event Listener
//using declarative

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void helloOne(View view){
        Toast.makeText(this, "Hello One", Toast.LENGTH_SHORT).show();
    }

    public void helloTwo(View view){
        Toast.makeText(this, "Hello Two", Toast.LENGTH_SHORT).show();
    }

    public void helloThree(View view){
        Toast.makeText(this, "Hello Three", Toast.LENGTH_SHORT).show();
    }

    public void helloFour(View view){
        Toast.makeText(this, "Hello Four", Toast.LENGTH_SHORT).show();
    }
}
