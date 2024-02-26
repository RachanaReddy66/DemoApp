package in.co.visiontek.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button okBtn;
    EditText edtTxt;
    Textview txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("===== onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity","onCreate");

        edtTxt=findViewById(R.id.name_editText);
        okBtn=findViewById(R.id.ok_btn);
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String enteredName = okBtn.getText().toString();
//
//                Intent intent = new Intent();
//                /*intent.setAction("in.co.visiontek.appnavigation.ACTION_NAME");*/
//                intent.putExtra("name", enteredName);
//
//                if(edtTxt.length()==0){
//                    Toast.makeText(MainActivity.this, "enter Name..!", Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    intent=getPackageManager().getLaunchIntentForPackage("in.co.visiontek.appnavigation");
//                }
//
//               //intent=getPackageManager().getLaunchIntentForPackage("in.co.visiontek.appnavigation");
//
//                try {
//                    startActivity(intent);
//                } catch (android.content.ActivityNotFoundException e) {
//                    System.out.println("Activity not found" +e);
//                }



                Intent intent = new Intent();
                intent.putExtra("EditText_Value", edtTxt.getText().toString().trim());
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("onStart");
        Log.e("MainActivity","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity","onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity","onPause");
    }

    @Override
    protected void onResume() {
        System.out.println("=== onResume");
        super.onResume();
        Log.e("MainActivity","onResume");
        //System.out.println("onresume**********");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MainActivity","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity","onDestroy");
    }
}
