import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of first number: ");
        int real1 = sc.nextInt();
        int imag1 = sc.nextInt();
        System.out.println("Enter the details of second number: ");
        int real2 = sc.nextInt();
        int imag2 = sc.nextInt();
        Complex f = new Complex(real1, imag1);
        Complex s = new Complex(real2, imag2);
        Complex.add(f, s);
        Complex.diff(f, s);
        Complex.prod(f, s);
    }
}

class Complex {
    int real;
    int imag;
    Complex(int r, int i) {
        this.real = r;
        this.imag = i;
    }
    public static void add(Complex first, Complex second) {
        printComplex(first.real + second.real, first.imag + second.imag);
    }
    public static void diff(Complex first, Complex second) {
        printComplex(first.real - second.real, first.imag - second.imag);
    }

    public static void prod(Complex first, Complex second) {
        printComplex(
                first.real * second.real - first.imag * second.imag,
                first.real * second.imag + first.imag * second.real // imaginary part
        );
    }
    public static void printComplex(int real, int imag) {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (real != 0 && imag == 0) {
            System.out.println(real);
        } else if (real == 0 && imag == 0) {
            System.out.println(0);
        } else if (imag < 0) {
            System.out.println(real + "" + imag + "i"); // handles negative imaginary part
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }
}