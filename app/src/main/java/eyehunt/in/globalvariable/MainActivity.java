package eyehunt.in.globalvariable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApplication application=(MyApplication)getApplication();
        String globalVarValue=application.globalVariable;
        Toast.makeText(MainActivity.this,globalVarValue,Toast.LENGTH_LONG).show();
    }
}
