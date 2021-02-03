public class Derivado extends Base{
  
  @Override
  public int metodo(){
    return 1;
  }

  // Não compila se colocar a linha de baixo!
  // @Override
  public int metodoQueNaoExisteNaClasseBase(){
    return 1;
  }

}