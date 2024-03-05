package figuras;

public class Circunferencia {

    private double rad;
    private String color;
    public double PI;

    public Circunferencia(double radio) {
        this.rad = radio;
        PI = 3.14;
    }

    public void imprimir() {
        color = "rojo";
        System.out.println("Diametro: " + 2 * getRad());
        System.out.println("Color: " + color);
        System.out.println(2 * PI * getRad() * getRad());
    }
    

    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.getRad();
        double radio2 = otro.getRad();
        if (considerarDecimales) {
            if (radio1 == radio2) {
                return true;
            } else {
                return false;
            }
        } else {
            if (Math.abs(radio1 - radio2) < 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * @return the rad
     */
    public double getRad() {
        return rad;
    }

    /**
     * @param rad the rad to set
     */
    public void setRad(double radio) {
        this.rad = radio;
    }
}
