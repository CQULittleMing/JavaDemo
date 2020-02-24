import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String originalText = "WindowStateAnimator{ddd1c5f GestureStub}:\n" +
                "      mSurface=Surface(name=GestureStub)/@0x863fce0\n" +
                "      Surface: shown=true layer=0 {1becabd u0 StatusBar} rect=(0.0,0.0) 1080 x 50 transform=(1.0, 0.0, 1.0, 0.0)\n" +
                "      mDrawState=HAS_DRAWN       mLastHidden=false\n" +
                "      mSystemDecorRect=[0,0][1080,50] mLastClipRect=[0,0][1080,50]\n" +
                "      mHandleByGesture=false\n" +
                "    mForceSeamlesslyRotate=false {1becabd u0 StatusBar}: pending=null finishedFrameNumber=0\n" +
                "    isOnScreen=true\n" +
                "    isVisible=true\n" +
                "    mMiuiNotFocusable=false\n" +
                "    mMiuiNotTouchModal=false\n" +
                "  Window #5 Window{1becabd u0 GestureStubLeft}:";
        Pattern pat = Pattern.compile("(\\{.+ (StatusBar|GestureStub|GestureStubLeft)\\})");
        Matcher mat = pat.matcher(originalText);
        int i = 0;
        while(mat.find()){
            i++;
            System.out.println("匹配出来："+mat.group(1));
        }
    }
}
