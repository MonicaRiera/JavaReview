package tech.bts.javaExercises;

public class MainStats {
    public static void main(String[] args) {

        Stats stats = new Stats();

        stats.add(8.0);
        stats.add(7.0);
        stats.add(5.0);
        stats.add(4.0);

        System.out.println(stats.getSum());
        System.out.println(stats.getCount());
        System.out.println(stats.getAverage());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());

        StatsWithoutList stats2 = new StatsWithoutList();

        stats2.add(8.0);
        stats2.add(7.0);
        stats2.add(5.0);
        stats2.add(4.0);

        System.out.println(stats2.getSum());
        System.out.println(stats2.getCount());
        System.out.println(stats2.getAverage());
        System.out.println(stats2.getMax());
        System.out.println(stats2.getMin());

    }
}
