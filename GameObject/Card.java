package com.stephensheng.game2048;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {

    public Card(Context context) {
        super(context);

        label = new TextView(getContext());
        label.setTextSize(32);
        label.setBackgroundColor(0x33ffffff);
        label.setGravity(Gravity.CENTER);

        LayoutParams lp = new LayoutParams(-1, -1);
        lp.setMargins(10, 10, 0, 0);
        addView(label, lp);

        setNum(0);
    }


    private int num = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;

        if (num<=0) {
            label.setText("");
        }else{
            label.setText(num+"");
        }
    }

    public void changeColor(){

        switch (this.getNum()){
            case 4: this.label.setTextColor(Color.BLUE);
                break;
            case 8: this.label.setTextColor(Color.GRAY);
                break;
            case 16: this.label.setTextColor(Color.BLACK);
                break;
            case 32: this.label.setTextColor(Color.DKGRAY);
                break;
            case 64: this.label.setTextColor(Color.MAGENTA);
                break;
            case 128: this.label.setTextColor(Color.RED);
                break;
            case 256: this.label.setTextColor(Color.YELLOW);
                break;
            case 512: this.label.setTextColor(Color.CYAN);
                break;
            case 1024: this.label.setTextColor(Color.LTGRAY);
                break;
            case 2048:
            case 4096:
            case 8192: this.label.setTextColor(Color.BLACK);
                break;
            default:
                this.label.setTextColor(Color.BLACK);
                break;
        }

    }

    public boolean equals(Card o) {
        return getNum()==o.getNum();
    }

    private TextView label;
}
