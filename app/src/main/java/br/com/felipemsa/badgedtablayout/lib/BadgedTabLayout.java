package br.com.felipemsa.badgedtablayout.lib;

import android.content.Context;
import android.graphics.Canvas;
import android.support.design.widget.TabLayout;
import android.util.AttributeSet;

/**
 * Created by felipe.almeida on 11/12/15.
 */
public class BadgedTabLayout extends TabLayout {
    public BadgedTabLayout(Context context) {
        super(context);
    }

    public BadgedTabLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BadgedTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
