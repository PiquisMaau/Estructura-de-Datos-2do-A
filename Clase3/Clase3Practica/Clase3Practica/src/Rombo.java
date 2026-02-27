public class Rombo extends Figura{
float DiagonalMayor, DiagonalMenor;

public Rombo(float diagonalMayor, float diagonalMenor) {
    DiagonalMayor = diagonalMayor;
    DiagonalMenor = diagonalMenor;
}

@Override
float area() {
    return (this.DiagonalMayor * this.DiagonalMenor)/2;
}


}
