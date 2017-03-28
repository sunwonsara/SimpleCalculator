package sunwonsara.kr.hs.e_mirim.simplecalculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity /* | 방법 2(*)_1 | implements View.OnClickListener*/ {
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

       /* | 방법 2(*)_2 |
        but_plus.setOnClickListener(this);
        but_minus.setOnClickListener(this);
        but_multiply.setOnClickListener(this);
        but_division.setOnClickListener(this);
      */

        // | 방법 3. 익명클래스를 만들기 |
        but_plus.setOnClickListener(butHandler);
        but_minus.setOnClickListener(butHandler);
        but_multiply.setOnClickListener(butHandler);
        but_division.setOnClickListener(butHandler);

        /*
        | 방법 1 |
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
        */

    } // end oncreat

    View.OnClickListener butHandler=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int a = Integer.parseInt(edit_first.getText().toString());
            int b = Integer.parseInt(edit_second.getText().toString());
            int result = 0;
            switch (v.getId()) {
                case R.id.but_plus:
                    result = a + b;
                    break;
                case R.id.but_minus:
                    result = a - b;
                    break;
                case R.id.but_multiply:
                    result = a * b;
                    break;
                case R.id.but_division:
                    result = a / b;
                    break;
            }
            textResult.setText(result + "");
        }
    };


    /* | 방법 2(*)_3 |
    @Override
    public void onClick(View v) {
        int a=Integer.parseInt(edit_first.getText().toString());
        int b=Integer.parseInt(edit_second.getText().toString());
        int result=0;
        switch (v.getId()){
            case R.id.but_plus : result=a+b; break;
            case R.id.but_minus : result=a-b; break;
            case R.id.but_multiply : result=a*b; break;
            case R.id.but_division : result=a/b; break;
        }
        textResult.setText(result+"");
    }
    */


}
