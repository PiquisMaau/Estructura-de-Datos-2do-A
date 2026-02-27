
public class Círculo extends Figura{
    float radio;

    public Círculo(float radio) {
        this.radio = radio;
    }
    
    
    @Override
    float area() {
       return (float)(Math.PI * Math.pow(this.radio, 2));
    }
    
}
