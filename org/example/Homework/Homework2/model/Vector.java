package org.example.Homework.Homework2.model;

public class Vector {

    private Double x;

    private Double y;

    private Double z;

    public Vector(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Vector [x=" + x + ", y=" + y + ", z=" + z + "]";
    }

    /**
     * @return длинну вектора
     */
    public double lenghtVector() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    /**
     * @param vector2 второй вектор для произведения
     * @return скалярное произведение векторов
     */
    public double scalarMulti(Vector vector2) {
        return this.x * vector2.x + this.y * vector2.y + this.z * vector2.z;
    }

    /**
     * 
     * @param vector2 второй вектор для произведения
     * @return вектороное произведение
     */
    public Vector vectorMulti(Vector vector2) {
        return new Vector(this.y * vector2.z - this.z * vector2.y,
                this.z * vector2.x - this.x * vector2.z,
                this.x * vector2.y - this.y * vector2.z);
    }

    /**
     * 
     * @param vector2 второй вектор
     * @return косинус угла между векторов
     */
    public double cosVector(Vector vector2) {
        return scalarMulti(vector2) / (lenghtVector() * vector2.lenghtVector());
    }

    /**
     * 
     * @param vector2 второй вектор
     * @return сумма векторов
     */
    public Vector vectorSumm(Vector vector2) {
        return new Vector(this.x + vector2.x, this.y + vector2.y, this.z + vector2.z);
    }

    /**
     * 
     * @param vector2 второй вектор
     * @return разность векторов
     */
    public Vector vectorDifference(Vector vector2) {
        return new Vector(this.x - vector2.x, this.y - vector2.y, this.z - vector2.z);
    }

}
