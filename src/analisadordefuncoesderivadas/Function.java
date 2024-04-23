/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisadordefuncoesderivadas;

/**
 *
 * @author Gabriel Fernandes
 */
public class Function {
    private final String expression;
    
    public Function(String expression) {
        this.expression = expression;
    }
    
    public String getExpression() {
        return expression;
    }
    
    
    //metodo para calcular a derivada da função
    public String derivate() {
        String[] terms = expression.split("\\+");
        StringBuilder derivative = new StringBuilder();
        
        for (String term : terms) {
            term = term.trim(); //limpa espaço em branco
            if (term.contains("x")){
                int xIndex = term.indexOf("x");
                int coeficiente = 1;
                int power = 1;
                
                //se houver coeficiente antes de " X "
                if (xIndex > 0) {
                    String coefPart = term.substring(0, xIndex);
                    coeficiente = Integer.parseInt(coefPart.trim());
                }
                
                //verifica se ha expoente
                if (term.contains("^")){
                    int powIndex = term.indexOf("^");
                    power = Integer.parseInt(term.substring(powIndex + 1));
                }else if(term.equals("x")){
                    power = 1;
                }else if (xIndex > 0) {
                    power = 1;
                }
                
                //Calcular a derivada do termo atual
                if (power == 1) {
                    derivative.append(coeficiente).append(" + ");
                }else {
                    derivative.append(coeficiente * power).append("x^").append(power - 1).append(" + ");
                    
                }
            }else {
                //Termos das constantes tem derivadas zero
                //Nenhuma ação necessaria, pois a derivada de uma constante é 0
            }
        }
        
        //remove o ultimo ' + ' se nescessario
        if (derivative.length() > 0){
            derivative.setLength(derivative.length() - 3);
        }
        
        return derivative.toString();
    }
    
}
