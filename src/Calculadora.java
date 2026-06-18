import javax.swing.*;

public class Calculadora
{
    public int sumar(int num1, int num2)
    {
        return num1 + num2;
    }

    public int restar(int num1, int num2)
    {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2)
    {
        return num1 * num2;
    }

    public double dividir(double num1, double num2)
    {
        return num1 / num2;
    }

    public void esMayor(int num1, int num2)
    {
        if (num1 == num2)
        {
            JOptionPane.showMessageDialog(null, "Los números son iguales (" + num1 + ")");
        }
        else if (num1 > num2)
        {
            JOptionPane.showMessageDialog(null, "El número mayor es: " + num1);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El número mayor es: " + num2);
        }
    }

    public void primo(int num1)
    {
        if (num1 <= 1) {
            JOptionPane.showMessageDialog(null, num1 + " NO es un número primo.");
            return;
        }

        int contadorDivisores = 0;

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                contadorDivisores++;
            }
        }

        if (contadorDivisores == 2) {
            JOptionPane.showMessageDialog(null, num1 + " SÍ es un número primo.");
        } else {
            JOptionPane.showMessageDialog(null, num1 + " NO es un número primo.");
        }
    }

    public static void main(String[] args)
    {
        Calculadora calculadora = new Calculadora();

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero 2"));

        System.out.println("El resultado de la suma es: " + calculadora.sumar(num1, num2));

        calculadora.esMayor(num1, num2);
        calculadora.primo(num1);
    }
}