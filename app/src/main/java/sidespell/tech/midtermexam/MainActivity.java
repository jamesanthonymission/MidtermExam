package sidespell.tech.midtermexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import sidespell.tech.midtermexam.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    private static final String[] topics = {"Search Album"};

    public static class Topic {
        public static final String KEY = "topic";

       // public static final int SIMPLE_WEATHER = 0;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MainFragment mainFragment = MainFragment.newInstance();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,mainFragment).commit();
    }
}
