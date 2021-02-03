// Palavras reservadas importantes nesse caso:

// class
// extends
// final
// new
// super
// this

// Documentação oficial sobre overriding
// https://docs.oracle.com/javase/tutorial/java/IandI/override.html

// Usei retorno inteiro pra facilitar no bytecode
// 0 = base
// 1 = derivado

public class Main{
  public static void main(String[] args){
    Base objetoBase = new Base();
    Derivado objetoDerivado = new Derivado();
    Base objetoDerivadoComPolimorfismo = new Derivado();

    System.out.println("PRIMEIRO TESTE: imprime()");
    objetoBase.metodo();
    objetoDerivado.metodo();
    objetoDerivadoComPolimorfismo.metodo();

    System.out.println("SEGUNDO TESTE: imprimeFinal()");
    objetoBase.metodoFinal();
    objetoDerivado.metodoFinal();
    objetoDerivadoComPolimorfismo.metodoFinal();

    System.out.println("TERCEIRO TESTE: experimentaComBase");
    experimentaComBase(objetoBase);
    experimentaComBase(objetoDerivado);
    experimentaComBase(objetoDerivadoComPolimorfismo);
  }

  public static void experimentaComBase(Base objeto){
    int x,y,z;
    x = objeto.metodo();
    y = objeto.metodoFinal();
    z = Base.metodoStatic();
    z = Derivado.metodoStatic();
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println();
  }
}