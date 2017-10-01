package com.anmol.ingenuity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }
    public void onClick_Launch(View view) {


        switch (view.getId()) {
            case R.id.sponsor: {
                Intent sponsorintent = new Intent(this, sponsors.class);
                startActivity(sponsorintent);
                break;
            }
            case R.id.events: {
                Intent eventintent = new Intent(this, events.class);
                startActivity(eventintent);
                break;
            }
            case R.id.core: {
                Intent coreintent = new Intent(this, coreTeam.class);
                startActivity(coreintent);
                break;
            }
            case R.id.contact: {
                Intent contactintent = new Intent(this, contactUs.class);
                startActivity(contactintent);
                break;
            }
            case R.id.squads: {
                Intent squadintent = new Intent(this, squads.class);
                startActivity(squadintent);
                break;
            }
            case R.id.tickets: {
                Intent ticketsintent = new Intent(this, insider.class);
                startActivity(ticketsintent);
                break;
            }
            case R.id.gallery: {
                Intent galleryintent = new Intent(this, photos.class);
                startActivity(galleryintent);
                break;
            }
            case R.id.about: {
                Intent aboutintent = new Intent(this, aboutUs.class);
                startActivity(aboutintent);
                break;
            }
        }
    }
}
