
public class SurdMethods {

  public Surd multiplySurds(Surd surdOne, Surd surdTwo) {
    long[] surdArrayOne = surdOne.getSurd();
    long[] surdArrayTwo = surdTwo.getSurd();

    if (surdArrayOne[2] != surdArrayTwo[2]) {
      System.out.println("This particular surd program has not been programmed to multiply"
      + " Surds of different irrational part yet.");
      return surdOne;
    }

    Surd multSurd = new Surd(surdArrayOne[0]*surdArrayTwo[0] + surdArrayOne[2]
      *surdArrayOne[1]*surdArrayTwo[1], surdArrayOne[0]*surdArrayTwo[1] + surdArrayOne[1] * surdArrayTwo[0],
        surdArrayOne[2]);

    return multSurd;

  }

  public Surd multiplyScalar(Surd surd, long scalar) {
    long[] surdArray = surd.getSurd();
    Surd scalarSurd = new Surd(scalar*surdArray[0], scalar*surdArray[1], surdArray[2]);
    return scalarSurd;
  }

  public Surd addSurds(Surd surdOne, Surd surdTwo) {
    long[] surdArrayOne = surdOne.getSurd();
    long[] surdArrayTwo = surdTwo.getSurd();

    if (surdArrayOne[2] != surdArrayTwo[2]) {
      System.out.println("This particular surd program has not been programmed to add"
      + " Surds of different irrational part yet.");
      return surdOne;
    }

    Surd addSurd = new Surd(surdArrayOne[0] + surdArrayTwo[0], surdArrayOne[1] + surdArrayTwo[1], surdArrayOne[2]);

    return addSurd;

  }

  public Surd subtractSurds(Surd surdOne, Surd surdTwo) {
    long[] surdArrayOne = surdOne.getSurd();
    long[] surdArrayTwo = surdTwo.getSurd();

    if (surdArrayOne[2] != surdArrayTwo[2]) {
      System.out.println("This particular surd program has not been programmed to add"
      + " Surds of different irrational part yet.");
      return surdOne;
    }

    Surd addSurd = new Surd(surdArrayOne[0] - surdArrayTwo[0], surdArrayOne[1] - surdArrayTwo[1], surdArrayOne[2]);

    return addSurd;

  }

  public long surdToInteger(Surd surd) {
    if (surd.getSurd()[1] != 0) {
      System.out.println("This surd could not be converted to an integer"); //note that for our problem, this should never happen.
      System.out.println("Irrational part has prefactor " + surd.getSurd()[1] );
      return 0;
    }

    return surd.getSurd()[0];

  }

}
