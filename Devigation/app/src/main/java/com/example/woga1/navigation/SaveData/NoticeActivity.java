package com.example.woga1.navigation.SaveData;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.woga1.navigation.MainActivity;
import com.example.woga1.navigation.R;

public class NoticeActivity extends AppCompatActivity {
    //공지사항 Activity

    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
        Button testButton = (Button) findViewById(R.id.testButton);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xFFFFFFFF));
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_notificationbar);

        testButton.setOnClickListener(new EditText.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(count%3==0) {
                    ((MainActivity) MainActivity.mContext).sendMessage("100 14.");
                    count++;
                }else if(count%3==1) {
                    ((MainActivity) MainActivity.mContext).sendMessage("100 12.");
                    count++;
                }else if(count%3==2) {
                    ((MainActivity) MainActivity.mContext).sendMessage("100 13.");
                    count++;
                }
            }
        });




    }

}
