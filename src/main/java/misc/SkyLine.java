package misc;

/**
 * Created by huzefa on 4/17/17.
 */
public class SkyLine {

    class BuildingPoint implements Comparable<BuildingPoint> {
        int x;
        int y;
        boolean isStart;

        BuildingPoint(int x, int y, boolean isStart) {
            this.x = x;
            this.y = y;
            this.isStart = isStart;
        }

        @Override
        public int compareTo(BuildingPoint that) {
            if (this.x != that.x) {
                return this.x - that.x;
            }
            return (this.isStart ? -this.y : this.y) - (that.isStart ? that.y : -that.y);
        }

    }
}
