public class uchiha extends ninja{
    public void sharinganAtivado(){
        System.out.println("Sharingan Ativado!");
    }


    @Override //Polimorfismo
    public void ataqueBasico(){
        System.out.println("Ataque básico, toma uma kunai de FOGO!");
    }
    
    public void ataqueBasico(int nivelChakra){
        if (nivelChakra > 20){
            System.out.println("Susano Ativado!");
        } else if (nivelChakra > 5 && nivelChakra < 19) {
            System.out.println("Jutsu Bola de Fogo!");
        }else {
            System.out.println("Estou sem chakra!");
        }
    }
}
