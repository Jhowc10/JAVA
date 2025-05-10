/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jhow.matematica;

/**
 *
 * @author tatia
 */
public class Trigonometria {
    
    public float areaTriangulo(float base, float altura){
        
        // Chama a clase OperacoesAtitimeticas
        OperacoesAritimeticas oa = new OperacoesAritimeticas();
        
        // Área do triangulo = (base x altura) / 2;
        // Usa o objeto oa para multiplicar
        float area = oa.multiplica(base, altura) / 2;
        return area;
    }
}
