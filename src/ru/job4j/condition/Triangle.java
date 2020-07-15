package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        if (ab <= 0 || ac <= 0 || bc <= 0) {
            return false;
        }

        return ((ab + ac) > bc && (ab + bc) > ac && (bc + ac) > ab);

    }
}
