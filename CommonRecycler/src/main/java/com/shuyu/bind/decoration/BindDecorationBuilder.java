package com.shuyu.bind.decoration;

import android.graphics.Paint;

import com.shuyu.bind.BindRecyclerAdapter;

/**
 * Created by guoshuyu on 2017/8/31.
 */

public class BindDecorationBuilder {
    private BindRecyclerAdapter bindRecyclerAdapter;

    private Paint paint = null;

    private int space = -1;

    private int color = -1;

    public BindDecorationBuilder(BindRecyclerAdapter bindRecyclerAdapter) {
        this.bindRecyclerAdapter = bindRecyclerAdapter;
    }

    public BindDecorationBuilder setPaint(Paint paint) {
        this.paint = paint;
        return this;
    }

    public BindDecorationBuilder setSpace(int space) {
        this.space = space;
        return this;
    }

    public BindDecorationBuilder setColor(int color) {
        this.color = color;
        return this;
    }

    public BindItemDecoration builder() {
        BindItemDecoration bindItemDecoration = new BindItemDecoration(bindRecyclerAdapter);
        if (space != -1) {
            bindItemDecoration.setSpace(space);
        }
        if (color != -1) {
            bindItemDecoration.setColor(color);
        }
        if (paint != null) {
            bindItemDecoration.setPaint(paint);
        }
        return bindItemDecoration;
    }
}