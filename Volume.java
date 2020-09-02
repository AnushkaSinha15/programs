class Volume
{
    public static double volume(double s)
    {
        return s * s * s;
    }
    public static double volume(double p, double r)
    {
        return 4.0 / 3 * p * r * r * r;
    }
    public static double volume(double l, double b, double h)
    {
        return l * b * h;
    }
}