package _03_day;



/// a complex question
public class TowerBreakers {
    public static int towerBreakers(int n, int m) {

        return (n % 2 == 0 || m == 1) ? 2 : 1;

    }
}
