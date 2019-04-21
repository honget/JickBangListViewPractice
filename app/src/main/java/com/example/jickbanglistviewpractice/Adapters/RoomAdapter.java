package com.example.jickbanglistviewpractice.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.jickbanglistviewpractice.R;
import com.example.jickbanglistviewpractice.datas.Room;

import java.util.List;

public class RoomAdapter extends ArrayAdapter<Room> {

    Context context;
    List<Room> roomList;

    LayoutInflater inf;

    public RoomAdapter(Context context, List<Room> roomList){

        super(context, R.layout.room_item_list, roomList);

        this.context = context;
        this.roomList = roomList;

        inf = LayoutInflater.from(context);
    }


    @Override
    public View getView(int position, View row, ViewGroup parent) {

        if(row == null){
            row = inf.inflate(R.layout.room_item_list, null);
        }

        Room roomData = roomList.get(position);


        return row;
    }
}
