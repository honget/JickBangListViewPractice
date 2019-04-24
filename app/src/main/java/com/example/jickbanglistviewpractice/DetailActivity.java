package com.example.jickbanglistviewpractice;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jickbanglistviewpractice.databinding.ActivityDetailBinding;
import com.example.jickbanglistviewpractice.datas.Room;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding act;

    Room roomData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        act = DataBindingUtil.setContentView(this, R.layout.activity_detail );

        roomData = (Room)getIntent().getSerializableExtra("ROOM_DATA");

        if(roomData.getMonthlyRent() == 0){

            act.monthlyRantTxt.setText(String.format("전세 %d", roomData.getDeposit()));
        }else{
            act.monthlyRantTxt.setText(String.format("월세 %d/%d", roomData.getDeposit(), roomData.getMonthlyRent()));
        }

        act.roomInfoTxt.setText(roomData.getRoomInfo());
        act.roomTypeTxt.setText(roomData.getRoomType());
        act.floorTxt.setText(String.format("%d층", roomData.getFloor()));


        //버튼 기능 추가
        act.dialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri phoneUri =  Uri.parse("tel:010-1234-5678");

                Intent intent = new Intent(Intent.ACTION_DIAL, phoneUri);

                startActivity(intent);

            }
        });

    }
}
