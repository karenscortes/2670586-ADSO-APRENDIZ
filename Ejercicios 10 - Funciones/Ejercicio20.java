public class Ejercicio20{

    public static void main(String[] args){
        System.out.println("Area del triangulo = "+ areaTriangulo(5,6) ); 
        System.out.println("Area del triangulo = "+ areaTriangulo(4,10) ); 
        System.out.println("Area del triangulo = "+ areaTriangulo(8,4) ); 
    }

    public static int areaTriangulo(int base, int altura){
        
        int area= (base*altura)/2;
        
        return area;
    }
}