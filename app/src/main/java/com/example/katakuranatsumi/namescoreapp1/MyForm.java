package com.example.katakuranatsumi.namescoreapp1;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MyForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_form);
    }

    public void getScore(View view){
        //　　EditTextを取得 　　
        EditText myEditText = (EditText) findViewById(R.id.myEditText);

        //  　EditTextの中身を取得
        String myName = myEditText.getText().toString().trim();

        //   中身を見て条件分岐
        if(myName.equals("")){
        //   エラー処理

        myEditText.setError("Please enter your name!");
//        Toast.makeText(
//             this,
//                "Please enter your name!",
//                Toast.LENGTH_SHORT
//        ).show();
//            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
//            alertDialogBuilder
//                    .setTitle("Error!")
//                    .setMessage("Please enter your name!")
//                    .setPositiveButton("OK!", null);
//
//            AlertDialog alertDialog = alertDialogBuilder.create();
//            alertDialog.show();

        } else{
        // 次の画面へ
        }
    }

}
