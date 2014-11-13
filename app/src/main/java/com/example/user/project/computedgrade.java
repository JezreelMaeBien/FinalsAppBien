package com.example.user.project;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.user.project.R;

public class computedgrade extends ActionBarActivity {
    double finalFinal,finalPrelim,finalQuiz,finalStwk,finalAssign,FinalGrade;

    public void setFinalGrade(double finalGrade) {
        FinalGrade = finalFinal+finalPrelim+finalQuiz+finalStwk+finalAssign ;
            }

    public void FinalEqui(View view) {
        Intent intent = new Intent(this, finalandeq.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computedgrade);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.computedgrade, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
