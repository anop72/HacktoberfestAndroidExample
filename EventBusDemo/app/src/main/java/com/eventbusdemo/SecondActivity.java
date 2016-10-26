package com.eventbusdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import de.greenrobot.event.EventBus;

public class SecondActivity extends AppCompatActivity {

    EventBus bus=EventBus.getDefault();
    MessageEvent event;
    AnotherEvent anotherEvent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        event=new MessageEvent("call message");
        anotherEvent=new AnotherEvent("another");

        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //bus.post(event);
                //bus.post(anotherEvent);
            }
        });

    }


}
