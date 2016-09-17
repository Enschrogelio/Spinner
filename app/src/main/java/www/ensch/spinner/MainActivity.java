package www.ensch.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] Pokemon;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pokemon=getResources().getStringArray(R.array.Pokemon);

        Spinner spinner= (Spinner) findViewById(R.id.spinner);
        spinner.setPrompt("Elija un Pokemon");
        tv=(TextView) findViewById(R.id.textView2);

        int resource1=android.R.layout.simple_spinner_dropdown_item;
        int resource2=android.R.layout.simple_spinner_item;
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,resource2,Pokemon);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                               long arg3) {
        // TODO Auto-generated method stub

        tv.setText("Tu pokemon es: "+Pokemon[arg2]);

    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
}