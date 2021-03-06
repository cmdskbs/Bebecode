package DataStructure;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by SuperSong on 2017-04-07.
 */

public class CustomViewPager extends ViewPager {

    private boolean enabled; //이 것이 스크롤을 막아주는 중요 변수!

    public CustomViewPager(Context context, AttributeSet attrs) {

        super(context, attrs);

        //this.enabled = true;
        this.enabled = false; // disable scroll
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        try {
            if (this.enabled) {
                return super.onTouchEvent(event);
            }
        } catch (Exception e) {

        }

        return false;
    }



    @Override

    public boolean onInterceptTouchEvent(MotionEvent event) {

        // always scroll disabled

        if (this.enabled) {
            return super.onInterceptTouchEvent(event);
        }

        return false;
    }



    public void setPagingEnabled() { //이 메소드를 이용해서 스크롤을 풀어주고
        this.enabled = true;
    }



    public void setPagingDisabled() { //이 메소드를 이용해서 스크롤을 막아줍니다.

        this.enabled = false;

    }

}
