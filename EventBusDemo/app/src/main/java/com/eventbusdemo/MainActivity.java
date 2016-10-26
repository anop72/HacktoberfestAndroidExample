package com.eventbusdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import de.greenrobot.event.EventBus;

public class MainActivity extends AppCompatActivity {

    EventBus bus = EventBus.getDefault();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bus.register(this);

        startActivity(new Intent(this, SecondActivity.class));

    }

    @Override
    protected void onDestroy() {
        bus.unregister(this);
        super.onDestroy();
    }

    public void onEvent(MessageEvent event) {
        Log.e("message", event.message);
    }

    public void onEvent(AnotherEvent event) {
        Log.e("message", event.message);
    }

    public void onEvent(String message)
    {
        Log.i("message", message);
    }

    public void onEvent(PersonClass person)
    {
        Log.i("Name of person is : ", person.getName());
    }

}
