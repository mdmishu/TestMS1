package MSStudy.TrappingRainWater;

public class TrappingRainWaterMain {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

        TrappingRainWater tp = new TrappingRainWater();
        int res = tp.trap(arr);
    }
}
