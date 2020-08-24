import java.lang.Math;

public class ProjectEuler94 {

  public static void main(String []args) {

    SurdMethods sM = new SurdMethods();

    Surd rootThree = new Surd(0,1,3);

    Surd lambdaPlus = new Surd(2,1,3);
    Surd lambdaMinus = new Surd(2,-1,3);

    Surd kLambdaPlus = new Surd(1,0,3);
    Surd kLambdaMinus = new Surd(1,0,3);

    long perimeterLimit = 1000000000;
    long perimeterTotal = 0;

    double upperBound = Math.log(perimeterLimit)/Math.log(2+Math.sqrt(3));

    long x;
    long y;

    for (int k=0; k<upperBound; k++) {
      x = (long)sM.surdToInteger(sM.addSurds(kLambdaPlus, kLambdaMinus))/2;

      y = (long) sM.surdToInteger(sM.multiplySurds(rootThree, sM.subtractSurds(kLambdaPlus, kLambdaMinus)))/6;

      //kLambdaPlus.printSurd();
      //kLambdaMinus.printSurd();

      if ((2*x -1)%3 == 0 ) { //short triangle
        if ((((2*x-1)/3-1)*y)%2 == 0 && ((2*x-1)/3-1)*y != 0) {
          if ((2*x-1)-1 < perimeterLimit) {
            perimeterTotal += 2*x-2;
          }
        }
      } else if ((2*x+1)%3 == 0) { //long triangle
        if ((((2*x+1)/3+1)*y)%2 == 0 && ((2*x+1)/3+1)*y!=0) {
          if ((2*x+1) + 1 < perimeterLimit) {
            perimeterTotal += 2*x + 2;
          }
        }
      }

      kLambdaPlus = sM.multiplySurds(kLambdaPlus, lambdaPlus);
      kLambdaMinus = sM.multiplySurds(kLambdaMinus, lambdaMinus);
      //System.out.println("The value of k is : " + k );
    }

    System.out.println("" + perimeterTotal);

  }

}
