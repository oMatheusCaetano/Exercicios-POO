/******************************************************************************
 * 
 * Escreva a classe ConversaoDeUnidadesDeVolume com métodos estáticos para 
 * conversão das unidades de volume segundo a lista abaixo.
 * 
 * 1 litro = 1000 centímetros cúbicos
 * 1 metro cúbico = 1000 litros
 * 1 metro cúbico = 35.32 pés cúbicos
 * 1 galão americano = 231 polegadas cúbicas
 * 1 galão americano = 3.785 litros
 * 
 *****************************************************************************/

/**
 *
 * @author CaetanoMatheus
 */
public class ConversaoDeUnidadesDeVolume {
    
    /*************************************************************************
     * Methods
     ************************************************************************/
    public static double cm3(double litros){
        return litros * 1000;
    }
    
    public static double litros(double metroCubico){
        return metroCubico * 1000;
    }
    
    public static double pol3(double galaoAmericano){
        return galaoAmericano * 231;
    }
    
    public static double litrosG(double galaoAmericano){
        return galaoAmericano * 3.785;
    }
}
