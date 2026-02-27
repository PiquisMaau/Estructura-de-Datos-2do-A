public class Rectangulo extends Figura {
float base, altura;

public Rectangulo(float base, float altura) {
    this.base = base;
    this.altura = altura;
}

@Override
float area() {
    return this.base * this.altura;
}

}
