package exceptional;

public class ExceptionalHandlingEx {
    public void testMygame() throws Exception {

        try {
            int result = divide(1,0);
            System.out.println("Result : " + result);
        } catch (Exception e){
            System.out.println("error divison by zero "+ e.getMessage());
        }
        if (2%3== 0) {
            throw  new Exception() ;
        }

    }
    public int divide(int dividend,int divisor) {
        return dividend/divisor;
    }

}
