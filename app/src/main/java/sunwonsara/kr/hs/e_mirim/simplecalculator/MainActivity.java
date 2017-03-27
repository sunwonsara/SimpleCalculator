package sunwonsara.kr.hs.e_mirim.simplecalculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit_first;
    EditText edit_second;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_first=(EditText)findViewById(R.id.edit_first);
        edit_second=(EditText)findViewById(R.id.edit_second);
        Button but_plus=(Button)findViewById(R.id.but_plus);
        Button but_minus=(Button)findViewById(R.id.but_minus);
        Button but_multiply=(Button)findViewById(R.id.but_multiply);
        Button but_division=(Button)findViewById(R.id.but_division);
        textResult=(TextView)findViewById(R.id.text_result);

        but_plus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int a=Integer.parseInt(edit_first.getText().toString());
            int b=Integer.parseInt(edit_second.getText().toString());
            textResult.setText("결과 값 : "+(a+b));
            }
        });

        but_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(edit_first.getText().toString());
                int b=Integer.parseInt(edit_second.getText().toString());
                textResult.setText(a-b+"");
            }
        });

        but_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(edit_first.getText().toString());
                int b=Integer.parseInt(edit_second.getText().toString());
                textResult.setText(a*b+"");
            }
        });

        but_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(edit_first.getText().toString());
                int b=Integer.parseInt(edit_second.getText().toString());
                textResult.setText((a/b) +"");
            }
        });


    }


}
