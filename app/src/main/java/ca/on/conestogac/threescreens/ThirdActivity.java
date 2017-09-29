package ca.on.conestogac.threescreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends Activity

{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_third);

         //i want to get the intent sent from Sceond Screen
        Intent dataFromSecondScreen = getIntent();

        Bundle bundle = dataFromSecondScreen.getExtras();

        String myMessage = bundle.getString("message");


        TextView memberName = (TextView) findViewById(R.id.messageFromSecondScreen);

        memberName.setText(myMessage);
    }
}
