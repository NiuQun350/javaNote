package cn.ctgu.title1;

import javax.xml.bind.SchemaOutputResolver;

/**
 * @author NiuQun
 * @2019/11/8
 */

public class Test {
    public static void main(String[] args) {
        /*
        OuterClass.Circle  circle = new OuterClass().new Circle(-1);
        System.out.println(circle.getArea());
         */
        OuterClass.Circle  circle = new OuterClass().new Circle(1);
        System.out.printf("%.2f", circle.getArea());


        ICal anonymous1 = Test.getRectangle(5, 6);
        System.out.println(anonymous1);

    }

    public static ICal getRectangle (double length, double width) {
        return new ICal() {
            private double length;
            private double width;
            private double area;

            /**
             * construction block
             */
            {
                this.length = length;
                this.width = width;
            }

            @Override
            public double getArea() {
                return area;
            }



        };
    }



}
