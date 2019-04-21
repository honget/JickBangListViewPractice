package com.example.jickbanglistviewpractice;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.jickbanglistviewpractice.Adapters.RoomAdapter;
import com.example.jickbanglistviewpractice.databinding.ActivityMainBinding;
import com.example.jickbanglistviewpractice.datas.Room;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Room> roomList;
    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

        fillData();

        RoomAdapter roomAdapter = new RoomAdapter(MainActivity.this, roomList);
        act.roomList.setAdapter(roomAdapter);

        act.roomList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);

                intent.putExtra("ROOM_DATA", roomList.get(position));

                startActivity(intent);

            }
        });


    }

    void fillData(){

        roomList = new ArrayList<Room>();
//        Room(int deposit, int monthlyRent, int floor, String addr, String roomType, String roomInfo, String imgSrc) {

        roomList.add(new Room(100, 13, 2, "경상북도 구미시 송정동", "분리형 원롬", "(풀옵션 초대박)풀옵션 초대박풀옵션 초대박풀옵션 초대박", null));
        roomList.add(new Room(1300, 15, 3, "서울시 강남구 강남로", " 원롬", "초대박초대박초대박초대박초대박", null));
        roomList.add(new Room(1300, 20, 5, "경상북도 구미시 신평동", "분리형 원롬", "초대박", null));
        roomList.add(new Room(200, 40, 2, "경상북도 구미시 원평동", " 원롬", "풀옵션풀옵션풀옵션풀옵션풀옵션", null));
        roomList.add(new Room(300, 20, 1, "서울시 나동 송정동", "분리형 원롬", "풀옵션", null));
        roomList.add(new Room(1200, 14, 6, "경상남도 가시 가동", "분리형 원롬", "(풀옵션1 초대박)", null));
        roomList.add(new Room(10400, 100, 20, "경상북도 구미시 송정동", "쓰리롬", "(풀옵션2 초대박)", null));
        roomList.add(new Room(10000, 133, 22, "경상북도 구미시 송정동", "원롬", "(풀옵션3 초대박)", null));
        roomList.add(new Room(2400, 10, 4, "경상북도 구미시 송정동", "분리형 원롬", "(풀옵션4 초대박)", null));
        roomList.add(new Room(200, 5, 1, "경상북도 구미시 송정동", " 원롬", "(풀옵션5 초대박)", null));
        roomList.add(new Room(100, 3, -1, "경상북도 구미시 송정동", "분리형 원롬", "(풀옵션6 초대박)", null));
    }
}
