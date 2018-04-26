package cat.flx.plataformes;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.widget.Button;

public class MyButtonClass extends android.support.v7.widget.AppCompatButton {
    public MyButtonClass(Context context) {
        super(context);

        // Here you can set a default parameters for this View, e.g.:
        this.setText("My Green Button...");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // Here you need to declare what paint you canvas, e.g.:
        canvas.drawColor(Color.GREEN); // Set color
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),
                R.raw.pausee), 0f, 0f, null); // Set drawable
        // .......... set others

        super.onDraw(canvas);
    }
}
