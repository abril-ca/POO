import static java.lang.Math.*;

public class Ponto
{
    private double x, y;

    public double distancia(Ponto a)
    {
        return sqrt(pow(a.x-this.x,2)+pow(a.y-this.y,2));
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
}