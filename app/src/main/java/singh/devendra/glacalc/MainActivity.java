package singh.devendra.glacalc;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.IntBuffer;

public class MainActivity extends AppCompatActivity {
    EditText etOne, etTWO;
    Button btnCalc;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etOne = findViewById(R.id.et_first);
        etTWO = findViewById(R.id.et_second);

        btnCalc = findViewById(R.id.btn_add);

        result = findViewById(R.id.textView);

        result.setText(null);
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String s = etOne.getText().toString();
                int a = Integer.parseInt(etOne.getText().toString().trim());
                int b = Integer.parseInt(etTWO.getText().toString().trim());

                /*Toast.makeText(MainActivity.this, a+b + "",
                        Toast.LENGTH_SHORT).show();*/
                result.setText(Integer.toString(a+b));

            }
        });
    }
}
