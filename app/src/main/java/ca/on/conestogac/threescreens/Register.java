package ca.on.conestogac.threescreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;



/**
 * Created by Sydney on 2017-09-28.
 */

public class Register extends Activity
{

    /*declare some variable*/
    Button login;
    EditText userName, userPassword, userEmail, userCountry;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_register);

        /*initialize the variables*/
        login=(Button) findViewById(R.id.btnLogin);
        userName=(EditText)findViewById(R.id.username);
        userPassword=(EditText)findViewById(R.id.password);
        userEmail = (EditText)findViewById(R.id.email);
        userCountry = (EditText)findViewById(R.id.country);


         /*setting onclick event*/
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                login(); /*call the function here*/
            }
        });

    }

    /*create a function*/
    public void login()
    {
        String user = userName.getText().toString().trim();
        String password = userPassword.getText().toString().trim();
        String email = userEmail.getText().toString().trim();
        String country = userCountry.getText().toString().trim();

        /*check*/

        if(user.equals("Admin") && password.equals("password")
                && email.equals("senebeli5891@conestogac.on.ca") && country.equals("Canada"))
        {
            Toast.makeText(this, "You have Successfully logged in!", Toast.LENGTH_LONG).show();

        }

        else

        {
            Toast.makeText(this, "Wrong User Name or Password", Toast.LENGTH_LONG).show();

        }
    }
}
