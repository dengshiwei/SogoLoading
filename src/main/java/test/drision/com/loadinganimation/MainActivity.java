package test.drision.com.loadinganimation;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends ActionBarActivity {
    private SoGouBrowserLoading loadingView;
    private Button btn_changeColor;
    private int colors[] = new int[]{
        Color.parseColor("#ff0000"),Color.parseColor("#00ff00"),
        Color.parseColor("#0000ff"),Color.parseColor("#ffff00")
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_changeColor = (Button) findViewById(R.id.btn_changeColor);
        loadingView = (SoGouBrowserLoading) findViewById(R.id.loadingView);
        btn_changeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = (int) (Math.random() * 4);
                loadingView.setColor(colors[index]);
            }
        });
    }
}
