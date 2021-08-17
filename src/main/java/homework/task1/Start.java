package homework.task1;

public class Start {
    public static void main(String[] args) {
        try {
            ImplementationOfSuperIntegerList testObj = new ImplementationOfSuperIntegerList();
            for (int i = 0; i < 15; i++){
                testObj.add(i);
            }
            testObj.printAll();
            System.out.println();
            testObj.removeByIndex(1);
            testObj.printAll();
            testObj.removeByIndex(0);
            System.out.println();
            testObj.printAll();
            testObj.removeByIndex(12);
            System.out.println();
            testObj.printAll();
            testObj.removeByValue(10);
            System.out.println();
            testObj.printAll();
            System.out.println();
            System.out.println(testObj.get(7));
            testObj.removeByValue(13);
            System.out.println();
            testObj.printAll();
            testObj.removeByValue(2);
            System.out.println();
            testObj.printAll();
            ImplementationOfSuperIntegerList eqTestObj = new ImplementationOfSuperIntegerList();
            for (int i = 0; i < 5; i++) {
                eqTestObj.add(3);
            }
            eqTestObj.removeByValue(3);
            System.out.println();
            eqTestObj.printAll();
            eqTestObj.add(3);
            eqTestObj.add(3);
            eqTestObj.add(4);
            System.out.println();
            eqTestObj.printAll();
            eqTestObj.removeByValue(3);
            System.out.println();
            eqTestObj.printAll();
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println();
            System.out.println(ex.getMessage());
        }
    }
}
