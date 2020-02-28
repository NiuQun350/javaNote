package cn.ctgu.title1;

/**
 * @author NiuQun
 * @2019/11/8
 */

public class OuterClass {

    /**
     * ICal is a member Inner class
     */
    class Circle implements ICal{
        private double radius;
        private double area;

        public Circle(double radius) {
            this.radius = radius;
            if (isICal()) {
                this.area = PI * radius * radius;
            } else {
                throw new RuntimeException("The radius of the circle is less than 0");
            }
        }

        @Override
        public double getArea() {
            return area;
        }

        public boolean isICal() {
            return radius > 0;
        }
    }
}
